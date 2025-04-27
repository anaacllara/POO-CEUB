public class Cliente {
    //atributos
    private String nomeCliente;
    private long cpf;
    private String endereco;
    private String telefone;

    //construtores
    public Cliente(String nomeCliente, long cpf, String endereco, String telefone){
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //metodos
    public String getNomeCliente(){
        return nomeCliente;
    }
    public long getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
}
