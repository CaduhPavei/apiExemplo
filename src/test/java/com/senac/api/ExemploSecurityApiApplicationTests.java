package com.senac.api;

import com.senac.api.services.EmailService;
import com.senac.api.useCases.users.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExemploSecurityApiApplicationTests {

	@Autowired
	private UserService userService;

	@Autowired
	private EmailService emailService;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void emailTest(){
//		emailService.sendMail(
//				"ricardo.pavei@emasoftware.com.br",
//				"caduhpavei@gmail.com",
//				"teste",
//				"Aooooba!");
//	}

//	@Test
//	void userRegistryTest(){
//		UserRequestDom userPersist = new UserRequestDom();
//		userPersist.setLogin("test");
//		userPersist.setPassword("1234");
//
//		UserResponseDom userResult = userService.createUser(userPersist);
//	}

}