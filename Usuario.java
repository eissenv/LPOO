import java.util.Date; // Talvez criar um construtor para data em vez de usar import seja melhor

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
	Usuario(String nome, Date datanasc, String tipoPlano){
		this.nome = nome;
		this.datanasc = datanasc;
		this.tipoPlano = tipoPlano;
	}
	
	// Método para retornar info de usuário
	public String toString() {
		return "Nome do usuário: " + nome + "Tipo de plano adquirido: " + tipoPlano;
		}
	
	// SETTERS
	void setTipoPlano(String tipoPlano) {
		this.tipoPlano = tipoPlano;
	}
	
	// GETTERS
	public String getNome() {
		return nome;
	}
	public Date getDatanasc() {
		return datanasc;
	}
	public String tipoPlano() {
		return tipoPlano;
	}
	public String[] favoritas() {
		return favoritas;
	}
}
