package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {

	/**
	 * Guardar un usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	/**
	 * Recupera la lista de usuario
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * Eliminar un usuario con id recibido
	 * @param id
	 */
	void deleteUser(Long id);



}
