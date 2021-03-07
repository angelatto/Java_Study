package pr15.exam08;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * 	a negative integer 
		 *  A.compareTo(B) 
		 *  
		 *  A가 B보다 크다면 
		 *  A가 B보다 작다면 
		 */
		
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("홍길동", 27));
		set.add(new Person("감자바", 30));
		set.add(new Person("박자바", 28));
		
		for(Person p : set) {
			System.out.println(p.name + ", " + p.age);
		}
		System.out.println();
		
		TreeMap<Person, Integer> map = new TreeMap<>();
		map.put(new Person("홍길동", 27), 95);
		map.put(new Person("김자바", 30), 80);
		map.put(new Person("박자바", 28), 90);
		
		Set<Person> keys = map.keySet();
		for(Person p : keys) {
			System.out.println(p.name + "," + p.age + ":" + map.get(p));
		}
		System.out.println();
		
	}

}
