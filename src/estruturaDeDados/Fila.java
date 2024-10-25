package estruturaDeDados;

/**
 *
 * @author Luís Fernando
 */
public class Fila implements IFila {

    ListaLSE fila;

    public Fila() {

        fila = new ListaLSE();

    }

    public Fila(ListaLSE fila) {

        fila = new ListaLSE();

        this.fila = fila;

    }

    @Override
    public void incluir(int elemento) throws Exception {

        fila.incluirFim(elemento);

    }

    @Override
    public void remover() throws Exception {

        fila.retirarInicio();

    }

    @Override
    public int acessar() throws Exception {

        return fila.acessarInicio();

    }

    @Override
    public boolean estaVazia() {

        return fila.estaVazia();

    }

    @Override
    public int ObterOcupação() {

        return fila.getTamanho();

    }

    @Override
    public String obterFila() throws Exception {

        return fila.obterLista();

    }

}
