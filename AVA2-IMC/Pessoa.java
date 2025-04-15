//classe Pessoa
public class Pessoa{
    //atributos da classe Pessoa 
    private String nomePessoa;
    private float pesoPessoa;
    private float alturaPessoa;

    //construtor da classe pessoa
    public Pessoa(String nomePessoa, float pesoPessoa, float alturaPessoa){ // apenas o construtor e o método que aparecem
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
    }
    //acessar os atributos
    public String getNome(){
            return this.nomePessoa;
        }

    public float getPeso(){
            return this.pesoPessoa;
        }
    public float getAltura(){
            return this.alturaPessoa;
        }
}
