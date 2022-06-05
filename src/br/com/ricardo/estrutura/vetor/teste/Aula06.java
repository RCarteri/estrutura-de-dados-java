package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        //Verifica se o elemento existe no vetor
        Vetor vetor = new Vetor(10);

        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");

        System.out.println(vetor.busca("elemento 2"));
        System.out.println(vetor.busca("elemento"));
    }
}
