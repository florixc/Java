package udp;

import java.io.*;
import java.net.*;

class UDPClient {

    public static void main(String args[]) throws Exception {
        //legge messaggio da tastiera e lo trasforma in byte
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        String sentence = inFromUser.readLine();
        byte[] sendData = new byte[1024];
        sendData = sentence.getBytes();
        //apre il socket
        InetAddress IPAddress = InetAddress.getByName("localhost");
        DatagramSocket clientSocket = new DatagramSocket();
        //manda messaggio in byte al destinatario
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);
        //aspetta il messaggio dal client
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);
        String modifiedSentence = new String(receivePacket.getData());
        System.out.println("FROM SERVER:" + modifiedSentence);
        //chiude il socket
        clientSocket.close();
    }
}