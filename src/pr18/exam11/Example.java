package pr18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		/* 
		 * System.in.read();
		 * 위에 한 줄과 같은 것임 
			InputStream is = System.in;
			is.read();
			
			결국 InputStream의 read() 3가지를 모두 사용가능하다. 	
			System.in은 InputStream 타입이다. 
		*/
		try {
			InputStream is = System.in;
			byte[] data = new byte[100];
			while(true) {
				int readNum = is.read(data);
				String str = new String(data, 0, readNum-1);
				/*
				 * 100바이트를 모두 읽으면 안돼!! 
				 * 문자 길이만큼 읽어야 해 
				 * 마지막에 엔터 뺴줌 
				 */
				System.out.println(str);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
