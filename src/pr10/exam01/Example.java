package pr10.exam01;

import java.io.FileInputStream;

public class Example {
	
	public static void main(String[] args) {
		
		int[] arr = null;
		arr[0] = 10;  // NullPointerException => 실행 예외 (컴파일러가 체크하지 않음)
		
		// FileNotFoundException => 일반 예외 (컴파일 체크 예외 )
		// FileInputStream fi = new FileInputStream("C:/Temp/file.txt"); 
		
		
	}

}
