package br.com.ricardo.estrutura.vetor.exercicios;

import br.com.ricardo.estrutura.vetor.Lista;
import br.com.ricardo.estrutura.vetor.teste.Contato;

import java.util.ArrayList;

public class Ex07 {
    //Crie uma lista usando ArrayList, passe todos os contatos para o ArrayList, utilize todos os metodos que foram implementados na classe Lista
    public static void main(String[] args) {
        ArrayList<Contato> lista = new ArrayList<>();
        Contato c = new Contato("Contato 1", "123-321", "contato1@email.com");
        for (int i = 0; i < 30; i++) {
            Contato c1 = new Contato("Contato " + i, "123-32" + i, "contato" + i + "@email.com");
            lista.add(c1);
        }

        System.out.println("contem() " + lista.contains(c));
        System.out.println("busca(posicao) " + lista.get(1));
        System.out.println("ultimoIndice() " + lista.lastIndexOf(c));
        System.out.println("getTamanho() " + lista.size());
        System.out.println("remove(posicao) " + lista.remove(11));
        System.out.println("removeElemento(elemento) " + lista.remove(c));
        System.out.println("limpar ");
        lista.clear();
        System.out.println(lista);
    }
}
