package pr15.exam05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		// Map 생성 , Map 키 타입과 값 타입 정의함 
		Map<String, String> map = new HashMap<>(); // 뒤에 타입은 중복되어 생략 가능 
		
		// Entry 저장 
		map.put("s1", "홍길동");
		map.put("s2", "김자바");
		map.put("s3", "개발자");
		System.out.println(map.size()); // 크기 
		
		
		// 키의 값 가져오기 
		String s1 = map.get("s1");
		System.out.println(s1);
		
		/*
		 * <반복 처리>
		    방법1) entrySet()
		    방법2)  keySet()
		    
		    iterator를 쓰려면 iterable 인터페이스를 사용할 수 있는 객체만 가능하다. 
		    Map은 불가능하다. 
		    
		    map에서 iterable 인터페이스를 사용가능한 set으로 변환한다. 
		 * 
		 */
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	
		Set<String> set2 = map.keySet();
		for(String k : set2) {
			System.out.println(k + " : " + map.get(k));
		}
		
		// 삭제 
		map.remove("s1");
		map.clear();
		
		
	}

}
