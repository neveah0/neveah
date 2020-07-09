import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File file1=new File("d:/io/abc.txt");
		
		try {
			FileInputStream fis=new FileInputStream(file1);
			byte b[]=new byte[fis.available()];
			System.out.println(fis.read(b));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
