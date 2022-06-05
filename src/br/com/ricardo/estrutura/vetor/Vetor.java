package br.com.ricardo.estrutura.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//    public void add(String elemento){
//        for (int i = 0; i < elementos.length; i++) {
//            if (elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void add(String elemento) throws Exception {
//        if (this.tamanho < this.elementos.length){
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        }else {
//            throw new Exception("Vetor já está cheio, não é possívl adicionar outro elemento");
//        }
//    }

    public boolean add(String elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public boolean add(int posicao, String elemento){
        isPosicaoValida(posicao);
        aumentaCapacidade();
        for (int i = tamanho-1; i >= posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    private void aumentaCapacidade(){
        if (tamanho == elementos.length){
            String[] elementosNovos = new String[elementos.length*2];
            System.arraycopy(elementos, 0, elementosNovos, 0, tamanho);
            elementos = elementosNovos;
        }
    }

    public String busca(int posicao) {
        isPosicaoValida(posicao);
        return elementos[posicao];
    }

    private void isPosicaoValida(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
    }

    public int busca(String elemento){
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                return i;
        }
        throw new IllegalArgumentException("O elemento informado não existe.");
    }

    public void remove(int posicao){
        isPosicaoValida(posicao);
        for (int i = posicao; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < tamanho - 1; i++) {
            s.append(elementos[i])
                .append(", ");
        }

        if (tamanho > 0 ){
            s.append(elementos[tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}
