package com.otus.user.crud.usercrud.repository;

import com.otus.user.crud.usercrud.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
}
