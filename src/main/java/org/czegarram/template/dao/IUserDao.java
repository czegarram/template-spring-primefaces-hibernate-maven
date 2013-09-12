package org.czegarram.template.dao;

import java.util.List;

import org.czegarram.template.domain.User;

public interface IUserDao {

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public User getUserById(int id);

	public List<User> getUsers();

}
