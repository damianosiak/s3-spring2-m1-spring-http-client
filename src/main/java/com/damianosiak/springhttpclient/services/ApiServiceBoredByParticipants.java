package com.damianosiak.springhttpclient.services;


import com.damianosiak.springhttpclient.api.domain.Bored;

public interface ApiServiceBoredByParticipants {

    Bored getBored(Integer participants);
}
