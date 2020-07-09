import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("请输入字符串：");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		test(s);
	}
		
		static void test(String s) {
		try {
			Integer.parseInt(s);
			System.out.println( "yes");
		} catch (NumberFormatException e) {
			System.out.println("no");
			}

	}

}
