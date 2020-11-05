package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Bored;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiServiceBoredByParticipantsImpl implements ApiServiceBoredByParticipants {
    private RestTemplate restTemplate;

    public ApiServiceBoredByParticipantsImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Bored getBored(Integer participants){
        Bored bored = restTemplate.getForObject("http://www.boredapi.com/api/activity?participants="+participants, Bored.class);
        return bored;
    }
}
