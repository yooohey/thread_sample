package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileSmple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("hoge.txe");
		FileOutputStream fo;
		try {
			fo = new FileOutputStream(file);
			fo.flush();
			fo.close();
		}catch (Exception e) {
			 System.out.println(e.getStackTrace());			
			
		}
	}

}
