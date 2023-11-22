package counter;


import java.rmi.RemoteException;

interface Counter extends java.rmi.Remote {
    public void increase(int amount) throws RemoteException;
}
