package pr18.exam09;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		/*
		 *  EUC-KR  == MS949 
		 *  특수, 알파벳 : 1byte    한글 : 2byte 
		 */
		
		// 추상 클래스라서 객체 생성 불가함 
		// 상대경로 설정하는 법 알아보기 
		String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam09/data.txt";
		try {
			Writer writer = new FileWriter(filePath);
			writer.write(new char[] {'A', '한'});
			writer.write(new char[] {'B', '글', 'C', 'D'}, 0, 2); // 알아두기 
			writer.write("오늘은 날씨가 화창합니다.");
			writer.flush();
			
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
