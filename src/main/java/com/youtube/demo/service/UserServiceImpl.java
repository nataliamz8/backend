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
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	//Cambió un poco respecto al titurial 10
	@Override
	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
		
	}

	
}
