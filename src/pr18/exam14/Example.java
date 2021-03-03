package pr18.exam14;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		try {
			String filePath = "/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr18/exam14/data.txt";
			InputStream is = new FileInputStream(filePath);
			Scanner scanner = new Scanner(is);
			int count = 1;
			
			while(true) {
				try {
					String data = scanner.nextLine();
					System.out.println(count + ": " + data);
					count++;
				} catch(Exception e) {
					break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
