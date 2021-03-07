package pr15.exam10;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList<>();
		queue.offer("홍길동");
		queue.offer("김자바");
		queue.offer("이채정");
		
		while(!queue.isEmpty()) {
			String item = queue.poll();
			System.out.println(item);
		}
	}

}
