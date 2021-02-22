package pr06.exam02;

public class Example {

	public static void main(String[] args) {
		
		// 객체 생성 
		Car myCar = new Car();  // Car 타입의 myCar 변수 선언 
		
		// myCar 변수가 참조하는 객체가 가지고 있는 company 필드의 데이터를 읽겠다. 
		// 필드의 값을 읽기 
		System.out.println(myCar.company); // null
		System.out.println(myCar.model);  // null
		System.out.println(myCar.price);  // 0 
		System.out.println(myCar.old);	// false
		System.out.println(myCar.speed);  // 0 
		
		// 필드의 값을 변경
		myCar.company = "현대자동차";
		myCar.model = "그랜저";
		myCar.price = 30000000;
		myCar.old = true;
		myCar.speed = 60;
		
		System.out.println(myCar.company); 
		System.out.println(myCar.model);  
		System.out.println(myCar.price);  
		System.out.println(myCar.old);	
		System.out.println(myCar.speed);  
		
		// 다른 객체를 생성 , 객체는 서로 독립적이다. 
		Car yourCar = new Car();
		
		
	}

}
