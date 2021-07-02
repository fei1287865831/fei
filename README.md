# Springboot集成邮件服务

### 1、添加pom依赖

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
```

### 2、添加配置

```
#如果为163，spring.mail.host=smtp.163.com
spring.mail.host=smtp.qq.com
# 邮箱地址
spring.mail.username=******@qq.com
# 邮箱授权码
spring.mail.password=******
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.default-encoding=UTF-8
```

qq邮箱授权码生成

![image-20210702171107574](/Users/fei/Library/Application Support/typora-user-images/image-20210702171107574.png)



### 3、邮件发送实体类

```JAVA
public class MailBean implements Serializable {

    private static final long serialVersionUID = -2116367492649751914L;
    private String recipient;//邮件接收人
    private String subject; //邮件主题
    private String content; //邮件内容

}
```

#### 4、发送邮件

```java
public void sendSimpleMail(MailBean mailBean) {
        SimpleMailMessage mailMessage= new SimpleMailMessage();
        mailMessage.setFrom(mailSender);
        mailMessage.setTo(mailBean.getRecipient());
        mailMessage.setSubject(mailBean.getSubject());
        mailMessage.setText(mailBean.getContent());
        //mailMessage.copyTo(copyTo);
        javaMailSender.send(mailMessage);


}
```

