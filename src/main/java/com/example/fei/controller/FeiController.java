package com.example.fei.controller;

import com.example.fei.entity.MailBean;
import com.example.fei.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fei")
@RestControllerAdvice
@Slf4j
public class FeiController {

    @Autowired
    MailService mailService;

    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }
    @PostMapping("/sendMail")
    public void sendMail(@RequestBody MailBean mailBean){
        mailService.sendSimpleMail(mailBean);
    }


}
