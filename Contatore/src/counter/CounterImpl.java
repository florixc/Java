package counter;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class CounterImpl extends UnicastRemoteObject implements Counter {
    private int count = 0;

    public CounterImpl() throws RemoteException {
    }

    @Override
    public void increase(int amount) throws RemoteException {
        count += amount;
        System.out.println("Il contatore è stato aumentato di " + amount + " e ora è " + count);
    }
}