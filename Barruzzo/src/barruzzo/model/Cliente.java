/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barruzzo.model;

import barruzzo.model.Classe;
import nu.xom.Element;

/**
 *
 * @author L14_00
 */
public class Cliente {

    private int idCliente;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", email=" + email + ", password=" + password + ", classe=" + classe + '}';
    }
    Classe classe;

    public Cliente(Element idcliente, Element email, Element password, Element classe) {
        this.idCliente = Integer.valueOf(idcliente.getValue());
        this.email = email.getValue();
        this.password = password.getValue();
        this.classe = new Classe(classe.getValue());
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Cliente(int idCliente, String email, String password, Classe classe) {
        this.idCliente = idCliente;
        this.email = email;
        this.password = password;
        this.classe = classe;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
