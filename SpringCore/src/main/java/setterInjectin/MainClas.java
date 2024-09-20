package setterInjectin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClas {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("setterInjectin/config.xml");
		User u  =(User)con.getBean("u1");
		System.out.println(u);
	}
}
