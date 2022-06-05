package br.com.ricardo.estrutura.vetor.exercicios;

import br.com.ricardo.estrutura.vetor.Lista;

public class Ex04 {
    //Melhore a classe Lista e implemente o método obtem(int posicao), semelhante ao metodo get()
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(6);

        lista.add("elemento 1");
        lista.add("elemento 2");
        lista.add("elemento 3");
        System.out.println(lista);
        System.out.println(lista.obtem(1));
    }
}
