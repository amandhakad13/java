import java.io.*;

class Test3 {
	public static void main(String[] args) {
		int sCount = 0, scCount = 0, charcter = 0, digitCount = 0;
		FileInputStream fis = null;
		
		try {
		    fis = new FileInputStream("Demo.txt");
			int n = fis.available();
			byte[] b = new byte[n];
			fis.read(b);
			for(int i=0; i<n; i++) {
				if(b[i]==32) {
					sCount++;
				}
				else if((b[i]>=65&&b[i]<=90)||(b[i]>=97&&b[i]<=122)) {
					charcter++;
				}
				else if(b[i]>=48&&b[i]<=57) {
					digitCount++;
				}
				else {
					scCount++;
				}
			}
			System.out.println("Spaces = "+sCount);
			System.out.println("Characters = "+charcter);
			System.out.println("digits = "+digitCount);
			System.out.println("Special Characters = "+scCount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}