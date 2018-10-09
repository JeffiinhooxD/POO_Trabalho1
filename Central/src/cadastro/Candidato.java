package cadastro;

/**
 *
 * @author jeffi
 */
public class Candidato {
    
    private String nome;
    private int numero;
    private String cpf;
    private Partido partido;
    
    public String getNome(){
        return(this.nome);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNumero(){
        return(this.numero);
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getCpf(){
        return(this.cpf);
    }
    
    public void setCpf(String cpf){        
        //if (VerificaCpf){
            this.cpf = cpf;
        //}
    }
    
    public Partido getPartido(){
        return(this.partido);
    }
    
    public void setPartido(Partido partido){
        this.partido = partido;
    }

    @Override
    public String toString() {        
        return ("Nome:    " + this.nome                 + "\n" +
                "Numero:  " + this.numero               + "\n" +
                "Cpf:     " + this.cpf                  + "\n" +
                "Partido: \n"                           +
                "\tNome:   " + this.partido.getNome()   + "\n" +
                "\tNumero: " + this.partido.getNumero() + "\n");
    }
}