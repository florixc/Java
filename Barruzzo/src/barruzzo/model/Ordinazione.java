/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barruzzo.model;

import java.util.logging.Logger;

/**
 *
 * @author L14_00
 */
public class Ordinazione {

    private Cliente cliente;
    private Prodotto prodotto;

    public Ordinazione(Cliente cliente, Prodotto prodotto) {
        this.cliente = cliente;
        this.prodotto = prodotto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "Ordinazione{" + "cliente=" + cliente + ", prodotto=" + prodotto + '}';
    }

    
}
