/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barruzzo;

import barruzzo.model.Classe;
import barruzzo.model.Cliente;
import barruzzo.model.Ordinazione;
import barruzzo.model.Prodotto;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author Studente
 */
public class Singleton {

    private static Singleton instance; // statico e protetto da accesso esterno

    private Singleton() {
        listaprodotti = new ArrayList();
        listaclassi = new ArrayList();
        listaordinazioni = new ArrayList();
        listaclienti = new ArrayList();
        apri();
    }

    public static Singleton getInstance() {
        if (instance == null) { // solamente quando non esiste alcuna istanza, ne crea una nuova
            instance = new Singleton();
        }
        return instance;
    }

    private ArrayList listaprodotti; //di prodotti
    private ArrayList listaclassi;
    private ArrayList listaordinazioni;
    private ArrayList listaclienti;

    public ArrayList getListaclassi() {
        return listaclassi;
    }

    public void setListaclassi(ArrayList listaclassi) {
        this.listaclassi = listaclassi;
    }

    public ArrayList getListaordinazioni() {
        return listaordinazioni;
    }

    public void setListaordinazioni(ArrayList listaordinazioni) {
        this.listaordinazioni = listaordinazioni;
    }

    public ArrayList getListaclienti() {
        return listaclienti;
    }

    public void setListaclienti(ArrayList listaclienti) {
        this.listaclienti = listaclienti;
    }

    public ArrayList getListaprodotti() {
        return listaprodotti;
    }

    public void setListaprodotti(ArrayList listaprodotti) {
        this.listaprodotti = listaprodotti;
    }

    public String exportaXML() {
        Element barruzzo = new Element("barruzzo");
        Element prodotti = new Element("prodotti");
        barruzzo.appendChild(prodotti);
        for (int i = 0; i < listaprodotti.size(); i++) {
            Element prodotto = new Element("prodotto");
            Prodotto prod = (Prodotto) listaprodotti.get(i);
            Element idprodotto = new Element("idprodotto");
            idprodotto.appendChild(prod.getIdProdotto() + "");
            Element nome = new Element("nome");
            nome.appendChild(prod.getNome());
            Element prezzo = new Element("prezzo");
            prezzo.appendChild(prod.getPrezzo() + "");
            Element quantita = new Element("quantita");
            quantita.appendChild(prod.getQuantita() + "");
            prodotto.appendChild(idprodotto);
            prodotto.appendChild(nome);
            prodotto.appendChild(prezzo);
            prodotto.appendChild(quantita);
            prodotti.appendChild(prodotto);
        }
        Element clienti = new Element("clienti");
        barruzzo.appendChild(clienti);
        for (int i = 0; i < listaclienti.size(); i++) {
            Element cliente = new Element("cliente");
            Cliente clie = (Cliente) listaclienti.get(i);
            Element idcliente = new Element("idcliente");
            idcliente.appendChild(clie.getIdCliente() + "");
            Element email = new Element("email");
            email.appendChild(clie.getEmail());
            Element password = new Element("password");
            password.appendChild(clie.getPassword() + "");
            Element classe = new Element("classe");
            classe.appendChild(clie.getClasse() + "");
            cliente.appendChild(idcliente);
            cliente.appendChild(email);
            cliente.appendChild(password);
            cliente.appendChild(classe);
            clienti.appendChild(cliente);
        }
        Element classi = new Element("classi");
        barruzzo.appendChild(classi);
        for (int i = 0; i < listaclassi.size(); i++) {
            Element classe = new Element("classe");
            Classe clas = (Classe) listaclassi.get(i);
            classe.appendChild(clas.getNome());
            classi.appendChild(classe);
        }
        Element ordinazioni = new Element("ordinazioni");
        barruzzo.appendChild(ordinazioni);
        for (int i = 0; i < listaordinazioni.size(); i++) {
            Element ordinazione = new Element("ordinazione");
            Ordinazione ordi = (Ordinazione) listaordinazioni.get(i);
            Element idcliente = new Element("idcliente");
            idcliente.appendChild(ordi.getCliente().getIdCliente() + "");
            Element idprodotto = new Element("idprodotto");
            idprodotto.appendChild(ordi.getProdotto().getIdProdotto() + "");
            ordinazione.appendChild(idcliente);
            ordinazione.appendChild(idprodotto);
            ordinazioni.appendChild(ordinazione);
        }
        Document doc = new Document(barruzzo);
        return doc.toXML();
    }

