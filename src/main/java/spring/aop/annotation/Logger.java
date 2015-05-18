package spring.aop.annotation;

import java.util.Calendar;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * 
 * @author senola
 * 
 * 描述： 记录用户的登入行为
 *
 */
@Aspect
public class Logger {

	@After("execution(* spring.aop.annotation.User.login(..))")
	public void log(){
		System.out.println("user has logged in @"+ Calendar.getInstance().getTime());
	}
}
