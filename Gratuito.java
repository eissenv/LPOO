public class Gratuito extends Plano {
    private boolean anuncio = true; // Precisa implementar, quando <condicao satisfeita> getAnuncio
    private String descricao = "Você pode utilizar o aplicativo de maneira gratuita, com anúncios.";


    public String toString() {
        return "Plano Gratuito: " + descricao;
    }
    
    public String getDescricao() {
    	return descricao;
    }
    
    public boolean getAnuncio() {
    	return anuncio;
    }    	
    
    
    
}
