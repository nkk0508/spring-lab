package com.example.springlab.presentation.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RequestExample2 extends SuperRequest {
    String test1;
    String test2;
    String test3;

    public RequestExample2(String test1, String test2, String test3) {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
}
