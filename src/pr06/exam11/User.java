package pr06.exam11;

public class User { // 클래스는 객체를 만들기 위한 설계도이다. 

	// Field -> 인스턴스 필드를 선언한다. 
	String id; 
	String name; 
	String password;
	static String nation = "한국";
	// static 키워드를 붙였다는 것은 객체를 만들지 않아도 사용할 수 있다는 의미이다. 
	// 즉, nation은 힙 영역의 객체안이 아니라 메소드 영역에 저장한다. 
	
	// Constructor -> 생성자는 인스턴스의 멤버가 될 수 없다. 
	User(String name) {
		this.name = name;
	}
	
	// Method -> 인스턴스 메소드안에서는 인스턴스 필드를 얼마든지 쓸 수 있다. 
	void login() {
		// 인스턴스 필드를 사용하고 있다. 
		System.out.println(name + "님이 로그인합니다. ");
	}
	
	void logout() {
		System.out.println(name + "님이 로그아웃 합니다. ");
	}
	
	static void info() {
		// 이 메소드는 객체가 꼭 있어야 하나? NO 
		// 객체가 없어도 사용가능한 메소드도 있다. 
		System.out.println("모든 user는 한국인입니다.");
	}
}
