package com.jd.risktest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")  
public class UserService {
	      
	    @Autowired  
	    private UserRepository dao;  
	      
	    public void save(SpringDataUser user) {  
	        dao.save(user);  
	    }  
	  
	    public void delete(Long id) {  
	        dao.delete(id);  
	    }  
	  
	    public void update(SpringDataUser user) {  
	    	dao.save(user);
	    }  
	  
	    public Iterable<SpringDataUser> findAll() {  
	        return dao.findAll();  
	    }  
	
}
