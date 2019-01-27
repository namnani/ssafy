//190127 Sun
//Network - Server, Client
//created by nani

package networkTest_190127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class ClientConnect {
	public static void main(String[] args) {
		String serverip = "localhost";
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try{
			socket = new Socket(serverip, 6547);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
			System.out.println(br.readLine());
			bw.write(scanner.nextLine());
			bw.newLine();
			bw.flush();
			System.out.println(br.readLine());
		} catch(ConnectException e){
			System.out.println("connec refused");
		}catch(Exception e){
			e.printStackTrace();
		} finally{
			if(scanner != null){
				scanner.close();
			}
			if(socket!= null){
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
