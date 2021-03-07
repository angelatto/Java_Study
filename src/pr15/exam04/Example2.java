package pr15.exam04;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {

		Set<User> set = new HashSet<>();
		
		User user1 = new User("winter", "한겨울");
		User user2 = new User("winter", "한겨울");
		
		
		set.add(user1);
		set.add(user2);
		
		// 주의) Object이 가지고 있는 equals는 번지비교이다. !!!!! 
		// 동등 객체 만들기 -> hashCode()와 equals() 재정의 
		System.out.println(user1.equals(user2));
		System.out.println(user1.hashCode() == user2.hashCode());
		System.out.println(set.size());
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
 	}

}
