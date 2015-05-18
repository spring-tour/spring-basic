package spring.aop.learning;

import java.util.Calendar;

/**
 * 
 * @author senola
 * 
 * 描述： 记录用户的登入行为
 *
 */
public class Logger {

	public void log(){
		System.out.println("user has logged in @"+ Calendar.getInstance().getTime());
	}
}
