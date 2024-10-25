
package estruturaDeDados;

/**
 *
 * @author Luís Fernando
 */
public interface IPilha {
   
   
    public void incluir(int elemento) throws Exception;
    public void remover() throws Exception;
    public int acessar() throws Exception;
    public boolean estaVazia();
    public int ObterOcupação();
    public String obterTodosOsElementosDaPilha() throws Exception;
    
    
}
