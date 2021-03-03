package pr18.exam12;

import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {

		/*
			OutputStream os = System.out;
			os.write(b);
			
			System.out은 OutputStream 타입이다. 
		*/
		
		try {
			OutputStream os = System.out;
			os.write(65);
			System.out.write(new byte[] {65, 67, 68});
			System.out.write(new byte[] {65, 67, 68}, 0, 2);
			os.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
