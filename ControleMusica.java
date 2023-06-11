public class ControleVolume {
    private int volume;

    public ControleVolume() {
        this.volume = 50; // Definir o volume inicial como 50
    }

    public void aumentarVolume() {
        if (volume + 10 <= 100) {
            volume += 10;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("Volume máximo atingido");
        }
    }

    public void diminuirVolume() {
        if (volume - 10 >= 0) {
            volume -= 10;
            System.out.println("Volume diminuído para " + volume);
        } else {
            System.out.println("Volume mínimo atingido");
        }
    }

    public int getVolume() {
        return volume;
    }
}
