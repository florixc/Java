package counter;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CounterServer {
    public static void main(String[] args) {
        try {
            // Creare un'istanza del contatore
            Counter counter = new CounterImpl();

            // Creare un registro RMI
            LocateRegistry.createRegistry(1099);

            // Registrare l'oggetto remoto nel registro RMI
            Naming.rebind("//localhost/Counter", counter);
            System.out.println("CounterServer è pronto");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




