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

        try {
            UriComponentsBuilder uriComponentsBuilder = CommonUtility.getUriComponentsBuilder("/V2/api/DSSP-IF-00247");

            if(numOfRows != null) uriComponentsBuilder.queryParam("numOfRows", numOfRows);
            if(pageNo != null) uriComponentsBuilder.queryParam("pageNo", pageNo);

            resultMap =  restTemplate.exchange(
                                        uriComponentsBuilder.build().toUri(),
                                        HttpMethod.GET,
                                        null,
                                        HashMap.class
                                    ).getBody();

        }catch (Exception e){
            logger.error("getAlertList error", e);
        }

        return resultMap;
    }

}
