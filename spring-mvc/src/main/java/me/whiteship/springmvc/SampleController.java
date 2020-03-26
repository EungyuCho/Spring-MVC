package me.whiteship.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    //preHandle :
    //요청 처리
    //postHandle
    //뷰 렌더링
    //afterCompletion

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person){
//    public String hello(@PathVariable("name") Person person){
        return "hello "+ person.getName();
    }

    @GetMapping("/message")
    public String message(@RequestBody String body){
        return body;
    }

    @GetMapping("jsonMessage")
    public Person jsonMessage(@RequestBody Person person){
        return person;
    }
}
