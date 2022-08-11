package com.sistemadelutas;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Getters and Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("---DESAFIADO---");
            this.desafiado.apresentar();
            System.out.println("---DESAFIANTE---");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //Empata
                    System.out.println("A luta empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //Desafiado ganha
                    System.out.println("O desafiado " + desafiado.getNome() + " ganhou a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Desafiante ganha
                    System.out.println("O desafiante " + desafiante.getNome() + " ganhou a luta!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer!");
        }


    }


}
