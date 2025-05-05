public class Clientes extends Pessoa {
    private int quantidadeProduto;
    private String historicoCompra;

    public Clientes(String nome, String pessoaId, String endereco, String telefone, String email, int quantidadeProduto, String historicoCompra) {
        super(nome, pessoaId, endereco, telefone, email); 
        this.quantidadeProduto = quantidadeProduto;
        this.historicoCompra = historicoCompra;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getHistoricoCompra() {
        return historicoCompra;
    }

    public void setHistoricoCompra(String historicoCompra) {
        this.historicoCompra = historicoCompra;
    }
}
