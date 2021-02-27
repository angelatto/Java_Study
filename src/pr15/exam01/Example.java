package pr15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
	
		List list = new ArrayList();
		// List에는 객체의 번지가 저장됨 
		
		// 객체 저장 
		list.add("홍길동");
		list.add(3); // auto-boxing되어서 Integer 객체가 저장됨 
		//list.add(new Board());
		System.out.println(list.size()); // 실제 저장된 개수가 몇개냐 
		
		// 객체 얻기 
		String name = (String) list.get(0); // 강제 타입 변환 
		int value = (Integer)list.get(1); 
		/*
		 * Object --------> Integer --------> Int 
		 *        강제타입변환           오토언박싱 
		 */
		
		
		// 객체 제거 
		list.remove(0);
		list.remove(0);
		System.out.println(list.size()); 
		
	}

}
