package com.jd.risktest;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

public class UserServiceTest {
	  private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
      
	    private static UserService userService = (UserService) context.getBean("userService");  
	      
	    public void saveUser() {  
	        StopWatch sw = new StopWatch(getClass().getSimpleName());  
	        sw.start("Add a user information.");  
	        SpringDataUser u = new SpringDataUser();  
	        u.setName("John");  
	        u.setSex("Man");  
	        u.setUsername("JohnZhang");  
	        u.setPassword("123456");  
	        u.setBirth(new Date());  
	        userService.save(u);  
	        sw.stop();  
	        System.err.println(sw.prettyPrint());  
	    }  
	  
	     public static void main(String[] args) {  
	        UserServiceTest test = new UserServiceTest();  
	        test.saveUser();  
	    }  
}
