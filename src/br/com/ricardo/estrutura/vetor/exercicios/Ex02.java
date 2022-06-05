package br.com.ricardo.estrutura.vetor.exercicios;

import br.com.ricardo.estrutura.vetor.Lista;

public class Ex02 {
    //Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da classe ArrayList
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(6);

        lista.add("elemento 1");
        lista.add("elemento 1");
        lista.add("elemento 3");
        System.out.println(lista.ultimoIndice("elemento 1"));
    }
}
