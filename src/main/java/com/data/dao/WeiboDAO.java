package com.data.dao;

import com.data.model.WeiboModel;

public interface WeiboDAO {
	/**
	 * 根据微博id查询微博数据
	 * @param id
	 * @return
	 */
	public WeiboModel load(long id);

}
