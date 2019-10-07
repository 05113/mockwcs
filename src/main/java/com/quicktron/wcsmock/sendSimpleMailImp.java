package com.quicktron.wcsmock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class sendSimpleMailImp implements MailService {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")  //发送人的邮箱  比如155156641XX@163.com
    private String from;
    @Override
    @Async
    public void sendMail(String title, String url, String email) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from); // 发送人的邮箱
        message.setSubject(title); //标题
        message.setTo(email); //发给谁  对方邮箱
        message.setText(url); //内容
        mailSender.send(message); //发送
    }
}
