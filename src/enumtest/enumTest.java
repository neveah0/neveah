package enumtest;

public class enumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        enumDemo[] et=enumDemo.values();
        for(enumDemo e:et) {
        System.out.println(e.getName()+e.getTime());
	}
	}
}
