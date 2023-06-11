import java.util.List;
import java.util.ArrayList;

public class Artista extends Usuario {
	private int streamingsTotais;
	private float valorGanho = 0;
	private float taxa;
	private List<Album> albuns;
	
	// Construtor de Artista
	Artista(String id, String nome, String cpf, String dataNascimento, String telefone, String email, String tipoPlano, String metodoPagamento){
		super(id, nome, cpf, dataNascimento, telefone, email, tipoPlano, metodoPagamento);
		albuns = new ArrayList<>();
	}
	
	 // Método para aumentar o valorGanho a cada streaming
    public void aumentarStreamings() {
        streamingsTotais++;
        valorGanho += 0.025f;
        taxa += 0.10;
    }
    
 // Método para adicionar um álbum à lista de álbuns do artista
    public void adicionarAlbum(Album album) {
        albuns.add(album);
    }
    
 // Método para exibir todos os álbuns criados pelo artista
    public void exibirAlbuns() {
        if (!albuns.isEmpty()) {
            System.out.println("Álbuns de " + getNome() + ":");
            for (Album album : albuns) {
            	System.out.println("Nome: " + album.getNome());
                System.out.println("Data de Lançamento: " + album.getDataLancamento());
                System.out.println();
            }
        } else {
            System.out.println("O artista " + getNome() + " ainda não criou nenhum álbum.");
        }
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
	public List<Album> getAlbuns() {
        return albuns;
    }

}
