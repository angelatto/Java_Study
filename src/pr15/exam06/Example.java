package pr15.exam06;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		// 절대 경로 
		//prop.load(new FileReader("/Users/homecj/dev/workspace/eclipse/20210216/Java/src/pr15/exam06/database.properties"));
		
		// 상대 경로 
		String path = Example.class.getResource("database.properties").getPath();
		prop.load(new FileReader(path));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
	
		// ISO8859_1 = ASCII(특수기호, 숫자, 알파벳만 가능)
		String nation = prop.getProperty("nation");
		System.out.println(nation);
		
		
	}

}
