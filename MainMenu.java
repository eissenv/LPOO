package dev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaMusical biblioteca = new BibliotecaMusical();
        ControleVolume controleVolume = new ControleVolume();
        // Criar as músicas automaticamente
        biblioteca.criarMusicaAutomatica(1, biblioteca);
        biblioteca.criarMusicaAutomatica(2, biblioteca);
        biblioteca.criarMusicaAutomatica(3, biblioteca);
        biblioteca.criarMusicaAutomatica(4, biblioteca);

        Scanner scanner = new Scanner(System.in);
        int codigo = -1;
        int opcao = -1;

        do {
            System.out.println("\n--- Seja Bem-Vindo(a)! ---");
            System.out.println("---SpotiPobre---");
            System.out.println("1. Buscar música por código");
            System.out.println("2. Aumentar volume");
            System.out.println("3. Diminuir volume");
            System.out.println("4. Ver letra da música");
            System.out.println("5. Criar lista de reprodução");
            System.out.println("6. Adicionar música à lista de reprodução");
            System.out.println("7. Exibir lista de reprodução");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            scanner.nextLine();
            switch (opcao) {

                case 1:
                    System.out.print("Digite o código da música: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();

                    Musica musica = biblioteca.buscarMusicaPorCodigo(codigo);
                    if (musica != null) {
                    	System.out.println("---Tocando agora---");
                        System.out.println("");
                        System.out.println("Código: " + musica.getCodigo());
                        System.out.println("Nome: " + musica.getNome());
                        System.out.println("Gênero: " + musica.getGenero());
                        System.out.println("Artista: " + musica.getArtista());
                        System.out.println("Escritor: " + musica.getEscritor());
                        System.out.println("Produtor: " + musica.getProdutor());
                        System.out.println("Volume atual: " + controleVolume.getVolume());
                    } else {
                        System.out.println("\nMúsica não encontrada.");
                    }
                    break;
                case 2:
                    controleVolume.aumentarVolume();
                    break;
                case 3:
                    controleVolume.diminuirVolume();
                    break;
                case 4:
                    if (codigo != -1) {
                        System.out.print("Deseja ver a letra da música? (S/N): ");
                        String resposta = scanner.next();

                        char primeiraLetra = resposta.charAt(0); // Lê o primeiro caractere

                        if (Character.toUpperCase(primeiraLetra) == 'S') { // Converte para maiúsculo e compara com 'S'
                            LetraMusica letraMusica = new LetraMusica(codigo);
                            System.out.println("\nLetra da música:");
                            System.out.println(letraMusica.getLetra());
                        }
                    } else {
                        System.out.println("\nNenhuma música selecionada. Escolha uma música primeiro.");
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("---Criando sua lista---");
                    System.out.print("Digite o ID da lista de reprodução: ");
                    String idLista1 = scanner.nextLine();
                    

                    // Verificar se o ID já está em uso
                    if (biblioteca.verificarIdListaExistente(idLista1)) {
                        System.out.println("\nJá existe uma lista de reprodução com o ID informado. Por favor, escolha outro ID.");
                        break;
                    }

                    System.out.print("Digite a descrição da lista de reprodução: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite o autor da lista de reprodução: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o(s) editor(es) da lista de reprodução: ");
                    String editores = scanner.nextLine();
                    ListaDeReproducao listaDeReproducao = new ListaDeReproducao(idLista1, descricao, autor);
                    listaDeReproducao.setEditores(editores);
                    biblioteca.adicionarListaDeReproducao(listaDeReproducao);
                    System.out.println("\nLista de reprodução criada com sucesso!");
                    break;

                case 6:
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Digite o ID da lista de reprodução: ");
                    idLista1 = scanner.nextLine();
                    System.out.print("Digite o código da música a ser adicionada: ");
                    codigo = scanner.nextInt();

                    Musica musicaAdicionada = biblioteca.buscarMusicaPorCodigo(codigo);
                    ListaDeReproducao listaAdicionada = biblioteca.buscarListaDeReproducaoPorId(idLista1);

                    if (musicaAdicionada != null && listaAdicionada != null) {
                        listaAdicionada.adicionarMusica(musicaAdicionada);
                        System.out.println("\nMúsica adicionada à lista de reprodução com sucesso!");
                    } else {
                        System.out.println("\nMúsica ou lista de reprodução não encontrada.");
                    }
                    break;
                case 7:
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Digite o ID da lista de reprodução: ");
                    idLista1 = scanner.nextLine();

                    ListaDeReproducao listaExibida = biblioteca.buscarListaDeReproducaoPorId(idLista1);
                    if (listaExibida != null) {
                        System.out.println("\nLista de Reprodução:");
                        System.out.println("ID: " + listaExibida.getId());
                        System.out.println("Descrição: " + listaExibida.getDescricao());
                        System.out.println("Autor: " + listaExibida.getAutor());
                        System.out.println("Editores: " + listaExibida.getEditores());
                        System.out.println("Músicas:");
                        for (Musica m : listaExibida.getMusicas()) {
                            System.out.println("- " + m.getNome());
                        }
                    } else {
                        System.out.println("\nLista de reprodução não encontrada.");
                    }
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
