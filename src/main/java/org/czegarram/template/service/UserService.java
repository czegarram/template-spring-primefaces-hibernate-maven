package org.czegarram.template.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.czegarram.template.domain.User;
import org.czegarram.template.dao.IUserDao;

@Transactional(readOnly = true)
public class UserService implements IUserService {

	// UserDAO is injected in appContext.xml
	IUserDao userDAO;

	@Transactional(readOnly = false)
	public void addUser(User user) {
		getUserDAO().addUser(user);
	}

	@Transactional(readOnly = false)
	public void deleteUser(User user) {
		getUserDAO().deleteUser(user);
	}

	@Transactional(readOnly = false)
	public void updateUser(User user) {
		getUserDAO().updateUser(user);
	}

	public User getUserById(int id) {
		return getUserDAO().getUserById(id);
	}

	public List<User> getUsers() {
		return getUserDAO().getUsers();
	}

	public IUserDao getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDao userDAO) {
		this.userDAO = userDAO;
	}

}
