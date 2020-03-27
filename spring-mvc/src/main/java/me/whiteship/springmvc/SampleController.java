package me.whiteship.springmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UrlPathHelper;

@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class SampleController {

    @RequestMapping("/{name:[a-z]+}")
    @ResponseBody
    public String hello(@PathVariable String name){
        return "hello " + name;
    }

    @RequestMapping(value = "/consumes1", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String json(){
        return "json";
    }
}
