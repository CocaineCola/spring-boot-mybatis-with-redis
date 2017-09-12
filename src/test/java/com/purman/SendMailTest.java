package com.purman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
* @Description:
* @author quintin.zhang quintin.zhang@yoho.cn 
* @date 2017/8/2 14:19
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SendMailTest {

	@Autowired
	private JavaMailSender mailSender;

	@Test
	public void sendSimpleMail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("522897160@qq.com");
		message.setTo("bo.sun@yoho.cn");
		message.setSubject("主题：财务数据错误");
		message.setText("2017年8月1日 对账单数据发生严重错误！麻烦核实下");

		mailSender.send(message);
	}

}
