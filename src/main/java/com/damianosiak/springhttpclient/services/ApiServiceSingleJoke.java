package com.damianosiak.springhttpclient.services;


import com.damianosiak.springhttpclient.api.domain.Joke;

public interface ApiServiceSingleJoke {

    Joke[] getJokes();
}
