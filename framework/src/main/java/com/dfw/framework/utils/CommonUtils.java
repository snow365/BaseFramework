package com.dfw.framework.utils;
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
	 * 
	 * @return
	 */
	public static String getDatetimeByFmt()
	{
		
		return null;
	}
	
}
