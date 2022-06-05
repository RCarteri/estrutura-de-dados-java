package br.com.ricardo.estrutura.vetor.exercicios;

import br.com.ricardo.estrutura.vetor.Lista;

public class Ex01 {
    //Melhore a classe Lista e implemente o método contém, semelhante ao método contains da classe ArrayList
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(6);

        lista.add("elemento 1");
        System.out.println(lista.contem("elemento 1"));
    }
}
