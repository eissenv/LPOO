public class Musica {
	String codigo;
	String nome;
	String genero;
	String artista;
	String escritor; // Escritor e produtor adicionados por meio de métodos
	String produtor;
	
	// Construtor de música
	Musica(String nome, String genero, String artista){
		this.nome = nome;
		this.genero = genero;
		this.artista = artista;
	}

}
