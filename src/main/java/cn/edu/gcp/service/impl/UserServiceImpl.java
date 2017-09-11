package cn.edu.gcp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.gcp.dao.UserDao;
import cn.edu.gcp.po.User;
import cn.edu.gcp.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired()
	private UserDao userDao;

	public User getById(int id) {
		return userDao.queryById(id);
	}

	public List<User> getList() {
		return userDao.queryAll(0, 1000);
	}
	
	

}
