package pr18.exam07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		/*
		 *  EUC-KR  == MS949 
		 *  특수, 알파벳 : 1byte    한글 : 2byte 
		 */
		
		// 추상 클래스라서 객체 생성 불가함 
		// 상대경로 설정하는 법 알아보기 
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam07/data.txt";
		try {
//			FileInputStream fis = new FileInputStream(filePath);
//			Reader reader = new InputStreamReader(fis, "UTF-8");

			Reader reader = new FileReader(filePath);
			
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				char charData = (char) charCode;
				System.out.println(charCode + " : " + charData);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
