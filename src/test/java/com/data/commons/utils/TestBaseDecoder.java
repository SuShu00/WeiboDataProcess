package com.data.commons.utils;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestBaseDecoder {
	private static Logger LOG = Logger.getLogger(TestBaseDecoder.class);
	@Test
	public void testEncode() {
		String str = "河北科技大学(Hebei University of Science Technology)";
		String result = "";
		BaseDecoder baseDecoder = new BaseDecoder();
		result = baseDecoder.encode(str);
		LOG.info(result);	
	}

	@Test
	public void testDecode() {
		String str = "5rKz5YyX56eR5oqA5aSn5a2mKEhlYmVpIFVuaXZlcnNpdHkgb2YgU2NpZW5jZSBUZWNobm9sb2d5KQ==";
		String result = "";
		BaseDecoder baseDecoder = new BaseDecoder();
		result = baseDecoder.decode(str);
		LOG.info(result);	
	}

}
