package com.senac.api;

import com.senac.api.useCases.users.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExemploSecurityApiApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

//	@Test
//	void userRegistryTest(){
//		UserRequestDom userPersist = new UserRequestDom();
//		userPersist.setLogin("test");
//		userPersist.setPassword("1234");
//
//		UserResponseDom userResult = userService.createUser(userPersist);
//	}

}