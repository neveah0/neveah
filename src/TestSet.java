import java.util.HashSet;
import java.util.Set;

public class TestSet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 Set s= new  HashSet();
		 System.out.println(s.isEmpty());
		 s.add(123);
		 s.add("p");
		 s.add("p1");
		 System.out.println(s);
		 s.remove("p");
		 System.out.println(s);
		 System.out.println(s.size());
		 System.out.println(s.isEmpty());
		 System.out.println(s.contains(123));
		 System.out.println(s.contains(456));
	}

}
