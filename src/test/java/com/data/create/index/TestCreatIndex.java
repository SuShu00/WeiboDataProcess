package com.data.create.index;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.junit.Test;

import com.data.commons.utils.Object2Document;
import com.data.dao.impl.WeiboDAOImpl;
import com.data.model.WeiboModel;

public class TestCreatIndex {
	private static Logger LOG = Logger.getLogger(TestCreatIndex.class);
	@Test
	public void test(){
		WeiboDAOImpl weiboDAOImpl = new WeiboDAOImpl();	
		CreateIndex createIndex = new CreateIndex();
		Document document = null;
		WeiboModel weiboModel = new WeiboModel();
		weiboModel = weiboDAOImpl.load(3204741);
		document = Object2Document.ObjectToDocument(weiboModel);
		LOG.info("document对象转换成功");
		createIndex.createIndex(document);
		LOG.info("此document对象创建索引成功 ");
	}
	@Test
	public void testCreateIndex() {
		WeiboDAOImpl weiboDAOImpl = new WeiboDAOImpl();
		CreateIndex createIndex = new CreateIndex();
		WeiboModel weiboModel = new WeiboModel();
		Document document = null;
		Set<String> set = new HashSet<String>();
		set = weiboDAOImpl.listWeiboId();
		int index = 1;
		for(String s : set){
			weiboModel = weiboDAOImpl.load(Integer.valueOf(s));
			LOG.info("第" + index + "个微博对象获取成功");
			document = Object2Document.ObjectToDocument(weiboModel);
			LOG.info("document对象转换成功");
			createIndex.createIndex(document);
			LOG.info("此document对象创建索引成功 ");
			index++;
			if(index==100){
				createIndex.commit();
				createIndex.close();
			}
		}
	}

}
