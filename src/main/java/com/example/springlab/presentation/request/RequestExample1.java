package com.example.springlab.presentation.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RequestExample1 extends SuperRequest {
    String test1;

    public RequestExample1(String test1) {
        this.test1 = test1;
    }
}
