package pr15.exam07;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("s1", "홍길동");
		map.put("s4", "김자바");
		map.put("s2", "박길순");
		map.put("s3", "방돌이");
		map.put("s5", "디자이너");
		
		// map 반복 처리 
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		// key 내림차순 정렬 
		keys = map.descendingKeySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		// subset, s3 s4만 
		Map<String, String> smap = map.subMap("s3", true, "s5", true);
		keys = smap.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// NHN 시험에 나온 것 
	}
}
