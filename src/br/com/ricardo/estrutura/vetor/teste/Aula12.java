package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.VetorObjetos;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        //API Java ArrayList
        ArrayList<String> vetor = new ArrayList<>();

        vetor.add("A");
        vetor.add("C");

        System.out.println(vetor);
        vetor.add(1, "B");
        System.out.println(vetor);
        if(vetor.contains("A"))
            System.out.println("Elemento existe no array");
        else
            System.out.println("Elemento não existe no array");

        int pos = vetor.indexOf("A");
        if (pos > -1)
            System.out.println("Elemento existe no array " + pos);
        else
            System.out.println("Elemento não existe no array " + pos);

        System.out.println(vetor.get(1));

        vetor.remove(1);
        System.out.println(vetor);
        System.out.println(vetor.size());



    }
}
