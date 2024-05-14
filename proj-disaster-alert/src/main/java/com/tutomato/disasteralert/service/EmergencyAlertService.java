package com.tutomato.disasteralert.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class EmergencyAlertService {

    private final RestTemplate restTemplate;


}
