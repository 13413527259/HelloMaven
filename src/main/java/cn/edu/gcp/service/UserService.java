package cn.edu.gcp.service;

import java.util.List;


import cn.edu.gcp.po.User;

public interface UserService {

	User getById(int id);
	
	List<User> getList();
	
	int editUserNameById(int id,String name);

	int deleteUserById(int id);
	
}
