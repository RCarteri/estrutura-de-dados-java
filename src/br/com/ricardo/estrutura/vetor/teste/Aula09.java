package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        //Remover elemento do vetor
        Vetor vetor = new Vetor(3);

        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");

        System.out.println(vetor);
        vetor.remove(1);
        System.out.println(vetor);
        System.out.println("Remover elemento 3");
        vetor.remove(vetor.busca("elemnto 3"));
        System.out.println(vetor);
    }
}
