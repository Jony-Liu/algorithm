package com.example.algorithm.socket.udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Jony-Liu
 */
public class UDP_Send {
    public static void main(String[] args) {
        try {
            DatagramSocket send = new DatagramSocket();
            byte[] b = "hello".getBytes();
            DatagramPacket packet = new DatagramPacket(b, 0, b.length, InetAddress.getByName("127.0.0.1"),10000);
            send.send(packet);
            send.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
