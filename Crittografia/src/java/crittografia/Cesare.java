/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crittografia;

/**
 *
 * @author Studente
 */
public class Cesare {
//questo funziona solo con lettere minuscole
    int scarto;

    public Cesare(int scarto) {
        this.scarto = scarto;
    }

    public String codifica(String parola) {
        String temp="";
        for (int i=0;i<parola.length();i++) {
            char lettera=parola.charAt(i);            
            char nuova=(char) ((((int)(lettera-'a')+scarto)%26)+'a');
            System.out.println(lettera+"->"+nuova);
            temp+=nuova;                               
        }
        return temp;
    };
    public String decodifica(String parola) {
        String temp="";
        for (int i=0;i<parola.length();i++) {
            char lettera=parola.charAt(i);            
            char nuova=(char) ((((int)(lettera-'a')-scarto+26)%26)+'a');
            System.out.println(lettera+"->"+nuova);
            temp+=nuova;                               
        }
        return temp;    };

}
