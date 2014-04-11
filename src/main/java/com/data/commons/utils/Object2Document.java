package com.data.commons.utils;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import com.data.model.UserModel;
import com.data.model.WeiboModel;

/**
 * Document转换类，用于生成Document对象
 * @author Shu
 */
public class Object2Document {
	private static Document doc = null;
	 static{
		doc = new Document();
	 }
	/**
	 * 把WeiboModel对象和UserModel对象转换成一个Document类型
	 * 
	 * @param weiboModel
	 * @param userModel
	 * @return
	 */
	public static  Document ObjectToDocument(WeiboModel weiboModel,
			UserModel userModel) {
		doc.add(new StringField("id", String.valueOf(userModel.getId()),
				Field.Store.YES));
		doc.add(new StringField("screen_name", userModel.getScreen_name(),
				Field.Store.YES));
		doc.add(new StringField("weiboId", String.valueOf(weiboModel
				.getWeiboId()), Field.Store.YES));
		doc.add(new TextField("text", String.valueOf(weiboModel.getText()),
				Field.Store.NO));
		return doc;
	}

	/**
	 * 把WeiboModel对象转换成Document对象
	 * 
	 * @param weiboModel
	 * @return
	 */
	public static Document ObjectToDocument(WeiboModel weiboModel) {
		doc.add(new StringField("weiboId", String.valueOf(weiboModel
				.getWeiboId()), Field.Store.YES));
		doc.add(new TextField("text", String.valueOf(weiboModel.getText()),
				Field.Store.NO));
		return doc;
	}

	/**
	 * 把UserModel对象转换成Document对象
	 * 
	 * @param userModel
	 * @return
	 */
	public static Document ObjectToDocument(UserModel userModel) {
		doc.add(new StringField("id", String.valueOf(userModel.getId()),
				Field.Store.YES));
		doc.add(new StringField("screen_name", userModel.getScreen_name(),
				Field.Store.YES));
		return doc;
	}
}
