import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   List s=new ArrayList();
		
	   s.add(123);
	   s.add(156);
	   s.add(123);
	   s.add("hi");
	   System.out.println(s);
	   
	   Iterator it= s.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	   
	   System.out.println(s.size());
	   
	   
	}

}
