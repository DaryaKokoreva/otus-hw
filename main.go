package main

import (
	"fmt"
	"log"
	"net/http"
)

func hello(w http.ResponseWriter, req *http.Request) {
	fmt.Fprintf(w, "hello\n")
}

func health(w http.ResponseWriter, req *http.Request) {
	w.Header().Set("Content-Type", "application/json")
	fmt.Fprint(w, "{\"status\":\"OK\"}")
}

func main() {
	http.HandleFunc("/hello", hello)
	http.HandleFunc("/health/", health)

	fmt.Println("Hello, World!")
	if err := http.ListenAndServe(":8000", nil); err != nil {
		log.Fatal(err)
	}
}
