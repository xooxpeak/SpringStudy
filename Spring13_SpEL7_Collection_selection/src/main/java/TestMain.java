import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Person;



public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		System.out.println("1. 전체 Cat 목록");
		Person p1 = ctx.getBean("p1", Person.class);
		
		List<Cat> catList = p1.getCatList();
		for (Cat cat : catList) {
			System.out.println(cat);
		}
		
		System.out.println("2. 전체 Cat 목록");
		Person p2 = ctx.getBean("p2", Person.class);
		
		List<Cat> catList2 = p2.getCatList();
		for (Cat cat : catList2) {
			System.out.println(cat);
		}
		
		System.out.println("3. age < 10 Cat 출력");    //value=#{xxx.?[조건식]}  ?:selection(행)  !:projection(열)
		Person p3 = ctx.getBean("p3", Person.class);
		
		List<Cat> catList3 = p3.getCatList();
		for (Cat cat : catList3) {
			System.out.println(cat);
		}
		
		System.out.println("4. age < 10 Cat and married==false Cat 출력");    //value=#{xxx.?[조건식]}  ?:selection(행)  !:projection(열)
		Person p4 = ctx.getBean("p4", Person.class);
		
		List<Cat> catList4= p4.getCatList();
		for (Cat cat : catList4) {
			System.out.println(cat);
		}
		
	}

}
