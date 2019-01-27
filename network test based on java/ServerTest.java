//190127 Sun
//Network - Server, Client
//created by nani

package networkTest_190127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		try(ServerSocket ss = new ServerSocket(6547)){
			System.out.println("[server is ready]");
			
			while(true){
				try(Socket socket = ss.accept()){
					System.out.printf("client접속: %s\n", socket.getInetAddress());
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
					
					bw.write(socket.getInetAddress().getHostName()+"님 성함은?");
					bw.newLine();
					bw.flush();
					String line = br.readLine();
					System.out.println(line);
					bw.write(line+"님 반갑습니다.");
					bw.newLine();
					bw.flush();
				} catch(IOException e){
					System.out.println("통신 오류");
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
