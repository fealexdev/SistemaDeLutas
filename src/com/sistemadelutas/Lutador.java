package com.sistemadelutas;

public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitórias, derrotas, empates;

    //Constructor
    public Lutador(String nome, String nacionalidade, int idade, double altura,
                   double peso, int vitórias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitórias = vitórias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getVitórias() {
        return vitórias;
    }

    public void setVitórias(int vitórias) {
        this.vitórias = vitórias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Métodos
    public void apresentar() {
        System.out.println("Apresentando o lutador:" + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " metros de altura ");
        System.out.println("pesando " + this.getPeso() + "KG");
        System.out.println("ganhou " + this.getVitórias() + " lutas");
        System.out.println("perdeu " + this.getDerrotas() + " lutas");
        System.out.println("empatou " + this.getEmpates() + " lutas");
        System.out.println("---------------------------------------");


    }

    public void status() {
        System.out.println(this.getNome() + " eh um peso " + this.getCategoria());
        System.out.println("ganhou " + this.getVitórias() + " lutas");
        System.out.println("perdeu " + this.getDerrotas() + " lutas");
        System.out.println("empatou " + this.getEmpates() + " lutas");
        System.out.println("---------------------------------------");
    }

    public void ganharLuta() {
        setVitórias(this.getVitórias() + 1);
    }

    public void perderLuta() {
        setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(this.getEmpates() + 1);
    }
}
