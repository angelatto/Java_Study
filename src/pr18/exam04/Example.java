package pr18.exam04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam01/data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			os.write(65);
			os.write(66);
			os.write(69);
			os.flush(); // 버퍼에 남아있는 것 모두 꺼내기 
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
