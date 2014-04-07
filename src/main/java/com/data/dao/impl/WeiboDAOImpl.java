package com.data.dao.impl;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.data.commons.utils.BaseDecoder;
import com.data.dao.WeiboDAO;
import com.data.model.WeiboModel;

public class WeiboDAOImpl implements WeiboDAO {
	private static Logger LOG = Logger.getLogger(WeiboDAOImpl.class);
	private static SessionFactory sessionFactory = null;
	private static BaseDecoder baseDecoder = null;
	static{
		baseDecoder = new BaseDecoder();
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (HibernateException e) {
			LOG.error("sessionFactory建立失败，请检查配置文件" + e.getMessage());
		}
	}
	@Override
	public WeiboModel load(int id) {
		 WeiboModel weiboModel = null;
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 try {
			 	//userModel = (UserModel)session.load(UserModel.class, id);
			 weiboModel = (WeiboModel)session.get(WeiboModel.class, id);
	        } catch (HibernateException e) {
	            e.printStackTrace();
	            LOG.error("查询失败");
	        }
	        try {
	            session.getTransaction().commit();
	        } catch (HibernateException e) {
	            LOG.error("查询失败");
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        weiboModel.setText(baseDecoder.decode(weiboModel.getText()));
	        return weiboModel;
	}
	
	@Override
    public Set<String> listWeiboId() {
        Set<String> set = new HashSet<String>();
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        for (Object weiboId : s.createSQLQuery("select weiboId from weibo").list()) {
            set.add(weiboId.toString());
        }
        try {
            s.getTransaction().commit();
        } catch (HibernateException e) {
            LOG.error("获取用户weiboId列表失败");
            e.printStackTrace();
        }
        s.close();
        return set;
    }

}
