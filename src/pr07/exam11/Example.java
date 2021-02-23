package pr07.exam11;

public class Example {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		Animal animal2 = new Cat(); 
		
		animal1.eat();
		animal1.sleep();
		animal1.sound(); // 다형성 
		
		animal2.eat();
		animal2.sleep();
		animal2.sound(); // 다형성 - 자식 객체에 오버라이딩한 메소드 출력 
		
	}

}
