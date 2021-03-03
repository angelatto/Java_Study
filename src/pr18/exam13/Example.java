package pr18.exam13;

import java.io.Console;

public class Example {

	public static void main(String[] args) {
		// scanner 대신에 사용 가능 
		// 반드시 터미널을 통해서 실행, 이클립스에서는 널포인트 익셉션 
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("비밀번호: ");
		String password = new String(console.readPassword());
		
		System.out.println(id);
		System.out.println(password);
	}

}
