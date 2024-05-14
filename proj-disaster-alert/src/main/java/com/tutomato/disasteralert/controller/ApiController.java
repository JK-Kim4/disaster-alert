package com.tutomato.disasteralert.controller;

import com.tutomato.disasteralert.common.utility.CommonUtility;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final Logger logger = LoggerFactory.getLogger(ApiController.class);

    private final RestTemplate restTemplate;

    @GetMapping("/emergency-alert/list")
    public HashMap<String, Object> getAlertList(
            @RequestParam(name = "numOfRows", required = false) Integer numOfRows,
            @RequestParam(name = "pageNo", required = false) Integer pageNo){
        HashMap resultMap = new HashMap<>();

        return resultMap;
    }

}
