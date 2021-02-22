package pr06.exam13;

public class Example {

	public static void main(String[] args) {
		
		// 생성자를 이용해서 객체 얻기 
		// Singleton result1 = new Singleton();
		// 생성자가 private으로 제한되면 밖에서 new로 객체 생성할 수 없다. 
		
		// Factory Method
		Singleton result1 = Singleton.getInstance();
		Singleton result2 = Singleton.getInstance();
		
		if(result1 == result2) {
			System.out.println("같은 객체를 참조");
		}else {
			System.out.println("다른 객체를 참조");
		}
	}
}
