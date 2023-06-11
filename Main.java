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


	
        
   
/*System.out.println("Álbuns favoritos de Maria:");
             for (Album album : maria.getAlbunsFavoritos()) {
                 System.out.println("- " + album.getNome());
             }*/




/*		// Testes de criação de usuário
		System.out.println("Criando um usuário com plano pago:");
		Usuario maria = new Usuario("1", "Maria", "85674359845", "03/01/2000", "4685659741", "maria@gmail.com", "Pago", "PIX");
		
		System.out.println("Criando um usuário com plano Gratuito:");
        Usuario jorge = new Usuario("2", "Jorge", "78965412365", "15/05/1995", "987654321", "jorge@gmail.com", "Gratuito", "Nenhum");
        
        System.out.println("Criando um usuário com plano pago, mas a forma de pagamento não é válida:");
        Usuario caio = new Usuario("3", "Caio", "98765432198", "28/07/1998", "123456789", "caio@gmail.com", "Pago", "Fiado");
 
        System.out.println("Criando um usuário do tipo artista: ");
        Artista rihanna = new Artista("4", "Rihanna", "56386940390", "22/06/1990", "8956372346", "rihanna@gmail.com", "Pago", "PIX");

        
        
        
        // Testes de criação de álbum
      
        Album album = new Album("3", "Novo Álbum", rihanna, "10/05/2021");
        rihanna.adicionarAlbum(album);
        
        Album album2 = new Album("4", "Novo Álbum2", rihanna, "07/01/2023");
        rihanna.adicionarAlbum(album2);
        
        rihanna.exibirAlbuns();
        
        
        // Teste para calcular a idade:
        System.out.println("A idade de " + maria.getNome() + " é: " + maria.calcularIdade() + " anos."); 

		// Testes para adicionar músicas, álbuns e artistas aos favoritos do usuário:
		maria.exibirAlbunsFavoritos();
		maria.exibirArtistasFavoritos();
		maria.exibirMusicasFavoritas();


*/



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

*/
