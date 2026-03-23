public class PilhaDinamica {
    NoInteiro topo = null;

    public void empilhar(int elemento) {
        NoInteiro novoElemento = new NoInteiro(elemento);
        novoElemento.setProx(topo);
        topo = novoElemento; //novoElemento será o primeiro
    }

    public void desempilhar() {
        if(estaVazia()){
            System.out.println("A pilha já está vazia.");
        }
        else{
            topo = topo.getProx(); //como todos os conteúdos mostrados se vem a partir de onde o topo aponta, ele vai ignorar o primeiro e continuar seu rumo
        }
    }

    public boolean estaVazia() {
        if(topo == null) {
            return true;
        }
        return false;
    }

    public void exibirElementos() {
        if(estaVazia()) {
            System.out.println("A pilha está vazia.");
        }
        else{
            NoInteiro elementoAtual = topo;

            while (elementoAtual != null) {
                System.out.println(elementoAtual.getConteudo());
                elementoAtual = elementoAtual.getProx();
            }
        }
    }

    public void desempilharTudo() { //se o topo aponta pro nada, então não terá primeiro elemento nem os próximos após ele
        topo = null;
    }
}
