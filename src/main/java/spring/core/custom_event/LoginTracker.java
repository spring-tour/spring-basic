package spring.core.custom_event;

import org.springframework.context.ApplicationListener;

/**
 * 
 * @author senola
 * login 跟踪
 */
public class LoginTracker implements ApplicationListener<LoginEvent>{

	@Override
	public void onApplicationEvent(LoginEvent event) {
		System.out.println("\n"+((Login)event.getSource()).getUername()+" logged-in @ "+event.getDate()+"\n");
	}

}
