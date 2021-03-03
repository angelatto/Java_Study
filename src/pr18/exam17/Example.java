package pr18.exam17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception{
		
		String filePath1 = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam17/photo.jpeg";
		String filePath2 = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam17/photo2.jpeg";
		String filePath3 = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam17/photo3.jpeg";
		
		// 주스트림 그대로 사용 
		InputStream is1 = new FileInputStream(filePath1);
		OutputStream os1 = new FileOutputStream(filePath2);
		copy(is1, os1);
		is1.close();
		os1.close();
		
		// 버퍼 보조 스트림을 붙여서 버퍼가 붙은 스트림을 사용함 
		InputStream is2 = new FileInputStream(filePath1);
		BufferedInputStream bis = new BufferedInputStream(is2);
		
		OutputStream os2 = new FileOutputStream(filePath3);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		copy(bis, bos);
		bis.close();
		bos.close(); // 보조 스트림이 클로즈되면 연결된 주 스트림도 클로즈된다. 
		
	}

	public static void copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		int data = -1;
		while((data = is.read()) != -1) {
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		System.out.println("복사 시간 : " + (end - start));

	}
}
