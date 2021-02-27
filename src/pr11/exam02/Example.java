package pr11.exam02;

import java.util.Date;

import pr11.exam02.Member;

public class Example {

	public static void main(String[] args) {

		Object var1 = new Object();
		System.out.println(var1.toString());
		
		Date var2 = new Date();
		System.out.println(var2.toString());
		
		String var3 = "abc";
		System.out.println(var3.toString());
		
		Member var4 = new Member("winter", "늦겨울");
		System.out.println(var4.toString());
		System.out.println(var4); // 참조변수의 toStirng을 호출해서 그 결과를 호출 
		
		String result = var4 + " => spring: 봄돌이"; // toString 자동 호출 
		System.out.println(result);
		
		
	}

}
