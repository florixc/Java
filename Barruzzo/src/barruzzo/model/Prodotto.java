/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barruzzo.model;

import nu.xom.Element;

/**
 *
 * @author Studente
 */
public class Prodotto {

    private int idProdotto;
    private String nome;
    private float prezzo;
    private int quantita;

    public Prodotto() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Prodotto(Element idprodotto, Element nome, Element prezzo, Element quantita) {
        this.idProdotto = Integer.valueOf(idprodotto.getValue());
        this.nome = nome.getValue();
        this.prezzo = Float.valueOf(prezzo.getValue());
        this.quantita = Integer.valueOf(quantita.getValue());
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Prodotto(int idProdotto, String nome, float prezzo, int quantita) {
        this.idProdotto = idProdotto;
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "idProdotto=" + idProdotto + ", nome=" + nome + ", prezzo=" + prezzo + ", quantita=" + quantita + '}';
    }

}
