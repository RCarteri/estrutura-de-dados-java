package br.com.ricardo.estrutura.vetor.exercicios;

import br.com.ricardo.estrutura.vetor.Lista;

public class Ex03 {
    //Melhore a classe Lista e implemente o método remove(T elemento), removento o elemento passado como parâmetro
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(6);

        lista.add("elemento 1");
        lista.add("elemento 2");
        lista.add("elemento 3");
        System.out.println(lista);
        lista.remove("elemento 7");
        System.out.println(lista);
    }
}
