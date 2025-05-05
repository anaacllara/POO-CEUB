public class Empregado extends Pessoa {
    private String cargo;
    private String departamento;
    private double salario;

    public Empregado(String nome, String pessoaId, String endereco, String telefone, String email, String cargo, String departamento, double salario) {
        super(nome, pessoaId, endereco, telefone, email);
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

