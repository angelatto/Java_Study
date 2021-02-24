package pr09.exam03;

public class A {

	public void method(int x) {
		int y = 2;
		
		//x = 10;
		//y = 20;
		
		class B { 
			// 컴파일하게 되면 x와 y 를 이 클래스 안으로 값을 복사해온다.  
			public void method() {
				int result = x + y;
			}
		}
	}
	
}
