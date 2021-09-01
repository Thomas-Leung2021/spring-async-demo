package com.example.async.asyncDemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Async
    public void sendTextMessage(String mobile) {
        // dummy Logic to call 3rd party services
        sleep(2);
        System.out.println("called 3rd party to send text message: " + Thread.currentThread().getName());
        // System.out.println(10/0);
    }

    private void sleep(int args) {
        try {
            TimeUnit.SECONDS.sleep(args);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
