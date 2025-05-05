public class Pessoa{
    private String nome;
    private String pessoaId;
    private String endereco;
    private String email;

    public Pessoa(String nome, String pessoaId, String endereco, String telefone, String email){
        this.nome = nome; 
        this.pessoaId = pessoaId;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public String getPessoaId(){
        return pessoaId;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getEmail(){
        return email;
    }
}