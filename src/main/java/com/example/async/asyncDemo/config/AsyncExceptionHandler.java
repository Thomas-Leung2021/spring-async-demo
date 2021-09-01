package com.example.async.asyncDemo.config;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

// this class will inject into the AsyncConfig Class
@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... arguments) {
        System.out.println("Method Name: " + method.getName() + "---" + Arrays.toString(arguments) + "---"
                + "error Message: " + throwable.getMessage());
    }
}
