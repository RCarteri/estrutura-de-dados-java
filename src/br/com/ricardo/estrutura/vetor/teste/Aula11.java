package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.Lista;
import br.com.ricardo.estrutura.vetor.Vetor;
import br.com.ricardo.estrutura.vetor.VetorObjetos;

public class Aula11 {
    public static void main(String[] args) {
        //Configurar tipo do vetor dinamicamente
        Lista<String> vetor = new Lista<>(1);

        vetor.add("Elemento 1");
        System.out.println(vetor);
    }
}
