package pr15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
	
		// 타입을 지정해준다 
		//List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();
		/*
		 * List<타입> 요 앞에 타입과 동일하다는 의미로 뒤에 타입은 생략 가능 하다. 
		 */
		// List에는 객체의 번지가 저장됨 
		
		// 객체 저장 
		list.add("홍길동");
		list.add("홍길동");
		//list.add(3); // auto-boxing되어서 Integer 객체가 저장됨 
		//list.add(new Board());
		System.out.println(list.size()); // 실제 저장된 개수가 몇개냐 
		
		// 객체 얻기 
		//	String name = (String) list.get(0); // 강제 타입 변환 
		// 위에 타입 지정해주면 타입 변환 안해줘도 됨  
		// 모두 같은 타입인게 보장이 되기 때문에 Object로 안가져옴 
		String name1 = list.get(0); 
		String name2 = list.get(1); 
		
		
		// 객체 제거 
		list.remove(0);
		list.remove(0);
		System.out.println(list.size()); 
		
	}

}
