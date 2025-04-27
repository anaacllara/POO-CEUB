public enum Status {
    //valores fixos, imutáveis
    PROCESSANDO ("Processando"),
    ENVIADO ("Enviado"),
    ENTREGUE ("Entregue"),
    CANCELADO ("Cancelado");

    private String tipoStatus;

    //construtor
    Status(String tipoStatus){
        this.tipoStatus = tipoStatus;
    }

    //metodo
    public String getStatus(){
        return tipoStatus;
    }
}
