package com.timedisplayer.service;

public class TimeGreetingResponse {
    private String greeting;
    private String time;

    public TimeGreetingResponse(String greeting, String time) {
        this.greeting = greeting;
        this.time = time;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getTime() {
        return time;
    }
}
