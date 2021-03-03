package pr18.exam15;

import java.io.File;
import java.io.IOException;


public class Example {

	public static void main(String[] args) throws IOException {
	
		File file = new File("./data.txt"); //파일 
		if(!file.exists()) {
			file.createNewFile();
		}
		
		file = new File("./dir"); // 디렉토리 
		if(!file.exists()) {
			file.mkdir();
		}
		
//		file = new File(path);
//		if(!file.exists()) {
//			file.delete();
//		}
//		
		
	}

}
