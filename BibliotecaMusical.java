package dev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BibliotecaMusical {
    private Map<String, Set<Musica>> generosMusicais;
    private Map<String, ListaDeReproducao> listasDeReproducao;

    public BibliotecaMusical() {
        generosMusicais = new HashMap<>();
        listasDeReproducao = new HashMap<>();
    }

    public void adicionarGenero(String genero) {
        if (!generosMusicais.containsKey(genero)) {
            generosMusicais.put(genero, new HashSet<>());
        }
    }

    public void adicionarMusica(Musica musica) {
        Set<Musica> musicasDoGenero = generosMusicais.get(musica.getGenero());
        if (musicasDoGenero != null) {
            musicasDoGenero.add(musica);
            System.out.println("Música adicionada à biblioteca!");
        } else {
            System.out.println("O gênero musical especificado não existe.");
        }
    }

    public Musica buscarMusicaPorCodigo(int codigo) {
        for (Set<Musica> musicas : generosMusicais.values()) {
            for (Musica musica : musicas) {
                if (musica.getCodigo() == codigo) {
                    return musica;
                }
            }
        }
        return null;
    }

    public Musica criarMusicaAutomatica(int codigo, BibliotecaMusical biblioteca) {
        Musica musica = new Musica(codigo, this);
        return musica;
    }
    
    public void adicionarListaDeReproducao(ListaDeReproducao lista) {
        listasDeReproducao.put(lista.getId(), lista);
    }

    public ListaDeReproducao buscarListaDeReproducaoPorId(String id) {
        for (ListaDeReproducao lista : listasDeReproducao.values()) {
            if (lista.getId().equals(id)) {
                return lista;
            }
        }
        return null;
    }
    public boolean verificarIdListaExistente(String id) {
        return listasDeReproducao.containsKey(id);
    }

    

}
