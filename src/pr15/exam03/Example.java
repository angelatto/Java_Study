package pr15.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
	
		List<Board> list = new ArrayList<>();
		List<Board> list2 = new Vector<>();
		/*
		 * 다형성 :사용방법은 같은데 객체를 바꾸면 성능이 달라진다. 
		 * 
		 * 
		 * ArrayList는 언제 쓰면 좋은가? 
		 * - 싱글 스레드 환경에서 사용 
		 * 
		 * Vector는 언제 쓰면 좋은가? 
		 * - 멀티 스레드 환경에서 사용 할 때 
		 */
		
		
		// 객체 저장
		list.add(new Board(1, "제목1"));
		
		// 객체 얻기 
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + ": " + board1.getTitle());
		
		// 반복 처리 
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + ": " + board.getTitle());
		}
		
		/*
		 * 저 아래에 list 자리에 올 수 있는 것은 
		 * Iterable 인터페이스로 사용가능한 것들은 모두 올 수 있다. 
		 * 
		 */
		for(Board board : list) {
			System.out.println(board.getBno() + ": " + board.getTitle());
		}
		
		// 객체 제거 
		list.remove(0);
		System.out.println("");
		
		
	}

}
