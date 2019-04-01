package com.jvs.ski.rest.draft;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraftController {

    @GetMapping(path = "/hello")
    public String gretting() {
        return "Hello, world";
    }
}