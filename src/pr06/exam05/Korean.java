package pr06.exam05;

public class Korean {

	// Field - 밑에서 선언하더라도 위에서 사용할 수 있다. 
	// 일반 변수는 미리 선언되어야 사용할 수 있다. 
	String nation = "한국";
	String name;
	String ssn;
	int age;

	// Constructor Overloading 
	Korean(){ // this는 객체 자신을 가리킨다. 
		this("angelatto", "000000-0000000"); // this()는 내가(객체 자신)이 가진 생성자를 호출하겠다. 
		//주의 : 생성자 메소드 안에서 생성자를 호출할 때는 생성자가 가장 먼저 호출되어야 한다. 
		System.out.println("Korean() 실행");
	}
	
	Korean(String name) {
		this(name, "000000-0000000", 1);
		System.out.println("Korean(String name) 실행");
	}
	
	Korean(String name, String ssn) {
		this(name, ssn, 1);
		System.out.println("Korean(String name, String ssn) 실행");
	}
	
	Korean(String name, String ssn, int age) {
		this.name = name; 
		this.ssn = ssn; 
		this.age = 1;
	}
	
	Korean(String name, int age, String ssn) {
		this(name, ssn, 1);
	}
	
	
}
