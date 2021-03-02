package pr18.exam05;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam01/data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			os.write(arr);
			os.write(arr, 0, arr.length); // 0번째 인덱스부터 몇개까지 write 
			
			os.flush(); // 버퍼에 남아있는 것 모두 꺼내기 
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
