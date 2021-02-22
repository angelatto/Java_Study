package pr06.exam10;

public class Changer {

	// Field
	
	// Constructor
	
	// Method
	void change(int value) {
		value = 10;
	}
	
	void change(String value) { // 참조타입 
		value = "B";
	}
	
	void change(int[] arr) { // 참조타입 
		arr[0] = 2;
	}
	
	void change(String[] arr) { // 참조타입 
		arr[0] = "B";
	}
	
	void change(Member m) {
		m.age = 2;
	}
	
	
}
