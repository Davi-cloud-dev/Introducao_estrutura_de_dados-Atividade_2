public class Main {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(3);
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        //Teste da Pilha Simples
        //testes se o estaVazia e o estaCheia estão funcionando
        System.out.println(pilhaSimples.estaVazia()); //como o topo ta em -1, vai dar positivo
        System.out.println(pilhaSimples.estaCheia()); //ao menos que vc coloque 0 de indice, vai dar negativo.
        //como os 2 estão funcionando, é possível testar adicionar(empilhar) e remover(desempilhar) elementos
        pilhaSimples.empilhar(4);
        pilhaSimples.empilhar(7);
        pilhaSimples.empilhar(9);
        pilhaSimples.exibirElementos();
        System.out.println(pilhaSimples.estaCheia()); //tem 3 elementos, logo: true
        System.out.println(" ----------------- "); //separação do ultimo exibirElementos
        pilhaSimples.desempilhar();
        pilhaSimples.exibirElementos(); //verificação se realmente retira
        System.out.println(" ----------------- "); //separação do ultimo exibirElementos
        pilhaSimples.desempilharTudo();
        pilhaSimples.exibirElementos(); //vai falar que está vazia

        System.out.println("\n ************************************* \n"); //separação de testes

        //Teste da Pilha Dinâmica
        System.out.println(pilhaDinamica.estaVazia()); //como o topo não aponta pra nada, vai dar positivo
        pilhaDinamica.empilhar(10);
        pilhaDinamica.empilhar(13);
        pilhaDinamica.empilhar(24);
        pilhaDinamica.exibirElementos();
        System.out.println(" ----------------- "); //separação do ultimo exibirElementos
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibirElementos();
        System.out.println(" ----------------- "); //separação do ultimo exibirElementos
        pilhaDinamica.desempilharTudo();
        pilhaDinamica.exibirElementos(); //como o topo aponta para o null, não mostrará nada
    }
}
