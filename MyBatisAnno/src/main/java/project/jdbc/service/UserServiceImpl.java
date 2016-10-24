package project.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.jdbc.domain.User;
import project.jdbc.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	//private UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
	@Override
	public User findUserById(Integer id) {
		return userMapper.findUserById(id);
	}
	

}
