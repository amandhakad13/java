import java.io.*;

public class Test1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("Demo.txt");	
			int n = fis.available();
			byte[] b = new byte[n];
			fis.read(b);
			String s = new String(b);
			System.out.print(s);
		}
		catch(IOException fe) {
			System.err.println(fe);
		}
		
	}
} 