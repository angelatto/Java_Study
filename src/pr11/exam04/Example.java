package pr11.exam04;

public class Example {

	public static void main(String[] args) {
		
		// 1. 번지를 얻는 첫 번째 방법 
		Class var1 = A.class;
		var1.getDeclaredConstructors();
		
		// 2. 두 번째 방법 
		A a = new A();
		Class var2 = a.getClass();
		

	}

}
