package br.senai.sp.jandira.model;

public class Pessoas extends Conta {
    private String nome;
    private int idade;

    public void exibirSaldo(){
        System.out.println(getSaldo());
    }

    public Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void passarTempo(){
        System.out.println("A pessoa está passando tempo...");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
