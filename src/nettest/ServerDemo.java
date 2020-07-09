package nettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println("#########server#########");
		ServerSocket ss=null;
		BufferedReader in =null;
		PrintWriter out=null;
     try {
	    ss= new ServerSocket(8888);
		Socket s = ss.accept();
		System.out.println("有客户端连接 IP地址"+s.getInetAddress().getHostAddress());
		System.out.println("有客户端连接 端口号"+s.getPort());
		 while(true) {
		//s.getInputStream()
		in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String clientStr =in.readLine();
		System.out.println("客户端发送来的消息是："+clientStr);
	      
		//服务器收到数据后，给客户端返回消息
		System.out.println("服务器端输入数据，向客户端发送");
        Scanner sc = new Scanner(System.in);
        String serverStr = sc.nextLine();
 
        //s.getOutputStream()获得socket的输出流
        out =new PrintWriter(
        		new OutputStreamWriter(s.getOutputStream()));
        out.write(serverStr+"\r\n");
        out.flush();}
        
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(in!=null) {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ss!=null) {
			try {
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

}
