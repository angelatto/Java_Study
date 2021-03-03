package pr18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception {
		/*
		String filePath = "Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);

		String data = "오늘은 수요일이다.";
		byte[] bytes = data.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		
		String data = "날씨가 좋네요";
		byte[] bytes = data.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		
		os.close();
		
		*/
		
		String filePath = "Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		
		String data = "오늘은 수요일이다.";
		writer.write(data);
		writer.flush();
		
	    data = "날씨가 좋네요";
		writer.write(data);
		writer.flush();
		
		writer.close();
		
		
	}

}
