import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class TestMap {

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
      Map m =new HashMap();
      m.put("swt", 18);
      m.put(null,43);
      m.put("swt",19);
      Set s=m.keySet();
      
		Iterator it= s.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println(m.get(null));
	}

}
