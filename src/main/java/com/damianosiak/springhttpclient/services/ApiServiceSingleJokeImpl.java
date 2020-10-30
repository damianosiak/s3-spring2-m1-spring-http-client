package com.damianosiak.springhttpclient.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.damianosiak.springhttpclient.api.domain.Joke;

@Service
public class ApiServiceSingleJokeImpl implements ApiServiceSingleJoke {
    private RestTemplate restTemplate;

    public ApiServiceSingleJokeImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Joke[] getJokes(){
        Joke[] jokes = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/random", Joke[].class);
        return jokes;
    }
}
