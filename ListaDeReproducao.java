import java.util.ArrayList;
import java.util.List;

public class ListaDeReproducao {
    private String id;
    private String descricao;
    private String autor;
    private String editores;
    private List<Musica> musicas;

    public ListaDeReproducao(String id, String descricao, String autor) {
        this.id = id;
        this.descricao = descricao;
        this.autor = autor;
        this.musicas = new ArrayList<>();
    }

    // Métodos getters e setters
    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAutor() {
        return autor;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    // Método para adicionar música à lista de reprodução
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
    public String getEditores() {
        return editores;
    }

    public void setEditores(String editores) {
        this.editores = editores;
    }
}
