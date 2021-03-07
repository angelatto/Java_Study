package pr15.exam05;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<User, Board> map = new HashMap<>();
		
		// User의 id만 같으면 동등 객체로 처리 - hashCode와 equals 재정의함 
		map.put(new User("s1", "kelly"), new Board(1, "겨울비"));
		map.put(new User("s1", "john"), new Board(2, "봄돌이"));
	
		System.out.println(map.size());
		
		Board board = map.get(new User("s1", null));
		/*
		 * 덮어쓰기, 유저 아이디가 같으면 동등 객체로 생각되니까 객체는 마지막에 저장한 하나만 남음 
		 */
		System.out.println(board.getBno()); 
		System.out.println(board.getTitle());
	}

}
