package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        //Imprime elementos do vetor
        Vetor vetor = new Vetor(10);

        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
    }
}
