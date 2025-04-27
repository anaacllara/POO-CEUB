public class Item {
    //atributos
    private String codItem;
    private String descricao;
    private short quantidade; 
    private float preco;

    //construtores
    public Item(String codItem, String descricao, short quantidade, float preco){
        this.codItem = codItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //metodos
    public String getCodItem(){
        return codItem;
    }
    public String getDescricao(){
        return descricao;
    }
    public short getQuantidade(){
        return quantidade;
    }
    public float getPreco(){
        return preco;
    }
}
