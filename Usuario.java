import java.util.Date;

abstract public class Usuario {
	private String nome;
	private Date datanasc;
	private String tipoPlano;
	private String[] favoritas; // Vai guardar o código da música favoritada
								// Pensar em como vai ser esse código (String, int?)
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
