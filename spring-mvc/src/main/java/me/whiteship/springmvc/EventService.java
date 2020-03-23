package me.whiteship.springmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    public List<Event> getEvents(){
        Event event1 = Event.builder()
                .name("스프링 웹 MVC 1차 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1, 7, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 1, 17, 12, 0))
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹 MVC 2차 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1, 17, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 1, 27, 12, 0))
                .build();
        List<Event> eventList = new ArrayList<Event>();
        eventList.add(event1);
        eventList.add(event2);

        return  eventList;
    }
}
