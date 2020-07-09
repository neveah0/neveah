package threadtest;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo td=new ThreadDemo();
		
		td.run();//单线程
//		td.start();多线程
		
		for(int i=0;i<20;i++) {
			System.out.println("Main: "+i);
		}
	}

}
