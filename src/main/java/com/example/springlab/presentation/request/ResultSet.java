package com.example.springlab.presentation.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResultSet {
    SuperRequest resultSet;

    public ResultSet() {
    }

    public ResultSet(SuperRequest test) {
        this.resultSet = test;
    }
}
