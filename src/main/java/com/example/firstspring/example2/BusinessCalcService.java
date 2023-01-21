package com.example.firstspring.example2;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BusinessCalcService {
    DataService dataService;

    public BusinessCalcService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
