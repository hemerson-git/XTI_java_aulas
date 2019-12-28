package aulas.xti.refinamento;

import java.io.Serializable;

@Cabecalho(
        instituicao = "Universidade XTI",
        projeto = "Sistema de avaliações",
        dataCriacao = "27/06/2019",
        criador = "Hemerson Oliveira Silva",
        revisao = 2
)

@ErrosCorrigidos(erros = {"0001", "0002"})
@SuppressWarnings("serial")
public class Anotacoes implements Serializable{
    
    @SuppressWarnings("unused")
    private int x;
    
    @Deprecated
    public void anotar(){}
    
    @Override
    public String toString(){
        return null;
    }
    
}
