public class PilhaSimples {
    Integer[] pilha;
    int topo = -1;

    public PilhaSimples(int numeroElementos) {
        this.pilha = new Integer[numeroElementos];
    }

    public void empilhar(int elemento) {
        if(estaCheia()) { //não tem como adicionar algo que já esta cheio
            System.out.println("A pilha já está cheia.");
        }
        else  {
            topo++;
            pilha[topo] = elemento;
        }
    }

    public void desempilhar() {
        if(estaVazia()) {
            System.out.println("A pilha já está vazia.");
        }
        else{
            pilha[topo] = null;
            topo--;
        }
    }

    public void desempilharTudo() { //não retira realmente os valores anteriores, mas ainda funciona eficientemente
        topo = -1;
    }

    public void exibirElementos() {
        if(estaVazia()) {
            System.out.println("A pilha está vazia.");
        }
        else{
            for(int i = topo; i >= 0; i--) { //diferente do padrão do for, agora após você remover um elemento não mostrará os nulls
                System.out.println(pilha[i]);
            }
        }
    }

    public boolean estaCheia() {
        if(topo == this.pilha.length - 1){ //quando o topo chegar até o ultimo elemento da lista
            return true;
        }
        return false;
    }

    public boolean estaVazia() {
        if(topo == -1){
            return true;
        }
        return false;
    }
}
