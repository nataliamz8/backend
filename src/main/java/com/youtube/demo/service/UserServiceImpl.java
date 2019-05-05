package com.youtube.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo.dao.UserRepository;
import com.youtube.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	//Inyección de dependencia
	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
	
	
	
}
