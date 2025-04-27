import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    //atributos
    private int idPedido;
    private java.time.LocalDateTime dataHora;
    private Status status;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Item> itens; 

    //construtores
    public Pedido(int idPedido, java.time.LocalDateTime dataHora, Status status, Cliente cliente, Vendedor vendedor, List<Item> itens){
        this.idPedido = idPedido;
        this.dataHora = dataHora;
        this.status = status;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    //metodos com get
    public int getIdPedido(){
        return idPedido;
    }
    public LocalDateTime getDataHora(){
        return dataHora;
    }
    public Status getStatus(){
        return status;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Vendedor getVendedor(){
        return vendedor;
    }
    public List<Item> getItem(){
        return itens;
    }
    
    //metodos de adicionar e remover item
    public Item adicionarItem(Item itens){
        this.itens.add(itens);
        return itens;
    }
    public Item removerItem(Item item){
        this.itens.remove(item);
        return item;
    }

    //metodo pro valor total
    public float calcularValorTotal(){
        float total = 0.0f;
        for(Item item : itens){
            total += item.getQuantidade() * item.getPreco();
        }
        return total;
    }

    //metodo para o desconto depois do valor total
    public float calcularValorTotalDesconto(float percentualDesconto){
        float total = calcularValorTotal();
        float desconto = total * (float)(percentualDesconto / 100.0);
        return total - desconto; 
    }
}
