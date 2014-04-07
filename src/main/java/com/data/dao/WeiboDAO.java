package com.data.dao;

import java.util.Set;

import com.data.model.WeiboModel;

public interface WeiboDAO {
	/**
	 * 根据微博id查询微博数据
	 * @param id
	 * @return
	 */
	public WeiboModel load(int id);
	
	/**
	 * 获取weiboId字段列表
	 * @return
	 */
	public Set<String> listWeiboId();

}
