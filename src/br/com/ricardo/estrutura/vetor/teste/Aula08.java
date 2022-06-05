package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        //Adicionar mais capacidade ao vetor
        Vetor vetor = new Vetor(2);

        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");

        System.out.println(vetor);
    }
}
