package pr06.exam04;

public class Korean {

	// Constructor
	Korean() {}
	
	Korean(String name, String ssn) {
		this.name = name; // this는 객체 자신이다. 
		this.ssn = ssn;  // this는 객체 자신이 가지고 있는 field data 
	}
	
	// Field - 밑에서 선언하더라도 위에서 사용할 수 있다. 
	// 일반 변수는 미리 선언되어야 사용할 수 있다. 
	String nation = "한국";
	String name;
	String ssn;
	
	
}
