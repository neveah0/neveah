import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("d:/io/person.txt");
			
			ois = new ObjectInputStream(fis);
			
			//对象反序列化
			Object o1 = null;
			
//			while((o1=ois.readObject()) != null) {
//				Person p = (Person)o1;
//				System.out.println(p.toString());
//			}
			
			while(fis.available()>0) {
				o1=ois.readObject();
				Person p = (Person)o1;
				System.out.println(p.toString());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		catch (EOFException e) {
//			System.out.println("文件读取完成");
//		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
