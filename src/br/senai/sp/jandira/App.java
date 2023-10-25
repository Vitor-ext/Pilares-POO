package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Pessoas;

public class App {
    public static void main(String[] args) {
        // Exemplo POO
        Pessoas pessoa1 = new Pessoas("João", 18);
        Pessoas pessoa2 = new Pessoas("Maria", 26);

        // Exemplo Encapsulamento
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());

        // Exemplo de Herança
        Pessoas aluno1 = new Aluno("Kleber", 30);
        Pessoas aluno2 = new Aluno("Marta", 27);

        System.out.println(aluno1.getNome());
        System.out.println(aluno2.getNome());

        // Exemplo Polimorfismo
        aluno1.passarTempo();

        // Exemplo Abstração
        aluno1.exibirSaldo();


    }
}
