import java.io.*;

public class Test2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("Demo.txt");
			int size = fis.available();
			byte[] b = new byte[size];
			fis.read(b);
			fos = new FileOutputStream("Demo2.txt");
			fos.write(b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close();
				fos.close();
			}
			catch(Exception e) {
				System.out.println(e);
		}
		}
	}
}