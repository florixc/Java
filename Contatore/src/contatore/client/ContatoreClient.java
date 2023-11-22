package contatore.client;

import contatore.Contatore;
import java.rmi.Naming;

public class ContatoreClient {

    public ContatoreClient() {

    }

    public static Contatore connetti(String host) {
        Contatore contatore = null;
        try {
            // Cercare l'oggetto remoto nel registro RMI
            contatore = (Contatore) Naming.lookup("//" + host + "/Contatore");
            //contatore = (Contatore) Naming.lookup("//localhost/Contatore");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return contatore;
    }
}
