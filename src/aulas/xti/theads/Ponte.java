package aulas.xti.theads;

/**
 * Uma <code>Ponte</code> representa o elo entre 
 * ojetos produtores e Consumidores de Informações. Os
 * <i>Produtores</i> utilizam as Pontes para gravar
 * informações com os Consumidores que leem esses dados
 * da Ponte para fazer o processamento.
 * 
 * @author Hemerson Oliveira Silva
 * @version 1.0
 * @since 1.0
 * 
 * @see PonteNaoSincronizada 
 * @see PonteSincronizada
 */
public interface Ponte {
    /**
     * Armazena o valor informado na ponte. Geralmente será
     * chamado pelas classesProdutoras de dados
     * @param valor
     * @throws InterruptedException 
     */
    public void set(int valor) throws InterruptedException;
    
    /**
     * Recupera a informação armazenada na ponte. Esse método 
     * será chamada pelas Consumidoras de dados.
     * @return
     * @throws InterruptedException 
     */
    public int get() throws InterruptedException;
}
