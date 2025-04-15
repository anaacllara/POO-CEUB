import java.util.Scanner;

public class ImcPessoaValoresEntradas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o peso (kg): ");
        float peso = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite a altura(m): "); // digitar com vírgula, pois com ponto ele não interpreta
        float altura = scanner.nextFloat();
        scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, peso, altura); //Pesssoa é a classe, new Pessoa (nome,peso...) é o construtor 
       Imc imc = new Imc(pessoa);

        imc.mostrarImc();
        scanner.close();
    }

}