    public void importaXML(String XML) {
        listaprodotti.clear();
        listaclienti.clear();
        listaclassi.clear();
        listaordinazioni.clear();
        Builder builder = new Builder();
        try {
            Document doc = builder.build(new StringReader(XML));
            Element barruzzo = doc.getRootElement();
            Element prodotti = barruzzo.getFirstChildElement("prodotti");
            Elements listaprod = prodotti.getChildElements("prodotto");
            for (int i = 0; i < listaprod.size(); i++) {
                Element prodotto = listaprod.get(i);
                Element idprodotto = prodotto.getFirstChildElement("idprodotto");
                Element nome = prodotto.getFirstChildElement("nome");
                Element prezzo = prodotto.getFirstChildElement("prezzo");
                Element quantita = prodotto.getFirstChildElement("quantita");
                listaprodotti.add(new Prodotto(idprodotto, nome, prezzo, quantita));
            }

            Element clienti = barruzzo.getFirstChildElement("clienti");
            Elements listaclie = clienti.getChildElements("cliente");
            for (int i = 0; i < listaclie.size(); i++) {
                Element cliente = listaclie.get(i);
                Element idcliente = cliente.getFirstChildElement("idcliente");
                Element email = cliente.getFirstChildElement("email");
                Element password = cliente.getFirstChildElement("password");
                Element classe = cliente.getFirstChildElement("classe");
                listaclienti.add(new Cliente(idcliente, email, password, classe));
            }

            Element classi = barruzzo.getFirstChildElement("classi");
            Elements listaclas = classi.getChildElements("classe");
            for (int i = 0; i < listaclas.size(); i++) {
                Element classe = listaclas.get(i);
                listaclassi.add(new Classe(classe));
            }

            Element ordinazioni = barruzzo.getFirstChildElement("ordinazioni");
            Elements listaordi = ordinazioni.getChildElements("ordinazione");
            for (int i = 0; i < listaordi.size(); i++) {
                Element ordinazione = listaordi.get(i);
                Element idcliente = ordinazione.getFirstChildElement("idcliente");
                Element idprodotto = ordinazione.getFirstChildElement("idprodotto");
                Cliente cliente = cercaClienteById(idcliente);
                Prodotto prodotto = cercaProdottoById(idprodotto);
                listaordinazioni.add(new Ordinazione(cliente, prodotto));
            }

        } catch (Exception ex) {
            System.err.println("errore");
        }
        return;
    }

    private Cliente cercaClienteById(Element idcliente) {
        int idCliente = Integer.valueOf(idcliente.getValue());
        return cercaClienteById(idCliente);
    }

    private Cliente cercaClienteById(int idCliente) {
        for (int i = 0; i < listaclienti.size(); i++) {
            Cliente cliente = (Cliente) listaclienti.get(i);
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    private Prodotto cercaProdottoById(Element idprodotto) {
        int idProdotto = Integer.valueOf(idprodotto.getValue());
        return cercaProdottoById(idProdotto);
    }

    private Prodotto cercaProdottoById(int idProdotto) {
        for (int i = 0; i < listaprodotti.size(); i++) {
            Prodotto prodotto = (Prodotto) listaprodotti.get(i);
            if (prodotto.getIdProdotto() == idProdotto) {
                return prodotto;
            }
        }
        return null;
    }

    public void salva() {
        try {
            FileWriter fileWriter = new FileWriter("barruzzo.xml", false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(exportaXML());
            printWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println("errore");
        }
    }

    public void apri() {
        String XML = "";
        try {
            FileReader fileReader = new FileReader("barruzzo.xml");
            int data = fileReader.read();
            while (data != -1) {
                XML = XML + "" + ((char) data);
                data = fileReader.read();
            }
            importaXML(XML);
        } catch (IOException ex) {
            System.err.println("errore");
        }

    }
}
