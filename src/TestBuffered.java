import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffered {
  
	public static void main(String[] args) {
		File fi =new File("d:/io/abc.txt");
		try {
			FileReader fr=new FileReader(fi);
			FileWriter fw=new FileWriter("d:/io/wei.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
	       bw.write("nihao");
	       bw.newLine();
	       bw.write("昨天天气很好");
	       bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
