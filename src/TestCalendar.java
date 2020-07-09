import java.util.Calendar;

public class TestCalendar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar a =Calendar.getInstance();
		System.out.println(a.get(Calendar.YEAR)+"年"+(a.get(Calendar.MONTH)+1)+"月"+a.get(Calendar.DAY_OF_MONTH)+"日");
		
		a.set(2001, 10, 8);
		System.out.println(a.get(Calendar.YEAR)+"年"+(a.get(Calendar.MONTH)+1)+"月"+a.get(Calendar.DAY_OF_MONTH)+"日");
	}
}
