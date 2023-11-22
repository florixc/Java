package udp;

import java.io.*;
import java.net.*;

class UDPServer {

    public static void main(String args[]) throws Exception {
        //apre il socket
        DatagramSocket serverSocket = new DatagramSocket(9876);
        while (true) {
            //aspetta il messaggio dal server e lo trasforma in Stringa
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData());
            System.out.println("RECEIVED: " + sentence);
            //manda il messaggio di risposta al client
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String capitalizedSentence = sentence.toUpperCase();
            byte[] sendData = new byte[1024];
            sendData = capitalizedSentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}