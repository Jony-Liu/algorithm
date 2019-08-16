package com.example.algorithm.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Receive {
    public static void main(String[] args) {
        try {
            DatagramSocket receive = new DatagramSocket(10000);
            byte[] b = new byte[1024];
            DatagramPacket packet = new DatagramPacket(b, b.length);
            receive.receive(packet);
            String str= new String(packet.getData(),0,packet.getLength());
            System.out.println(str);
            receive.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}