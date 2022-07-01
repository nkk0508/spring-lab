package com.example.springlab.presentation.controller;

import com.example.springlab.presentation.request.RequestExample1;
import org.springframework.web.bind.annotation.*;

@RestController
public class PutController {

    @PutMapping("/put/test")
    public void get(@RequestBody(required = false) RequestExample1 request) {
        System.out.println(request);
    }

    public PutController() {
    }
}
