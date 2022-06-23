package com.example.springlab.presentation.response;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResultSet {
    SuperResponse resultSet;

    public ResultSet() {
    }

    public ResultSet(SuperResponse test) {
        this.resultSet = test;
    }
}
