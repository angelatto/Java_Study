package pr06.exam17;

public class User {
	// Field
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	
	// Method
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	public Boolean isAdult() { // boolean getter는 is로 시작한다. 
		return adult;
	}
	
	
	// Setter
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
	}
	
	// getter
	public int getAge() {
		return age;
	}
	
	public void setPassword(String password) { // 쓰기전용필드 
		this.password = password;
	}


}
