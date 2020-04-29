package com.example.algorithm.socket.demo01;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Jony-Liu
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket serversocket=null;
        Socket socket = null;
        DataOutputStream out= null;
        DataInputStream input =null;
        try {
            serversocket = new ServerSocket(8989);
            System.out.println("服务端开启等待");
            socket = serversocket.accept();//
            input = new DataInputStream(socket.getInputStream());

            System.out.print("客户端：");
            System.out.println(input.readUTF());

            System.out.println("服务端准备发送");
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("haha");
            System.out.println("服务端发送成功");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                if(out!=null){
                    out.close();
                }
                if(input!=null){
                    input.close();
                }
                if(socket!=null){
                    socket.close();
                }
                if(serversocket!=null){
                    serversocket.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
