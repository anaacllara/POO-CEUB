public class Vendedor{
    //atributos
    private String nomeVendedor;
    private String matricula;

    //construtor
    public Vendedor(String nomeVendedor, String matricula){ 
        this.nomeVendedor = nomeVendedor;
        this.matricula = matricula;
    }
    
    //metodos que acessam os atributos 
    public String getNomeVendedor(){
        return this.nomeVendedor;
    }
    public String getMatricula(){
        return this.matricula;
    }
}