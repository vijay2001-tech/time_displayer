package com.timedisplayer.controller;

import com.timedisplayer.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greet-time")
public class TimeController {
    @Autowired
    private TimeService timeService;

    @GetMapping
    public Map<String, String> getGreetingWithTime() {
        Map<String, String> response = new HashMap<>();
        response.put("greeting", timeService.getGreeting());
        response.put("time", timeService.getCurrentTime());
        return response;
    }
}
