package com.mycompany.automatas02;

/*@author kevin*/

public class Main {

    public static void main(String[] args) {
        String cinta = "1011";
        Automata a = new Automata(cinta);
        System.out.println("El valor de la cinta es "+a.estadoA(0));
    }
}
