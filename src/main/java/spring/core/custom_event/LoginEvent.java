package spring.core.custom_event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @author senola
 * @timer 2015-5-18
 * 描述： 自定义事件
 */
public class LoginEvent extends ApplicationEvent{

	private static final long serialVersionUID = 5957034989276958584L;
	private Date date;
	public LoginEvent(Object source) {
		super(source);
		this.date = new Date(getTimestamp());
		System.out.println("LoginEvent--------------constructor");
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
