package pr18.exam02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		// 파일 경로 
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam01/data.txt";
		
		try {
			InputStream is = new FileInputStream(filePath);
			
			byte[] data = new byte[1024]; // 한번에 1kb 읽으니까 시간 절약 
			
			// 방법 1 
			/*
			 * 읽은 바이트는 data로 들어가고, read()메소드의 결과값은 바이트 수 이다. 
			 * 
			 * call by reference - 배열 복사해서 들어감 
			 */
//			while(true) {
//				int readNum = is.read(data); 
//				if(readNum == -1 ) {
//					break;
//				}
//				System.out.println(readNum + " : " + Arrays.toString(data));
//			}
//			is.close();
			
			// 방법 2 
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum + " : " + Arrays.toString(data));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
