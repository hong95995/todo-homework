package com.example.todohomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloTodoController {

    @GetMapping
    public String helloTodo() {
        return "To-do Application !";
    }
}
