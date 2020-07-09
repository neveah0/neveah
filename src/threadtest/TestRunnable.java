package threadtest;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RunnableDemo rd= new RunnableDemo();
         
     Thread t =new Thread(rd);
     t.start();   
     for(int i=0;i<20;i++) {
			System.out.println("Main: "+i);
	}

}
}