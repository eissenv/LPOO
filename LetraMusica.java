public class LetraMusica {
    private String letra;

    public LetraMusica(int codigo) {
        letra = gerarLetra(codigo);
    }

    private String gerarLetra(int codigo) {
        switch (codigo) {
            case 1:
                return "Bohemian Rhapsody lyrics, aguarde...";
            case 2:
                return "Imagine lyrics, aguarde...";
            case 3:
                return "Hotel California lyrics, aguarde...";
            case 4:
                return "Billie Jean lyrics, aguarde...";
            default:
                return "Letra desconhecida.";
        }
    }

    public String getLetra() {
        return letra;
    }
}
