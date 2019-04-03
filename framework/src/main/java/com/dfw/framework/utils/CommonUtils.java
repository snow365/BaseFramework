package com.dfw.framework.utils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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
	public static String getDateByFmt(DateFmt df)
	{
		return new SimpleDateFormat(df.datetime).format(new Date());
	}
	
}
