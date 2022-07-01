package com.example.springlab.presentation.controller;

import com.example.springlab.presentation.cookie.CookieExample;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cookie")
public class CookieTestController {

    @GetMapping
    public ResponseEntity<CookieExample> get(@CookieValue(name = "testCookie", required = false) CookieExample testCookie) {
        return new ResponseEntity(testCookie, new HttpHeaders(), HttpStatus.OK);
    }

    public CookieTestController() {
    }
}
