package com.data.dao.impl;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.data.model.WeiboModel;

public class TestWeiboDAOImpl {
	private static Logger LOG = Logger.getLogger(TestWeiboDAOImpl.class);

	@Test
	public void test() {
		WeiboModel weiboModel = null;
		WeiboDAOImpl weiboDAOImpl = new WeiboDAOImpl();
		weiboModel = (WeiboModel)weiboDAOImpl.load(3204741);
		LOG.info("查询完毕，开始输出");
		LOG.info(weiboModel);
		LOG.info("输出结束");
	}

}
