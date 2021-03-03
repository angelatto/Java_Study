package pr18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {

		// 파일 경로 
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam01/data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			
			// 방법1 
			/* while(true) {    // 알파벳 1개에 1바이트 
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}
			is.close(); 
			*/
			
			// 방법2 
			int data = -1;
			while((data = is.read()) != -1) {     // 1byte씩 읽으니까 1024번 반복 
				System.out.print((char)data); // 65, 66, 67 
			}
			is.close(); 
			
			/*
			 *  [방법 3] - 시간을 더 적게 들이는 방법
			 *  방법 2는 파일이 클 수록 시간이 오래 걸린다. 
			 *  
			 *  -> exam03
			 */
			
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
