import java.util.Date;

abstract public class Usuario {
	private String nome;
	private String cpf;
	private Date datanasc;
	private String telefone;
	private String email;
	private String[] musicasFavoritas;
	private String[] artistasFavoritos;
	private String[] albunsFavoritos;
	private int seguidores;
								
	// Construtor de Usuário
	Usuario(String nome, String cpf, Date datanasc, String telefone, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.datanasc = datanasc;
		this.telefone = telefone;
		this.email = email;
	}
	

	// GETTERS
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Date getDatanasc() {
		return datanasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public String[] getMusicasFavoritas() {
		return musicasFavoritas;
	}
	public String[] getArtistasFavoritos() {
		return artistasFavoritos;
	}
	public String[] getAlbunsFavoritos() {
		return albunsFavoritos;
	}
	public int getSeguidores() {
		return seguidores;
	}
}

