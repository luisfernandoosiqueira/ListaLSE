package estruturaDeDados;

/**
 *
 * @author Luís Fernando
 */
public class ListaLSE implements ILista {

    private int tamanho = 0;
    private No inicio = null;
    private No fim = null;

    public ListaLSE() {
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void incluirInicio(int elemento) throws Exception {
        No aux = new No(elemento, inicio);
        inicio = aux;
        if (estaVazia()) {
            fim = aux;
        }
        tamanho++;
    }

    @Override
    public void retirarInicio() throws Exception {
        if (estaVazia()) {
            throw new Exception("Não pode retirar, lista está vazia...");
        }
        inicio = inicio.getProximo();
        tamanho--;
        if (estaVazia()) {
            fim = null;
        }
    }

    @Override
    public int acessarInicio() throws Exception {
        if (estaVazia()) {
            throw new Exception("Não pode acessar, lista está vazia...");
        }
        return inicio.getDado();
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public String obterLista() throws Exception {
        if (estaVazia()) {
            return "Lista = { }";
        }
        String saida = "Elementos = { ";
        No aux = inicio;
        do {
            saida += aux.getDado() + " ";
            aux = aux.getProximo();
        } while (aux != null);
        return saida += "}";
    }

    @Override
    public void incluirFim(int elemento) throws Exception {

        No aux = new No(elemento);

        if (estaVazia()) {

            inicio = fim = aux;
            tamanho++;
            return;
        }

        fim.setProximo(aux);

        fim = aux;

        tamanho++;

    }

    @Override
    public void retirarNoFim() throws Exception {

        if (estaVazia()) {
            throw new Exception("Não pode retirar, lista está vazia...");
        }

        if (tamanho == 1) {

            inicio = fim = null;
            tamanho = 0;
            return;
        }

        No ref = inicio;

        for (int contador = 1; contador < tamanho - 1; contador++) {
            ref = ref.getProximo();
        }

        ref.setProximo(null);
        fim = ref;
        tamanho--;

    }

    @Override
    public int acessarNoFim() throws Exception {

        if (estaVazia()) {
            throw new Exception("Não pode acessar, lista está vazia...");
        }
        return fim.getDado();
    }

}
