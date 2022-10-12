package com.shaun.controller;

import com.shaun.config.MessageHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/list")
    @CrossOrigin
    public Object list(){
        return MessageHandler.SESSIONS.keySet();
    }


}
