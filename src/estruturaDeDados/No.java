package estruturaDeDados;

/**
 *
 * @author Luís Fernando
 */
public class No {
    private int dado = 0;
    private No proximo = null;
    
    public No() {
    }
    
    public No(int dado){
        this.dado = dado;
    }
    
    public No(int dado, No proximo){
        this.dado = dado;
        this.proximo = proximo;
    }
    
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}

