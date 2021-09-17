package atividade2;

public class Produtos {
    private String nome;
    private double preço;


    public Produtos(String nome, double preço){
        this. nome = nome;
        this.preço = preço; }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
