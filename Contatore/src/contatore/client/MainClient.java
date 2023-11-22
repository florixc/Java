package contatore.client;

import contatore.Contatore;
import java.rmi.RemoteException;

public class MainClient {

    public static void main(String[] args) {
        Contatore contatore = ContatoreClient.connetti("localhost");
        try {
            contatore.aumenta(10);
            System.out.println("Chiamata del metodo increase() completata");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
