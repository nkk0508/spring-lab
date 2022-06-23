package com.example.springlab.presentation.controller;

import com.example.springlab.presentation.response.ResponseExample1;
import com.example.springlab.presentation.response.ResponseExample2;
import com.example.springlab.presentation.response.ResultSet;
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
        ResponseExample1 ex1 = new ResponseExample1("testです");
        ResponseExample2 ex2 = new ResponseExample2("testです", "testです", "testです");
        ResultSet response = new ResultSet(ex2);
        return new ResponseEntity(response, new HttpHeaders(), HttpStatus.OK);
    }

    public TestController() {
    }
}
