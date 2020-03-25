package me.whiteship.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
