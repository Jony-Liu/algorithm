package com.example.algorithm.socket.demo02;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serversocket = null;
        Socket socket = null;
        InputStream in = null;
        OutputStream out = null;
        FileOutputStream file = null;
        try {
            serversocket = new ServerSocket(54865);
            System.out.println("准备接受");
            socket = serversocket.accept();
            in = socket.getInputStream();
            File f = new File("D:\\copy.jpg");
            f.createNewFile();
            file = new FileOutputStream(f);
            byte[] bytes = new byte[1024];
            System.out.println("开始传输");
            int len;
            while ((len = in.read(bytes)) != -1) {
                file.write(bytes, 0, len);
            }
            //System.out.println(f.getAbsolutePath());
            System.out.println("图片传输完成");
			out = socket.getOutputStream();
			out.write("我是服务器，我已经接受到图片了".getBytes());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
                if (socket != null) {
                    socket.close();
                }
                if (serversocket != null) {
                    serversocket.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
