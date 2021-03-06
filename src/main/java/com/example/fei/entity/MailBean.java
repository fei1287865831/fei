package com.example.fei.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class MailBean implements Serializable {

    private static final long serialVersionUID = -2116367492649751914L;
    private String recipient;//邮件接收人
    private String subject; //邮件主题
    private String content; //邮件内容

}
