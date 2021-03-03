package pr18.exam03;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		// 파일 경로 
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam01/data.txt";
		
		try {
			InputStream is = new FileInputStream(filePath);
			
			byte[] data = new byte[8]; // 한번에 1kb 읽으니까 시간 절약 

			// 지정해준 인덱스 2부터 최대 3개 읽을 수 있다. 
			int readNum = -1;
			while((readNum = is.read(data, 2, 3)) != -1) {
				System.out.println(readNum + " : " + Arrays.toString(data));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
