package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Bored;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceBoredByParticipantsImplTest {

    @Autowired
    ApiServiceBoredByParticipants apiServiceBoredByParticipants;

    @Test
    public void testGetBored() throws Exception{

        Bored bored = apiServiceBoredByParticipants.getBored(5);

        Assertions.assertEquals(5, bored.getParticipants());
    }
}
