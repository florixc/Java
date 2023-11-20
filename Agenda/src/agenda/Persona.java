/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author L14_00
 */
public class Persona implements Comparable<Persona> {

    String nome;
    String cognome;
    String numero;

    public Persona() {
        this.nome = "";
        this.cognome = "";
        this.numero = "";
    }

    public Persona(String nome, String cognome, String numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;

    }

    public static void main(String[] args) {
        //Persona persona=new Persona();
        Persona persona = new Persona("ciao", "bella", "dea");
    }

    @Override
    public String toString() {
        return nome + ";" + cognome + ";" + numero; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Persona o) {
     //compareto restitutisce -1 <, 0 ==, 1 >

        //ordinare prima per cognome e 
        //in caso nome (due cognomi uguali)
        int compa;
        compa = cognome.compareTo(o.cognome);
        if (compa == 0) {
            compa = nome.compareTo(o.nome);
        }
        return compa;
    }

}
