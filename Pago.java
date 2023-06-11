public class Pago extends Plano {
    private String metodoPagamento;
    private double preco = 15.99;
    private String descricao = "Através desse plano você poderá desfrutar de todas as funcionalidades do aplicativo sem anúncios.";
    private boolean planoAtivo; 
    
    Pago(String metodoPagamento){
    	this.metodoPagamento = metodoPagamento;
    	realizarPagamento(); 
    }
    
    public void realizarPagamento() {	
    	if (metodoPagamento.equalsIgnoreCase("cartão de crédito") ||
                metodoPagamento.equalsIgnoreCase("cartao de credito") ||
                metodoPagamento.equalsIgnoreCase("cartão de debito") ||
                metodoPagamento.equalsIgnoreCase("cartao de debito") ||
                metodoPagamento.equalsIgnoreCase("boleto") ||
                metodoPagamento.equalsIgnoreCase("pix")) {
        		planoAtivo = true;
        	} else {
        		planoAtivo = false;
        	}
        }
    
    
    public String toString() {
        return "Plano Pago: " + descricao + " Preço: " + preco;
    }
    
    // SETTERS
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    // GETTERS
    public String getMetodoPagamento() {
    	return metodoPagamento;
    }
    public boolean getPlanoAtivo() {
    	return planoAtivo;
    }
}
