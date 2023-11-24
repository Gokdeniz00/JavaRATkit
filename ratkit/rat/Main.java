package ratkit.rat;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  command=(String)dis.readUTF();

            ss.close(); 
        }catch(Exception e){
            System.err.println(e);
        }
    
    }
    private static void execute(String command){

    }
}
