import java.io.File;
import java.io.IOException;

public class FileTest {

	
	public static void main(String[] args) throws IOException {
		File f1= new File("d:/io/abc.txt");
		
		
		if(f1.exists()) {
			f1.delete();
			System.out.println("文件被删除了");
		}else {
			
		try{
			f1.createNewFile();}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		System.out.println("文件名："+f1.getName());
		System.out.println("路径名："+f1.getPath());
		System.out.println("绝对路径："+f1.getAbsolutePath());
		System.out.println("文件可读性："+f1.canRead());
		System.out.println("文件可写性:"+f1.canWrite());
	}
}
}