package com.icff.tutoring.util;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class UUIDutil {
	private UUIDutil() {
		
	}
	private static Long randomNumber;  
	private static Long curIndex = Long.valueOf(0L);
	
	public static String uuidStuAnno() {
		String uuid = UUID.randomUUID().toString();
		String[] uuids = uuid.split("-");
		return "T"+uuids[0]+uuids[1];
	}
	 public synchronized static String getId() throws Exception {  
	        Long index = null;  
	        // 从0到999 curIndex*100 curIndex 100-99900  
	        index = (curIndex = curIndex.longValue() + 1L).longValue() % 1000L;  
	        if (curIndex.longValue() >= 1000L) {  
	            curIndex = 0L;  
	        }  
	        // 随机数 1-10  
	        randomNumber = Long.valueOf(new Random().nextInt(100));  
	        return String.valueOf((new Date()).getTime() * 100000L + index.longValue() * 100L  
	                + randomNumber.longValue());  
	    }  
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/05/01 00:00:00").getTime()-new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2018/04/00 00:00:00").getTime());
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

