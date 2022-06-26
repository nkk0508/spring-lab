package com.example.springlab.presentation.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonPropertyOrder({"id","name","age"})
public class CsvResponse {
    String id;
    String name;
    String age;

    public CsvResponse() {
    }

    public CsvResponse(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
