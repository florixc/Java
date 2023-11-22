/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barruzzo.model;

import nu.xom.Element;

/**
 *
 * @author L14_00
 */
public class Classe {

    String nome;

    @Override
    public String toString() {
        return "Classe{" + "nome=" + nome + '}';
    }

    public Classe(Element classe) {
        this.nome = classe.getValue();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe(String nome) {
        this.nome = nome;
    }
}
