package com.jvs.ski.rest.draft;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DraftController {

    @RequestMapping(method = GET, value = "/hello")
    public String gretting() {
        return "Hello, world";
    }
}