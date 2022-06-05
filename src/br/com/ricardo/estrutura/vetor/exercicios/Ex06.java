package br.com.ricardo.estrutura.vetor.exercicios;

import br.com.ricardo.estrutura.vetor.Lista;
import br.com.ricardo.estrutura.vetor.teste.Contato;

public class Ex06 {
    //Crie um vetor com capacidade para 20 contatos, insira 30 contatos no vetor, crie um exemplo para utilizar cada metodo da classe Lista
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<>(20);
        Contato c = new Contato("Contato 1","123-321", "contato1@email.com");
        for (int i = 0; i <30; i++) {
            Contato c1 = new Contato("Contato " + i, "123-32" + i, "contato" + i + "@email.com");
            lista.add(c1);
        }

        System.out.println("contem() " + lista.contem(c));
        System.out.println("busca(posicao) " + lista.busca(1));
        System.out.println("busca(elemento) " + lista.busca(c));
        System.out.println("ultimoIndice() " + lista.ultimoIndice());
        System.out.println("getTamanho() " + lista.getTamanho());
        System.out.println("remove(posicao) " + lista.remove(11));
        System.out.println("obtem(posicao) " + lista.obtem(11));
        System.out.println("removeElemento(elemento) " + lista.removeElemento(c));
        System.out.println("limpar " + lista.limpar());
    }
}
