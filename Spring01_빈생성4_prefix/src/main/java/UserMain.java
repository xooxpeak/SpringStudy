import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		
		//1. 이전방식
//		UserService service = new UserService();
//		System.out.println(service.mesg());
		
		//2. 스프링 방식
		
		/*
		 * - 작업 순서
			1. 빈을 생성( .java )
			2. 빈을 xml에 등록 ( new 대신에 )
			3. ApplicationContext에 xml을 알려준다.
			4. ApplicationContext가 xml에 등록된 빈 정보를 보고 자동생성~소멸 처리함.
		 */
		
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/user.xml", 
												"file:c:\\spring_study\\user2.xml");
		
	}
}
