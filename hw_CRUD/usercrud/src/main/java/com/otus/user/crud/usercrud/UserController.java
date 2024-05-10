package com.otus.user.crud.usercrud;

import com.otus.user.crud.usercrud.dto.*;
import com.otus.user.crud.usercrud.entity.User;
import com.otus.user.crud.usercrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Calendar;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public CreateResponse create(@RequestBody CreateRequest request) {
        var resp = new CreateResponse();
        var user = new User();

        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());

        userRepository.save(user);

        resp.setId(user.id());
        resp.setUsername(user.username());
        resp.setEmail(user.email());
        resp.setFirstName(user.firstName());
        resp.setLastName(user.lastName());
        resp.setEmail(user.email());
        resp.setPhone(user.phone());

        return resp;
    }

    @GetMapping("/{userId}")
    public GetResponse get(@PathVariable Long userId) throws UserNotFoundException {
        var resp = new GetResponse();
        var userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            var user = userOptional.get();
            resp.setId(user.id());
            resp.setUsername(user.username());
            resp.setEmail(user.email());
            resp.setFirstName(user.firstName());
            resp.setLastName(user.lastName());
            resp.setEmail(user.email());
            resp.setPhone(user.phone());

            return resp;
        }

        throw new UserNotFoundException();
    }

    @DeleteMapping("/{userId}")
    public Map delete(@PathVariable Long userId) throws UserNotFoundException {
        var userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            userRepository.delete(userOptional.get());
            return new HashMap();
        }

        throw new UserNotFoundException();
    }

    @PutMapping("/{userId}")
    public UpdateResponse update(@RequestBody UpdateRequest request, @PathVariable Long userId) throws UserNotFoundException {
        var resp = new UpdateResponse();
        var userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) {
            throw new UserNotFoundException();
        }

        var user = userOptional.get();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());

        userRepository.save(user);

        resp.setId(user.id());
        resp.setUsername(user.username());
        resp.setEmail(user.email());
        resp.setFirstName(user.firstName());
        resp.setLastName(user.lastName());
        resp.setEmail(user.email());
        resp.setPhone(user.phone());

        return resp;
    }
}