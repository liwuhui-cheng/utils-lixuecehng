package com.lixuecheng.test;

public class HtmlUtiles {

	/**
	 * html   字符的转义处理
	 * @param str
	 * @return
	 */
	
	private  static   String htmlspecialchars(String str) {
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\"", "&quot;");
		return str;
	}
	
}
