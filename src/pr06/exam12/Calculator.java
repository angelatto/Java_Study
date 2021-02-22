package pr06.exam12;

public class Calculator {
	//Field
	static double pi = 3.14159; // 객체와는 무관한 정적 필드 
	
	//Constructor
	
	
	//Method
	static void plus(int x, int y) { 
		// 이 메소드 안에서 인스턴스 필드가 사용되지 않았기 때문에 객체에 소속되지 않아도 된다. 
		int result = x + y;
		System.out.println(result);
	}
	
	

}
