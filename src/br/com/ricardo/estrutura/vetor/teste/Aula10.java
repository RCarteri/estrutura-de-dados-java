package br.com.ricardo.estrutura.vetor.teste;

import br.com.ricardo.estrutura.vetor.Vetor;
import br.com.ricardo.estrutura.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        //Generalizar o tipo do vetor
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-213", "c1@s.com");
        Contato c2 = new Contato("Contato 2", "12344-223", "c2@s.com");
        Contato c3 = new Contato("Contato 3", "14544-243", "c3@s.com");
        Contato c4 = new Contato("Contato 4", "1564-243", "c4@s.com");

        vetor.add(c1);
        vetor.add(c2);
        vetor.add(c3);

        System.out.println("Tamanho = " + vetor.getTamanho());
        System.out.println(vetor.busca(c4));

        System.out.println(vetor);
    }
}
