package application;

import estruturaDeDados.*;

/**
 *
 * @author Luís Fernando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            
            /* Teste Pilha
            IPilha pilha = new Pilha(new ListaLSE());
            
            pilha.incluir(10);
            pilha.incluir(20);
            pilha.incluir(30);
            System.out.println("Topo da Pilha: " + pilha.acessar());
            System.out.println("Tamanho: " + pilha.ObterOcupação());
            pilha.remover();
            System.out.println(pilha.obterTodosOsElementosDaPilha());
            
            */
            
            // Teste Fila           
            IFila fila = new Fila(new ListaLSE());
            
            fila.incluir(10);
            fila.incluir(20);
            fila.incluir(30);
            System.out.println("Primeiro da Fila: " + fila.acessar());
            System.out.println("Tamanho da Fila: " + fila.ObterOcupação());
            fila.remover();
            System.out.println(fila.obterFila());
            

            /* Teste Lista
            ILista lista = new ListaLSE();

            
            System.out.println(lista.obterLista());
            System.out.println(lista.estaVazia());
            //System.out.println(lista.acessarNoInicio());
            System.out.println(lista.getTamanho());
            lista.incluirInicio(30);
            lista.incluirInicio(20);
            lista.incluirInicio(10);
            System.out.println(lista.getTamanho());
            System.out.println(lista.obterLista());
            System.out.println(lista.acessarInicio());
            lista.retirarInicio();
            System.out.println(lista.obterLista());
            lista.retirarInicio();
            lista.retirarInicio();
            System.out.println(lista.obterLista());
            lista.incluirInicio(10);
            System.out.println(lista.obterLista());
            
            lista.incluirFim(10);
            System.out.println(lista.acessarNoFim());
            lista.incluirFim(30);
            System.out.println(lista.acessarNoFim());
            lista.incluirFim(20);
            System.out.println(lista.acessarNoFim());
            lista.retirarNoFim();
            System.out.println(lista.acessarNoFim());
            lista.retirarNoFim();
            System.out.println(lista.acessarNoFim());

            */


        } catch (Exception erro) {
            System.out.println("Erro: " + erro);
        }
    }

}
