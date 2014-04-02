package com.data.dao.impl;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.data.model.UserModel;

public class TestUserDAOImpl {
	 private static Logger LOG = Logger.getLogger(TestUserDAOImpl.class);
	@Test
	public void test() {
		UserModel userModel = null;
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		userModel = userDAOImpl.load(222702277);
		LOG.info("查询完毕，开始输出");
		LOG.info(userModel);
		LOG.info("输出结束");
		
	}

}
