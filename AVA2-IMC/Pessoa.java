//classe Pessoa
public class Pessoa{
    //atributos da classe Pessoa 
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    //construtor da classe pessoa
    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa){ // apenas o construtor e o método que aparecem
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa();
    }
    //método para calculo de IMC da classe Pessoa
    public double calcularImcPessoa(){
        // fazer assim permite calcular quantas vezes quiser, logo os dados da pessoa ficam consistêntes
        return this.pesoPessoa/ Math.pow(this.alturaPessoa,2);
    }
    
    //método para mostrar a Pessoa e resultado do cálculo do IMC
    public void mostrarImcPessoa() {
        System.out.printf("Nome: %s%nPeso: %.2f kg%nAltura: %.2f m%nIMC: %.2f%n", this.nomePessoa, this.pesoPessoa, this.alturaPessoa, this.imcPessoa);
    }

}
