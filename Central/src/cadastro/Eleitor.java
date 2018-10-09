package cadastro;

/**
 *
 * @author paulo
 */
public class Eleitor {    
    
    private String numeroTitulo;
    private String nome;
    private String cpf;
    private String secao;
    
    public String getNome(){
        return(this.nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return(this.cpf);
    }
    
    public void setCpf(String cpf){
        //if (VerificaCpf){
            this.cpf = cpf;
        //}
    }
    
    public String getSecao(){
        return(this.secao);
    }
    
    public void setSecao(String secao){
        this.secao = secao;
    }
    
    public String getNumeroTitulo(){
        return(this.numeroTitulo);
    }
    
    public void setNumeroTitulo(String numeroTitulo){
        this.numeroTitulo = numeroTitulo;
    }
}