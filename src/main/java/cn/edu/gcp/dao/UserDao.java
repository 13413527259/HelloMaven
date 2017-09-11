package cn.edu.gcp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.gcp.po.User;

public interface UserDao {
	
	User queryById(int id);
	
	List<User> queryAll(@Param("offset")int offset,@Param("limit")int limit);

}
