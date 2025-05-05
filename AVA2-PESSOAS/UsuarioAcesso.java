public class UsuarioAcesso extends Pessoa {
    private String login;
    private String senha;
    private String tipoAcesso;

    public UsuarioAcesso(String nome, String pessoaId, String endereco, String telefone, String email, String login, String senha, String tipoAcesso) {
        super(nome, pessoaId, endereco, telefone, email);
        this.login = login;
        this.senha = senha;
        this.tipoAcesso = tipoAcesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }
}
