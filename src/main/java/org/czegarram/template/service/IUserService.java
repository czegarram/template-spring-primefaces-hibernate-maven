package org.czegarram.template.service;

import java.util.List;

import org.czegarram.template.domain.User;

/**
 * 
 * User Service Interface
 * 
 *
 */
public interface IUserService {
	
	
	public void addUser(User user);
	
	public void updateUser(User user);

	public void deleteUser(User user);
	
	public User getUserById(int id);

	public List<User> getUsers();
}
