
package estruturaDeDados;

/**
 *
 * @author Luís Fernando
 */
public interface IFila {
    
    public void incluir(int elemento) throws Exception;  // Adicionar um elemento à fila
    public void remover() throws Exception;              // Remover um elemento da fila
    public int acessar() throws Exception;               // Acessar o elemento do início da fila
    public boolean estaVazia();                          // Verificar se a fila está vazia
    public int ObterOcupação();                          // Obtém o tamanho da fila
    public String obterFila() throws Exception;  // Obter todos os elementos da fila

    
    
}
