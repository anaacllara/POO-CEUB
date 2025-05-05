public class Vendedores extends Pessoa {
    private double comissao;
    private int quantidadeVendas;

    public Vendedores(String nome, String pessoaId, String endereco, String telefone, String email, double comissao, int quantidadeVendas) {
        super(nome, pessoaId, endereco, telefone, email);
        this.comissao = comissao;
        this.quantidadeVendas = quantidadeVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}

