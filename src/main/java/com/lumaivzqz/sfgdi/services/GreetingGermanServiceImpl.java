package com.lumaivzqz.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingGermanServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return  "Hallo Welt!";
    }
}
