import java.util.Scanner;
public class ImcPessoaValoresEntradas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a altura(m): ");
        double altura = scanner.nextDouble();
        Pessoa pessoa = new Pessoa(nome, peso, altura);
        pessoa.moostrarImcPessoa();
        scanner.close();
    }

}
