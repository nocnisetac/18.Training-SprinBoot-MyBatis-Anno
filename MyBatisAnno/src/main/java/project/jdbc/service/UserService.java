package project.jdbc.service;

import java.util.List;

import project.jdbc.domain.User;

public interface UserService {
	public List<User> findAll();
	public User findUserById(Integer id);
}
