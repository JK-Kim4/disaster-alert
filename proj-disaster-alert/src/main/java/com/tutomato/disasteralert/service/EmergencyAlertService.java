package com.tutomato.disasteralert.service;

import com.tutomato.disasteralert.common.utility.CommonUtility;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class EmergencyAlertService {

    private final Logger logger = LoggerFactory.getLogger(EmergencyAlertService.class);
    private final RestTemplate restTemplate;

    public void getAlertList(Integer numOfRows, Integer pageNo){
        try {
            UriComponentsBuilder uriComponentsBuilder = CommonUtility.getUriComponentsBuilder("/V2/api/DSSP-IF-00247");

            if(numOfRows != null) uriComponentsBuilder.queryParam("numOfRows", numOfRows);
            if(pageNo != null) uriComponentsBuilder.queryParam("pageNo", pageNo);

            HashMap resultMap =  restTemplate.exchange(
                    uriComponentsBuilder.build().toUri(),
                    HttpMethod.GET,
                    null,
                    HashMap.class
            ).getBody();

        }catch (Exception e){
            logger.error("getAlertList error", e);
        }
    }
}
