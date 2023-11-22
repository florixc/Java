package contatore;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Contatore extends Remote {

    public void aumenta(int amount) throws RemoteException;
}
