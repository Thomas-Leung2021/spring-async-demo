package com.example.async.asyncDemo.controller;

import com.example.async.asyncDemo.service.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;
    
    // After you run the url in the browser, 
    // you will see the thread from the browser is different from the console.
    // localhost:8080/send?mobile=12345678
    @GetMapping("/send")
    public String sendMessage(String mobile) {
        notificationService.sendTextMessage(mobile);
        return "Message sent successfully! : " + Thread.currentThread().getName();
    }
}
