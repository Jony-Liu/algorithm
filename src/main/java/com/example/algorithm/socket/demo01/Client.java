package com.example.algorithm.socket.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket client = null;
        DataOutputStream out = null;
        DataInputStream input = null;
        try {
            client = new Socket(InetAddress.getByName("127.0.0.1"), 8989);
            out = new DataOutputStream(client.getOutputStream());
            System.out.println("客户端准备传送");
            out.writeUTF("hello");
            System.out.println("客户端已经传送");

            //client.shutdownOutput();

            input = new DataInputStream(client.getInputStream());
            System.out.print("服务端：");
            System.out.println(input.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (input != null) {
                    input.close();
                }
                if (client != null) {
                    client.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

