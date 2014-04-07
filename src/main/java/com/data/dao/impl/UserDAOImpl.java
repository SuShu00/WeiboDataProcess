package com.data.dao.impl;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.data.dao.UserDAO;
import com.data.model.UserModel;

/**
 * @see UserDAO实现类
 * @author Shu
 */
public class UserDAOImpl implements UserDAO {
	private static Logger LOG = Logger.getLogger(UserDAOImpl.class);
	private static SessionFactory sessionFactory = null;
	
	static{
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (HibernateException e) {
			LOG.error("sessionFactory建立失败，请检查配置文件" + e.getMessage());
		}
	}
	 
	@Override
	public UserModel load(long id){
		 UserModel userModel = null;
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 try {
			 	//userModel = (UserModel)session.load(UserModel.class, id);
			 	userModel = (UserModel)session.get(UserModel.class, id);
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
	     return userModel;
	}
	
	@Override
    public Set<String> listUid() {
        Set<String> set = new HashSet<String>();
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        for (Object id : s.createSQLQuery("select id from user").list()) {
            set.add(id.toString());
        }
        try {
            s.getTransaction().commit();
        } catch (HibernateException e) {
            LOG.error("获取用户uid列表失败");
            e.printStackTrace();
        }
        s.close();
        return set;
	}
}
