package com.jvs.ski.rest.draft;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraftController {

    @RequestMapping("/hello")
    public String gretting() {
        return "Hello, world";
    }
}
