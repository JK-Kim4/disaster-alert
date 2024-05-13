package com.tutomato.disasteralert.common.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class CommonUtility {

    /*private static String apiBaseUrl;

    private static String serviceKey;

    @Value("${safetydata.api-base-url}")
    public void setApiBaseUrl(String value){
        CommonUtility.apiBaseUrl = value;
    }

    @Value("${safetydata.service-key}")
    public void setSecretKey(String value){
        CommonUtility.serviceKey = value;
    }
    public static UriComponentsBuilder getUriComponentsBuilder(String uri){
        return UriComponentsBuilder.fromHttpUrl(apiBaseUrl+uri)
                                    .queryParam("serviceKey", serviceKey);
    }*/



}
