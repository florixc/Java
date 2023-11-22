/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricercaautoplus;

import nu.xom.Element;

/**
 *
 * @author L14_00
 */
public class Automobile implements Comparable<Automobile> {

    private int idAutomobile;
    private String modello;
    private String marca;
    private String carrozzeria;
    private String alimentazione;
    private int cilindrata;
    private int potenza;
    private int prezzo;

    public Automobile() {
    }

    public Automobile(int idAutomobile, String modello, String marca, String carrozzeria, String alimentazione, int cilindrata, int potenza, int prezzo) {
        this.idAutomobile = idAutomobile;
        this.modello = modello;
        this.marca = marca;
        this.carrozzeria = carrozzeria;
        this.alimentazione = alimentazione;
        this.cilindrata = cilindrata;
        this.potenza = potenza;
        this.prezzo = prezzo;
    }
    
    public Automobile(Element idAutomobile, Element modello, Element marca, Element carrozzeria, Element alimentazione, Element cilindrata, Element potenza, Element prezzo) {
        this.idAutomobile = Integer.valueOf(idAutomobile.getValue());
        this.modello = modello.getValue();
        this.marca = marca.getValue();
        this.carrozzeria = carrozzeria.getValue();
        this.alimentazione = alimentazione.getValue();
        this.cilindrata = Integer.valueOf(cilindrata.getValue());
        this.potenza = Integer.valueOf(potenza.getValue());
        this.prezzo = Integer.valueOf(prezzo.getValue());
    }

    public int getIdAutomobile() {
        return idAutomobile;
    }

    public void setIdAutomobile(int idAutomobile) {
        this.idAutomobile = idAutomobile;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCarrozzeria() {
        return carrozzeria;
    }

    public void setCarrozzeria(String carrozzeria) {
        this.carrozzeria = carrozzeria;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Automobile{" + "idAutomobile=" + idAutomobile + ", modello=" + modello + ", marca=" + marca + ", carrozzeria=" + carrozzeria + ", alimentazione=" + alimentazione + ", cilindrata=" + cilindrata + ", potenza=" + potenza + ", prezzo=" + prezzo + '}';
    }

    @Override
    public int compareTo(Automobile o) {
        int compa;
        compa = this.getMarca().compareTo(o.getMarca());
        if (compa == 0) {
            compa = this.getModello().compareTo(o.getModello());
        }
        return compa;
    }

};
