package com.example.springlab.presentation.cookie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CookieExample {
    String testCookie;

    public CookieExample() {
    }

    public CookieExample(String testCookie) {
        this.testCookie = testCookie;
    }
}
