package pr10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) {
		try {
			method("/Users/homecj/Downloads");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		}
	}
	
	
	// main 안에서 호출하려면 객체의 생성과 무관하게 사용해야 하니까 static을 붙여야 한다. 
	// 이 메소드 입장에서 나를 잘못사용하면 쓰로우 할 수 도 있어.
	// 나를 호출하는 곳에서 예외처리를 해야해 ~~~ 
	// 나를 잘 사용해야해 잘 못 사용하면 이런 예외 발생할 수도 있어 처리는 너가 알아서해 
	public static void method(String filePath) throws FileNotFoundException{

		FileInputStream fis = new FileInputStream(filePath);
		
//		try {
//			FileInputStream fis = new FileInputStream(filePath);
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 없습니다.");
//		}
//		
	}
}
