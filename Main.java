import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		BibliotecaMusical biblioteca = new BibliotecaMusical();

        // Criar as músicas automaticamente
        biblioteca.criarMusicaAutomatica(1);
        biblioteca.criarMusicaAutomatica(2);
        biblioteca.criarMusicaAutomatica(3);
        biblioteca.criarMusicaAutomatica(4);
        // Interage com o usuário para buscar músicas por código
        Scanner scanner = new Scanner(System.in);
        int codigo;

        do {
            System.out.print("Digite o código da música (ou 0 para sair): ");
            codigo = scanner.nextInt();

            if (codigo != 0) {
                Musica musica = biblioteca.buscarMusicaPorCodigo(codigo);

                if (musica != null) {
                    System.out.println();
                    System.out.println("Informações da música:");
                    System.out.println();
                    System.out.println("Código: " + musica.getCodigo());
                    System.out.println("Nome: " + musica.getNome());
                    System.out.println("Gênero: " + musica.getGenero());
                    System.out.println("Artista: " + musica.getArtista());
                    System.out.println("Escritor: " + musica.getEscritor());
                    System.out.println("Produtor: " + musica.getProdutor());
                    System.out.println();
                } else {
                    System.out.println("Música não encontrada.");
                }
            }
        } while (codigo != 0);

        System.out.println("Encerrando o programa...");
        scanner.close();
    }
}










/*

public class Plano {
	   private String nome;
	   private String descricao;

	    public Plano(String nome, String descricao) {
	        this.nome = nome;
	        setDescricao(descricao);
	    }
	    
	    public void setDescricao(String descricao) {
	        if (descricao.length() <= 240) {
	            this.descricao = descricao;
	        } else {
	            throw new IllegalArgumentException("A descrição deve ter no máximo 240 caracteres.");
	        }
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    
	}



*/
