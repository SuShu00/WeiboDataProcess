package com.data.commons.utils;

import org.apache.log4j.Logger;
import org.apache.lucene.document.Document;
import org.junit.Test;
import com.data.dao.impl.UserDAOImpl;
import com.data.dao.impl.WeiboDAOImpl;
import com.data.model.UserModel;
import com.data.model.WeiboModel;

public class TestObject2Document {
	private static Logger LOG = Logger.getLogger(TestObject2Document.class);
	@Test
	public void testObjectToDocumentWeiboModelUserModel() {
		Document doc = new Document();
		WeiboModel weiboModel = null;
		UserModel userModel = null;
		WeiboDAOImpl weiboDAOImpl = new WeiboDAOImpl();
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		weiboModel = (WeiboModel)weiboDAOImpl.load(3204741);
		userModel = userDAOImpl.load(weiboModel.getUid());
		LOG.info("开始转换");
		doc = Object2Document.ObjectToDocument(weiboModel, userModel);
		LOG.info(doc.get("text"));
		LOG.info(doc.get("screen_name"));
		LOG.info("转换成功");
	}

	@Test
	public void testObjectToDocumentWeiboModel() {
		Document doc = new Document();
		WeiboModel weiboModel = null;
		WeiboDAOImpl weiboDAOImpl = new WeiboDAOImpl();
		weiboModel = (WeiboModel)weiboDAOImpl.load(3204741);
		LOG.info("开始转换");
		doc = Object2Document.ObjectToDocument(weiboModel);
		LOG.info(doc.get("text"));
		LOG.info("转换成功");
		
	}

	@Test
	public void testObjectToDocumentUserModel() {
		UserModel userModel = null;
		Document doc = new Document();
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		userModel = userDAOImpl.load(222702277);
		LOG.info("开始转换");
		doc = Object2Document.ObjectToDocument(userModel);
		LOG.info(doc.get("screen_name"));
		LOG.info("转换成功");
	}

}
