package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Joke;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceSingleJokeImplTest {

    @Autowired
    ApiServiceSingleJoke apiServiceSingleJoke;

    @Test
    public void testGetJokes() throws Exception{

        Joke[] jokes = apiServiceSingleJoke.getJokes();

        Assertions.assertEquals(1, jokes.length);
    }
}
