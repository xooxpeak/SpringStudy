
//자바의 싱글톤 패턴 구현 ( singleton design pattern )
//UserService를 한 번만 생성하게끔 구현

class UserService{
	// 3) static변수로 지정
	private static UserService service;
	
	// 1) 생성자를 private로 지정한다. => 내부에서는 절대 생성못하게끔 한다.
	private UserService() {
		
	}
	
	// 2) 자기자신의 메서드에서 생성
	// 외부에서 getInstance를 호출하려면 객체를 생성하고 .을 써서 호출해야되는데 현재 불가능하다.
	// static을 추가해주면 외부에서는 클래스 이름으로 접근해서 객체를 생성할 수 있다.
	public static UserService getInstance() {
		if(service==null) { 
			service = new UserService();
		}
		return service;
	}
	
}

public class TestMain {

	public static void main(String[] args) {

		// 대표적인 싱글톤 객체 : Calendar.getInstance()
		
		// 두번 생성됐는데 이게 불가능하게끔 하려는 실습임
		UserService s1 = UserService.getInstance();  //100번지
		UserService s2 = UserService.getInstance();  //100번지
		UserService s3 = UserService.getInstance();  //100번지
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
	}

}
