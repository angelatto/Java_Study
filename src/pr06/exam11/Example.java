package pr06.exam11;

public class Example {

	public static void main(String[] args) {

		// 인스턴스 멤버(필드, 메소)는 반드시 객체 참조 변수를 통해서 접근 
		User user1 = new User("이채정");
	
		System.out.println(user1.name);
		user1.login();
		user1.logout();
		
		// 정적 멤버 (필드, 메소드)는 객체가 없이도 사용 가능하다. 
		// how? 클래스로 접근하면 된다. 
		System.out.println(User.nation); // User는 클래스이다. 
		User.info(); //참조변수가 아니라 클래스로 접근 한다. 
		
	}

}
