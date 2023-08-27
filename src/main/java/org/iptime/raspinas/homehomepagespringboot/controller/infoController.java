package org.iptime.raspinas.homehomepagespringboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/info")
public class infoController {

    @PostMapping(value = "userinfo")
    public String getUserinfo(@RequestBody Map<String, Object> postData){
        return null;
    }
}
