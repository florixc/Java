package contatore.server;

import contatore.Contatore;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

class ContatoreServer extends UnicastRemoteObject implements Contatore {

    private int count;

    public ContatoreServer() throws RemoteException {
        count = 0;
    }

    public static void inizio() {
        try {
            // Creare un'istanza del contatore
            Contatore contatore = new ContatoreServer();
            // Creare un registro RMI
            LocateRegistry.createRegistry(1099);
            // Registrare l'oggetto remoto nel registro RMI
            Naming.rebind("//localhost/Contatore", contatore);
            System.out.println("Contatore è pronto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void aumenta(int amount) throws RemoteException {
        count += amount;
        System.out.println("Il contatore è stato aumentato di " + amount + " e ora è " + count);
    }
}
