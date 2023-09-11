import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {

		//user.xml을 알리고
		//객체를 통해 user.xml에 있는 설정을 읽어온다.
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		//getBean(이름,타입)으로 빈을 조회한다.
		DeptService service =
				ctx.getBean("service", DeptService.class);

		//service의 findAll()을 list에 담아 출력한다.
		List<DeptDTO> list = service.findAll();
		System.out.println(list);
		
	}

}

