package com.dfw.framework.utils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSON;

public class CommonUtils {
	/**
	 * get 32 bit uuid.
	 * @return
	 */
	public static String getUUID32()
	{
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	/**
	 * 返回指定格式的日期或时间
	 * @return
	 */
	public static String getDateByFmt(String df)
	{
		return new SimpleDateFormat(df).format(new Date());
	}
	/***
	 * 将数字年份转换成中文
	 * @param number 如 2019
	 * @return 二〇一九
	 */
	@SuppressWarnings("unchecked")
	public static String NumberYear2CHS(String number)
	{
		Map<String,String> map = (Map<String, String>) JSON.parse(
				"{\"0\":\"〇\","
				+ "\"1\":\"一\","
				+ "\"2\":\"二\","
				+ "\"3\":\"三\","
				+ "\"4\":\"四\","
				+ "\"5\":\"五\","
				+ "\"6\":\"六\","
				+ "\"7\":\"七\","
				+ "\"8\":\"八\","
				+ "\"9\":\"九\"}"
				);
		String chs = "";
		for(int i=0;i<number.length();i++)
		{
			chs +=map.get(String.valueOf(number.charAt(i)));
		}
		return chs;
	}
	public static void main(String[] args) {
		System.out.println(NumberYear2CHS("2019"));
	}
	
}
