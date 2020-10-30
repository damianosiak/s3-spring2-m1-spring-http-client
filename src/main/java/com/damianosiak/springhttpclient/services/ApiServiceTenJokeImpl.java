package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Joke;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceTenJokeImpl implements ApiServiceTenJoke {
    private RestTemplate restTemplate;

    public ApiServiceTenJokeImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Joke[] getJokes(){
        Joke[] jokes = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/ten", Joke[].class);
        return jokes;
    }
}
