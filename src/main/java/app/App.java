package app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Teacher;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Teacher teacher = (Teacher) applicationContext.getBean("teacherBean");

		System.out.println(teacher.toString());

		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
