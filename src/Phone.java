import java.util.Scanner;

public class Phone {

	
	public String replaceStar(String phoneNumber) {
		String result;
		String str1= phoneNumber.substring(0, 3);
		String str2=phoneNumber.substring(phoneNumber.length()-4, phoneNumber.length());
		StringBuffer sbuff= new StringBuffer();
		sbuff=sbuff.append(str1).append("****").append(str2);
		result=sbuff.toString();
		return result;
		}
	
	 public static void main(String[] args) {
	        Phone phone=new Phone();	       
	        System.out.println("请输入手机号：");
			Scanner scan=new Scanner(System.in);
			String s=scan.next();
			System.out.println(phone.replaceStar(s));
	 }
	
}
