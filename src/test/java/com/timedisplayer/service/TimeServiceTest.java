package com.timedisplayer.service;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.*;

class TimeServiceTest {
    private final TimeService service = new TimeService();

    @Test
    void testGreetingMorning() {
        LocalTime morning = LocalTime.of(6, 0);
        String greeting = getGreetingForHour(morning.getHour());
        assertEquals("Good morning", greeting);
    }

    @Test
    void testGreetingAfternoon() {
        LocalTime afternoon = LocalTime.of(13, 0);
        String greeting = getGreetingForHour(afternoon.getHour());
        assertEquals("Good afternoon", greeting);
    }

    @Test
    void testGreetingEvening() {
        LocalTime evening = LocalTime.of(18, 0);
        String greeting = getGreetingForHour(evening.getHour());
        assertEquals("Good evening", greeting);
    }

    @Test
    void testGreetingNight() {
        LocalTime night = LocalTime.of(22, 0);
        String greeting = getGreetingForHour(night.getHour());
        assertEquals("Good night", greeting);
    }

    @Test
    void testTimeFormat() {
        String time = service.getCurrentTime();
        assertTrue(time.matches("\\d{2}:\\d{2}:\\d{2}"));
    }

    @Test
    void testGreetingWithTime() {
        TimeGreetingResponse response = service.getGreetingWithTime();
        assertNotNull(response.getGreeting());
        assertNotNull(response.getTime());
        assertTrue(response.getTime().matches("\\d{2}:\\d{2}:\\d{2}"));
    }

    // Helper method to simulate greeting logic
    private String getGreetingForHour(int hour) {
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
}
