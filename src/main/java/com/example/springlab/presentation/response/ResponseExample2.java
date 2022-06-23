package com.example.springlab.presentation.response;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponseExample2 extends SuperResponse {
    String test1;
    String test2;
    String test3;

    public ResponseExample2(String test1, String test2, String test3) {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
}
