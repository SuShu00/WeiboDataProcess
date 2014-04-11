package com.data.process;

import org.apache.lucene.document.Document;

import com.data.model.UserModel;

/**
 * 对象数据与document数据转化接口
 * @author Shu
 *
 */
public interface UserObject2Document {
	public Document userObjectToDocument(UserModel userModel);
}
