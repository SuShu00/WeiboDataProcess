package com.data.system;

import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.apache.lucene.document.Document;
import com.data.commons.utils.Object2Document;
import com.data.create.index.CreateIndex;
import com.data.dao.impl.WeiboDAOImpl;
import com.data.model.WeiboModel;

public class SystemController {
	private static Logger LOG = Logger.getLogger(SystemController.class);
	public static void main(String[] args){
		WeiboDAOImpl weiboDAOImpl = new WeiboDAOImpl();
		CreateIndex createIndex = new CreateIndex();
		WeiboModel weiboModel = new WeiboModel();
		Document document = null;
		Set<String> set = new HashSet<String>();
		set = weiboDAOImpl.listWeiboId();
		int index = 1;
		LOG.info("-------------------------------");
		LOG.info("数据库中共有" + set.size() + "条数据");
		LOG.info("开始创建索引");
		LOG.info("-------------------------------");
		for(String s : set){
			weiboModel = weiboDAOImpl.load(Integer.valueOf(s));
			LOG.info("第" + index + "个微博对象获取成功");
			document = Object2Document.ObjectToDocument(weiboModel);
			LOG.info("document对象转换成功");
			createIndex.createIndex(document);
			LOG.info("此document对象创建索引成功 ");
			index++;
			if(index%1000==0){
				createIndex.commit();
			}
			if(index==set.size()||index==10000){
				createIndex.optimize();
				createIndex.commit();
				createIndex.close();
				break;
			}
		}
	}
}
