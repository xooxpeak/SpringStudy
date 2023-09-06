import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;



import antlr.collections.List;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		//Person을 가져오면 그 안에 cat까지 가져올 수있다.
		Cat c = ctx.getBean("cat1", Cat.class);
		System.out.println(c);
		
	}

}
