package com.data.dao;

import java.util.Set;

import com.data.model.UserModel;

/**
 * 用户信息数据库接口
 * @author Shu
 */
public interface UserDAO {
	/**
	 * 根据用户id查询用户数据
	 * @param id
	 * @return
	 */
	public UserModel load(long id);
	
	/**
	 * 获取UID列表
	 * @return
	 */
	public Set<String> listUid();

}
