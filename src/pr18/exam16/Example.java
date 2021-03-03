package pr18.exam16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {
	
		// 방법1 - 비효율적
//		InputStream is = System.in;
//		byte[] data = new byte[100];
//		
//		int readNum = is.read(data);
//		String str = new String(data, 0, readNum-1);
//		System.out.println(str);
		
		// 방법2 - 보조스트림 이용
		InputStream is = System.in;
		// 문자 변환되는 보조 스트림 
		InputStreamReader isr = new InputStreamReader(is); 
		// 성능 향상 보조 스트림 
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		System.out.println(str);
	}

}
