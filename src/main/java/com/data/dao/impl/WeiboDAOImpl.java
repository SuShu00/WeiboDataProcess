package com.data.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import com.data.dao.WeiboDAO;
import com.data.model.WeiboModel;

public class WeiboDAOImpl implements WeiboDAO {
	private static Logger LOG = Logger.getLogger(WeiboDAOImpl.class);
	private static SessionFactory sessionFactory = null;
    static {
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
	        return weiboModel;
	}
}
