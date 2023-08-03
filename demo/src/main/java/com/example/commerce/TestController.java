package com.example.commerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final TestService service;

    public TestController(TestService service){
        this.service = service;
    }

    @GetMapping("hello")
    @ResponseBody
    public String connect(@RequestParam String id, @RequestParam String name){
        return service.join(id, name);
    }

    @GetMapping("search")
    @ResponseBody
    public String search(@RequestParam String id){
        return service.search(id);
    }

    @GetMapping("out")
    @ResponseBody
    public String out(@RequestParam String id){
        return service.out(id);
    }

}


