package com.example.algorithm.socket.demo02;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        FileInputStream file =null;
        OutputStream out= null;
        InputStream in = null;
        try {
            socket = new Socket(InetAddress.getByName("localhost"), 54865);
            out = socket.getOutputStream();
            file = new FileInputStream(new File("D:\\timg.jpg"));
            int len;
            byte[] bytes = new byte[1024];
            while((len=file.read(bytes))!=-1){
                out.write(bytes, 0, len);
            }
            //客户端在发送数据后，需要在接受数据之前调用shutdownOutput,关闭输出流
            socket.shutdownOutput();
            byte[] b2 = new byte[1024];
            in = socket.getInputStream();
            while((len = in.read(b2))!=-1){
                String str =new String(b2, 0, len);
                System.out.println("服务端："+str);
            }
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                if(in!=null){
                    in.close();
                }
                if(out!=null){
                    out.close();
                }
                if(file!=null){
                    file.close();
                }
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

