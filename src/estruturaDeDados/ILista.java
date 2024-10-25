
package estruturaDeDados;

/**
 *
 * @author Luís Fernando
 */
public interface ILista {
  
   public int getTamanho();
   public void incluirInicio(int elemento) throws Exception;
   public void retirarInicio() throws Exception;
   public int acessarInicio() throws Exception;
   public void incluirFim(int elemento) throws Exception;
   public void retirarNoFim() throws Exception;
   public int acessarNoFim() throws Exception;
   public boolean estaVazia();
   public String obterLista() throws Exception;
}

