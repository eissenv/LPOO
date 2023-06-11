package dev;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Usuario {
    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento; // Alterado para String
    private String telefone;
    private String email;
    private String tipoPlano;
    private boolean planoAtivo;
    private String metodoPagamento;
    private List<Musica> musicasFavoritas;
    private List<Artista> artistasFavoritos;
    private List<Album> albunsFavoritos;
    private int seguidores;
    private String statusPlano;
    
    // Construtor de Usuário
    Usuario(String id, String nome, String cpf, String dataNascimento, String telefone, String email, String tipoPlano, String metodoPagamento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.tipoPlano = tipoPlano;

        if (tipoPlano.equalsIgnoreCase("Pago")) {
            Pago planoPago = new Pago(metodoPagamento);
            planoPago.realizarPagamento();
            planoAtivo = planoPago.getPlanoAtivo();

            if (planoAtivo) {
                statusPlano = "Ativado";
                System.out.println("Seu plano está ativado, obrigado " + nome + "!\n");
            } else {
                statusPlano = "Desativado";
                System.out.println("Erro ao efetuar o pagamento.\n");
            }
        } else {
            planoAtivo = false;
            statusPlano = "Gratuito";
            System.out.println("Obrigado por utilizar nosso aplicativo, " + nome + "!\n");
        }
    }

	public String info() {
		return "Usuário: " + nome + "\nPlano: " + tipoPlano + "\nStatus do plano: " + statusPlano + "\n";
		
	}
	
	// Método estabelecer o formato da data de nascimento
	private Date parseDataNascimento(String dataNascimento) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(dataNascimento);
        } catch (ParseException e) {
            // Tratar exceção, caso a data de nascimento esteja em formato inválido
            e.printStackTrace();
        }
        return null;
    }
	
	// Métodos para adicionar às listas de favoritos
    public void adicionarMusicaFavorita(Musica musica) {
        musicasFavoritas.add(musica);
    }
    
    public void adicionarAlbumFavorito(Album album) {
        albunsFavoritos.add(album);
    }
    
    public void adicionarArtistaFavorito(Artista artista) {
        artistasFavoritos.add(artista);
    }
 
    public int calcularIdade() {
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(this.parseDataNascimento(this.dataNascimento));
        
        Calendar dataAtual = Calendar.getInstance();
        
        int idade = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        
        // Verificar se o usuário ainda não fez aniversário este ano
        if (dataAtual.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH) ||
            (dataAtual.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) &&
             dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }
        return idade;
    }

	// SETTERS
	public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
	
	// GETTERS
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public List<Musica> getMusicasFavoritas() {
		return musicasFavoritas;
	}
	public List<Artista> getArtistasFavoritos() {
		return artistasFavoritos;
	}
	public List<Album> getAlbunsFavoritos() {
		return albunsFavoritos;
	}
	public int getSeguidores() {
		return seguidores;
	}
	public String getTipoPlano() {
		return tipoPlano;
	}
	public boolean getPlanoAtivo() {
    	return planoAtivo;
    }
	public String getMetodoPagamento() {
    	return metodoPagamento;
    }
	public String getDataNascimento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataNascimento);
    }
}





