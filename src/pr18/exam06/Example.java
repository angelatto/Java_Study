package pr18.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	 // 카피 프로그램 
	public static void main(String[] args) {
		
		String filePath1 = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam06/photo2.jpg";
		String filePath2 = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam06/photo3.jpg";
		
		try {
			InputStream is = new FileInputStream(filePath1);
			OutputStream os = new FileOutputStream(filePath2);
			
			byte[] data = new byte[1024];
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				os.write(data, 0, readNum); // 내가 보낼 바이트만 보낼 수 있다. 이 메소드를 잘 알아두어야 한다. 
			}
			os.flush();
			
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
