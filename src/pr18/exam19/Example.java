package pr18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Example {

	public static void main(String[] args) throws Exception{

		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam19/data.db";
		OutputStream os = new FileOutputStream(filePath);
		
		String data1 = "안녕하세요.";
		String data2 = "이제 마쳐요";
		/*
		 * 방법 1
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());
		os.flush();
		
		os.close();
		*/
		
		//방법 2
		PrintStream out = new PrintStream(os);
		out.println(data1);
		out.println(data2);
		out.flush();
		out.close();
		
		//PrintWriter로 바꿔도 됨 
	}

}
