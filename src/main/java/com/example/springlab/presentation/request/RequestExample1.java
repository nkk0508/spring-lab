package com.example.springlab.presentation.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestExample1 {
    String test1;
    String test2;

    public RequestExample1() {
    }

    public RequestExample1(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }
}
