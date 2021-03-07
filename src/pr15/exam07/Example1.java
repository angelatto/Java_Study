package pr15.exam07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		/*
		 * Set인터페이스 타입으로 정의해놓으면 부모가 가진 것만 사용할 수 있으니까
		 * 명시적으로 검색 기능과 관련된 메소드를 사용하기 위해 TreeSet 타입으로 정의한다. 
		 * 
		 * 
		 * 정렬하거나 서브셋사용하고 싶을 때 트리셋을 이용한다. 
		 * 
		 */
		
		set.add("홍길동");
		set.add("김자바");
		set.add("박길순");
		set.add("방돌이");
		
		// 사전순 
		for(String item : set){ 
			System.out.println(item);
		}
		System.out.println();
		
		NavigableSet<String> nset = set.descendingSet();
		for(String item : nset) {
			System.out.println(item);
		}
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("가", false, "방돌이", true);
		for(String item : sset) {
			System.out.println(item);
		}
		
	}
}
