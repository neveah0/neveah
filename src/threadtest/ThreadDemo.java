package threadtest;

public class ThreadDemo extends Thread {

	 public void run(){
		for(int i=0;i<20;i++) {
			System.out.println("thread:"+i);
		}
	}
}
