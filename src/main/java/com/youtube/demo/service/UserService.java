package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {

	User save(User user);

	/**
	 * Recupera la lista de usuario
	 * @return lista de usuarios
	 */
	List<User> findAll();



}
