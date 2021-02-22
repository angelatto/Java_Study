package pr06.exam12;

public class Example {

	public static void main(String[] args) {
		// 메인 메소드는 객체와 무관하게 실행되기 때문에 static이 붙은 것이다. 
		System.out.println(Calculator.pi);
		Calculator.plus(3, 5);
		
		// 잘못된 사용 방법 
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.pi); 
		myCalc.plus(2, 5); 
		
		
	}
}
