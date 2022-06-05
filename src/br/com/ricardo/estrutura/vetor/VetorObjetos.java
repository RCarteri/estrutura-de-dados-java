package br.com.ricardo.estrutura.vetor;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean add(Object elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public boolean add(int posicao, Object elemento){
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
            Object[] elementosNovos = new Object[elementos.length*2];
            System.arraycopy(elementos, 0, elementosNovos, 0, tamanho);
            elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) {
        isPosicaoValida(posicao);
        return elementos[posicao];
    }

    private void isPosicaoValida(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
    }

    public int busca(Object elemento){
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
