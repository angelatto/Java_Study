package pr06.exam14;

public class Korean {

	// Field
	static final String NATION = "한국";
	final String ssn; 
	
	/*
	 * static은 객체마다 부여되는 것이 아니라는 의미이고,
	 * final은 값이 변하지 않는다는 의미이다. 
	 * 
	 * static final은 대문자로 선언하는게 관례이다. 
	 * 
	 * final만 붙어있다면 객체마다 갖는 값이고, 한 번 값을 줘야하는데
	 * 생성자를 호출할 때 값을 주고 변경할 수 없다. 
	 * 
	 */
	
	// Constructor
	Korean(String ssn) {
		this.ssn = ssn;
	}
	
	// Method
	
	
}
