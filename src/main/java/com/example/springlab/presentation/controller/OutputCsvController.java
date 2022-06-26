package com.example.springlab.presentation.controller;

import com.example.springlab.presentation.response.CsvResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/csv")
public class OutputCsvController {

    @GetMapping
    public ResponseEntity<String> get() throws JsonProcessingException {
        List<CsvResponse> csvList = new ArrayList<>() {
            {
                add(new CsvResponse("1", "taro", "30"));
                add(new CsvResponse("2", "jiro", "30"));
                add(new CsvResponse("3", "saburo", "30"));
            }
        };
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = mapper.schemaFor(CsvResponse.class).withHeader();
        String response = mapper.writer(schema).writeValueAsString(csvList);;

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/csv");
        return new ResponseEntity(response, headers, HttpStatus.OK);
    }

    public OutputCsvController() {
    }
}
