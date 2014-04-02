package com.data.process;

import org.apache.lucene.document.Document;

import com.data.model.WeiboModel;

public interface WeiboObjectToDocument {
	public Document userObjectToDocument(WeiboModel weiboModel);
}
