package com.timedisplayer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timedisplayer.service.TimeService;

@RestController
@RequestMapping("/greet-times")
public class TimeController {
    @Autowired
    private TimeService timeService;
    
//    @Value("${customer.db.url}")
//    private String customerDbUrl;
//    
//    @Value("${customer.db.username}")
//    private String customerDbUser;
//    
//    @Value("${customer.db.password}")
//    private String customerDbPassword;
    
//    //added comment
//    @GetMapping("/customer-db-details")
//    public Map<String,String> getCustomerDbDetails() {
//    	
//    	 System.out.println("Customer DB URL: " + customerDbUrl);
//    	    System.out.println("Customer DB User: " + customerDbUser);
//    	    System.out.println("Customer DB Password: " + customerDbPassword);
//    	    
//    	    Map<String, String> dbDetails = new HashMap<>();
//    	    dbDetails.put("customerDbUrl", customerDbUrl);
//    	    dbDetails.put("customerDbUser", customerDbUser);
//    	    dbDetails.put("customerDbPassword", customerDbPassword);
//    	    	
//    	    	return dbDetails;
//    	
//    }
//    
//   

    @GetMapping
    public Map<String, String> getGreetingWithTime() {
        Map<String, String> response = new HashMap<>();
        response.put("greeting", timeService.getGreeting());
        response.put("time", timeService.getCurrentTime());
        return response;
    }
}
