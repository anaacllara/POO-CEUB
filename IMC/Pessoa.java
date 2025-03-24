//classe Pessoa
public class Pessoa{
    //atributos da classe Pessoa 
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    //construtor da classe pessoa
    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
    }
    //método para calculo de IMC da classe Pessoa
    private static double calcularImcPessoa(double peso, double altura){
        double imc = 0.0;
        //fórmula do IMC 
        imc = peso/(Math.pow(altura,2));
        return imc;
    }
    
    //método para mostrar a Pessoa e resultado do cálculo do IMC
    public void mostrarImcPessoa(){
        System.out.println("Nome: "+ this.nomePessoa);
        System.out.println("Altura: "+ this.alturaPessoa);
        System.out.println("Peso: "+ this.pesoPessoa);
        System.out.println("IMC: "+ this.imcPessoa);
    }

}