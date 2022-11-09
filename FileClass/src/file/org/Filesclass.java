package file.org;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Filesclass {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Colors\\Red\\Green\\Blue\\java.txt" );
		
////To create a folder
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
		
////To create a sub folder
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);
//		
////	To create a file
//		boolean cnf = f.createNewFile();
//		System.out.println(cnf);
		
////	To check the file  created is readable or not
//		boolean cr = f.canRead();
//		System.out.println(cr);
		
////	To check the file  created is writable/editable or not	
//		boolean cw = f.canWrite();
//		System.out.println(cw);
//		
////	To check file is present or not
//		boolean ce = f.canExecute();
//		System.out.println(ce);
//		
////	To check the folder present in the given location or not
//		boolean exists = f.exists();
//		System.out.println(exists);

////		To check the folder present in the given folder or not
//		String[] list = f.list();
//		for (String string : list) {
//			System.out.println(string);
//			}
		
////	To list the file present in the folder along with the path
//		File[] lf = f.listFiles();
//		for (File file : lf) {
//			System.out.println(file);
		
//	To write a file
		FileUtils.write(f, "Welcome to java class");
			
		
//	To add a file
	FileUtils.write(f, "\n next class will be selenium", false);
	
//	To overwrite the value
	FileUtils.write(f, "We will study Maven", false);
	
//	To read your file
	List<String> readLines = FileUtils.readLines(f);
	for (String string : readLines) {
		System.out.println(string);
		}
	File f1 = new File("C:\\Colors\\Red\\Green\\Blue\\sample.txt");
	
//	To copy data from one file to another file
	FileUtils.copyFile(f, f1);	
	
	}

}
