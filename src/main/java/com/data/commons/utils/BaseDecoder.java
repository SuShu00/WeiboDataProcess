package com.data.commons.utils;

import org.apache.log4j.Logger;
import org.springframework.security.core.codec.Base64;

/**
 * 数据Base64解码器
 * 
 * @author Shu
 */
public class BaseDecoder {
	private static Logger LOG = Logger.getLogger(BaseDecoder.class);
	
	/**
	 * Base64编码程序段
	 * @param string
	 * @return
	 */
	public static final String encode(String str) {
		String result = "";
		try {
			result = new String(Base64.encode(str.getBytes()));
		} catch (Exception e) {
			LOG.error("Base64编码失败" + e.getMessage());
		}
		return result;
	}
	
	/**
	 * Base64解码程序段
	 * @param str
	 * @return
	 */
	public static final String decode(String str){
		String result = "";
		try{
			result = new String(Base64.decode(str.getBytes()));
		}catch(Exception e){
			LOG.error("Base64解码失败" + e.getMessage());
		}
		return result;
	}
	

}
