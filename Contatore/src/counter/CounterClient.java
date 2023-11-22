package counter;

import java.rmi.Naming;

public class CounterClient {

    public static void main(String[] args) {
        try {
            // Cercare l'oggetto remoto nel registro RMI
            Counter counter = (Counter) Naming.lookup("//localhost/Counter");

            // Richiamare il metodo increase() sull'oggetto remoto
            counter.increase(5);
            System.out.println("Chiamata del metodo increase() completata");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
