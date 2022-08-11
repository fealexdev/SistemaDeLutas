package com.sistemadelutas;

public class Main {
    public static void main(String[] args) {
        //Nome dos lutadores em vetor
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Joaozin", "Brasil", 28, 1.79, 100.3, 11, 2, 1);

        l[1] = new Lutador("Rageinput", "Africa", 32, 1.82, 95.5, 20, 0, 0);

        l[2] = new Lutador("Gongster", "Russia", 40, 1.80, 86.3, 9, 4, 3);

        l[3] = new Lutador("Blaber", "EUA", 37, 1.90, 105.5, 14, 3, 2);

        //Utilização da classe luta
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[1], l[3]);
        luta1.lutar();
        
    }
}