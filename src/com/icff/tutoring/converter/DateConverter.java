package com.icff.tutoring.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String arg0) {
		Pattern p = Pattern.compile("\\d{4}(\\-|\\/|\\.)\\d{1,2}\\1\\d{1,2}");
		Matcher m = p.matcher(arg0);
		SimpleDateFormat sdf;
        if(m.matches())
        	sdf = new SimpleDateFormat("yyyy-MM-dd");
        else
        	sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (arg0 !=null && !"".equals(arg0)) {
			try {
				return sdf.parse(arg0);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
