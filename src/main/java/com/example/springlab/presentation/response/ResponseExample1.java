package com.example.springlab.presentation.response;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponseExample1 extends SuperResponse {
    String test1;

    public ResponseExample1(String test1) {
        this.test1 = test1;
    }
}
