
import java.util.Date;

public class Artista extends Usuario {
	private int streamingsTotais;
	private float valorGanho = 0;
	private float taxa;
	private String[] albuns;
	
	// Construtor de Artista
	Artista(String nome, String cpf, Date datanasc, String telefone, String email){
		super(nome, cpf, datanasc, telefone, email);
	}
	
	 // Método para aumentar o valorGanho a cada streaming
    public void aumentarStreamings() {
        streamingsTotais++;
        valorGanho += 0.025f;
	taxa += 0.10;
    }
    
	// GETTERS
	public int getStreamingsTotais() {
		return streamingsTotais;
	}
	public float getValorGanho() {
		return valorGanho;
	}
	public float getTaxa() {
		return taxa;
	}
	public String[] getAlbuns() {
		return albuns;
	}


}
