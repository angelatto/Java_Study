package pr18.exam10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Example {

	// 카피 프로그램 
	public static void main(String[] args) {
		
		String filePath1 = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam10/data.txt";
		String filePath2 = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam10/data2.txt";
		
		try {
			// 입력스트림, 출력스트림 만들기 
			Reader reader = new FileReader(filePath1);
			Writer writer = new FileWriter(filePath2);
			
			char[] data = new char[1024];
			int readNum = -1;
			
			while((readNum = reader.read(data)) != -1) {
				writer.write(data, 0, readNum);
			}
			writer.flush();
			
			reader.close();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
