package pr18.exam08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		/*
		 *  EUC-KR  == MS949 
		 *  특수, 알파벳 : 1byte    한글 : 2byte 
		 */
		
		// 추상 클래스라서 객체 생성 불가함 
		// 상대경로 설정하는 법 알아보기 
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam08/data.txt";
		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			Reader reader = new InputStreamReader(fis, "UTF-8");

			Reader reader = new FileReader(filePath);
			
			char[] data = new char[2]; // 한 번 읽을 때 크기 
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data)) != -1) {
				str += new String(data, 0, readNum);
			}
			System.out.println(str);
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
