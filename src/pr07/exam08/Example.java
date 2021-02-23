package pr07.exam08;

public class Example {

	public static void main(String[] args) {
		
		Car car = new Car();
		//car.run();
		
		car.t1 = new TireChild1(); // 타입변환 (부모타입 <-- 자식타입)
		car.t2 = new TireChild2();  // run 메소드 재정의 
		car.run(); // 실행 결과가 달라진다. -> 다형성이다. 

	}

}
