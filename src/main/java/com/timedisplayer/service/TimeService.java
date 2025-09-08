package com.timedisplayer.service;

import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {
    public String getGreeting() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        if (hour >= 5 && hour < 12) {
            return "Good morning";
        } else if (hour >= 12 && hour < 17) {
            return "Good afternoon";
        } else if (hour >= 17 && hour < 21) {
            return "Good evening";
        } else {
            return "Good night";
        }
    }

    public String getCurrentTime() {
        LocalTime now = LocalTime.now();
        return now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public TimeGreetingResponse getGreetingWithTime() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        String greeting;
        if (hour >= 5 && hour < 12) {
            greeting = "Good morning";
        } else if (hour >= 12 && hour < 17) {
            greeting = "Good afternoon";
        } else if (hour >= 17 && hour < 21) {
            greeting = "Good evening";
        } else {
            greeting = "Good night";
        }
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return new TimeGreetingResponse(greeting, time);
    }
}