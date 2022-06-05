package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        //Adicionar elemento em qualquer posição
        Vetor vetor = new Vetor(10);

        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");

        System.out.println(vetor);
        vetor.add(0, "elemento 4");
        System.out.println(vetor);
    }
}
