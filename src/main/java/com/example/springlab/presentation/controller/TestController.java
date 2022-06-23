package com.example.springlab.presentation.controller;

import com.example.springlab.presentation.request.RequestExample1;
import com.example.springlab.presentation.request.RequestExample2;
import com.example.springlab.presentation.request.ResultSet;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> get() {
        RequestExample1 ex1 = new RequestExample1("testです");
        RequestExample2 ex2 = new RequestExample2("testです", "testです", "testです");
        ResultSet response = new ResultSet(ex2);
        return new ResponseEntity(response, new HttpHeaders(), HttpStatus.OK);
    }

    public TestController() {
    }
}
