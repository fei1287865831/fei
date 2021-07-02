package com.example.fei.service.impl;

import com.example.fei.entity.MailBean;
import com.example.fei.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class MailServiceImpl implements MailService {

    @Value("${spring.mail.username}")
    private String mailSender;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendSimpleMail(MailBean mailBean) {
            SimpleMailMessage mailMessage= new SimpleMailMessage();
            mailMessage.setFrom(mailSender);
            mailMessage.setTo(mailBean.getRecipient());
            mailMessage.setSubject(mailBean.getSubject());
            mailMessage.setText(mailBean.getContent());
            //mailMessage.copyTo(copyTo);
            javaMailSender.send(mailMessage);


    }
}
