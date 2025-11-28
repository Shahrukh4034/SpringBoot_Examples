package Com.Example.Dependency_Injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {
public static void main(String[] args) {
	
	BeanFactory bf= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Student s2=	(Student) bf.getBean("s1");
	System.out.println(s2.getId());
	System.out.println(s2.getName());
	System.out.println(s2.getDept());

}
}
