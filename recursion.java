import java.io.File;

public class recursion {
	public void walk(File directory, int indentation) {
		File[] fileList = directory.listFiles();
		for (int i=0;i<indentation;i++) {
			System.out.print("	");
		}
		System.out.println("Dir:" + directory);
		for (File file : fileList) {
			
			if (file.isDirectory()) {
				walk(file, ++indentation);
			} else {
				for (int i=0;i<indentation;i++) {
					String str = ("	");
					System.out.println(str);
				}
					System.out.println(file.getName());
				}
			}
		}
	public static void main(String args[]) {
		recursion test = new recursion();
		// File file = new File("D:\\java files");
		test.walk(new File("D:\\java files"), 0);
	}
}
//filelist.length>0