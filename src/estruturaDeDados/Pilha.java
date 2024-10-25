package estruturaDeDados;

/**
 *
 * @author Luís Fernando
 */
public class Pilha implements IPilha {

    private ListaLSE pilha;

    public Pilha() {

        pilha = new ListaLSE();
        
    }

    public Pilha(ListaLSE pilha) {

        pilha = new ListaLSE();
        this.pilha = pilha;
    }

    @Override
    public void incluir(int elemento) throws Exception {

        pilha.incluirInicio(elemento);

    }

    @Override
    public void remover() throws Exception {

        pilha.retirarInicio();

    }

    @Override
    public int acessar() throws Exception {

        return pilha.acessarInicio();

    }

    @Override
    public boolean estaVazia() {

        return pilha.estaVazia();

    }

    @Override
    public int ObterOcupação() {

        return pilha.getTamanho();
    }

    @Override
    public String obterTodosOsElementosDaPilha() throws Exception {

        return pilha.obterLista();

    }

}
