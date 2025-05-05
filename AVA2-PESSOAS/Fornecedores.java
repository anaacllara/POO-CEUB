public class Fornecedores {
    public class Fornecedor extends Pessoa {
        private String cnpj;
        private String listaProdutos;
    
        public Fornecedor(String nome, String pessoaId, String endereco, String telefone, String email, String cnpj, String listaProdutos) {
            super(nome, pessoaId, endereco, telefone, email);
            this.cnpj = cnpj;
            this.listaProdutos = listaProdutos;
        }
        
        public String getCnpj() {
            return cnpj;
        }
    
        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
    
        public String getListaProdutos() {
            return listaProdutos;
        }
    
        public void setListaProdutos(String listaProdutos) {
            this.listaProdutos = listaProdutos;
        }
    }
    
}
