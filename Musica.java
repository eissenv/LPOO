package dev;

public class Musica {
    private int codigo;
    private String nome;
    private String genero;
    private String artista;
    private String escritor;
    private String produtor;

    public Musica(int codigo, BibliotecaMusical biblioteca) {
        this.codigo = codigo;
        setMusicaInfo();
        
        biblioteca.adicionarGenero(genero);
        biblioteca.adicionarMusica(this);
    }

    private void setMusicaInfo() {
        switch (codigo) {
            case 1:
                nome = "Bohemian Rhapsody";
                genero = "Rock";
                artista = "Queen";
                escritor = "Freddie Mercury";
                produtor = "Roy Thomas Baker";
                break;
            case 2:
                nome = "Imagine";
                genero = "Pop";
                artista = "John Lennon";
                escritor = "John Lennon";
                produtor = "Phil Spector";
                break;
            case 3:
                nome = "Hotel California";
                genero = "Rock";
                artista = "Eagles";
                escritor = "Don Henley, Glenn Frey, Don Felder";
                produtor = "Bill Szymczyk";
                break;
            case 4:
                nome = "Billie Jean";
                genero = "Pop";
                artista = "Michael Jackson";
                escritor = "Michael Jackson";
                produtor = "Quincy Jones";
                break;
            // Adicione mais cases conforme necessário
            default:
                nome = "Música Desconhecida";
                genero = "Desconhecido";
                artista = "Desconhecido";
                escritor = "Desconhecido";
                produtor = "Desconhecido";
                break;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public String getEscritor() {
        return escritor;
    }

    public String getProdutor() {
        return produtor;
    }
}
