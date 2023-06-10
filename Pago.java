public class Pago extends Plano {
    private String metodoPagamento;
    private double preco = 15.99;
    private String descricao = "Através desse plano você poderá desfrutar de todas as funcionalidades do aplicativo sem anúncios.";

    Pago(String metodoPagamento){
    	this.metodoPagamento = metodoPagamento;
    }
    
    public String toString() {
        return "Plano Pago: " + descricao + "Preço: " + preco;
    }
    
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public String getMetodoPagamento() {
    	return metodoPagamento;
    }
}
