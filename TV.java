public class TV {

    int tamanhoTela;
    int volume = 5;
    String marca;
    int voltagem;
    int canal = 1;

    void ligar() {
        int consumo = voltagem * tamanhoTela;
        System.out.println("TV ligada");
        System.out.println("Consumo: " + consumo);
    }

    void desligar() {
        System.out.println("TV desligada");
    }

    void aumentarVolume() {
        if (volume < 10) {
            volume++;
        }
        System.out.println("Volume: " + volume);
    }

    void diminuirVolume() {
        if (volume > 1) {
            volume--;
        }
        System.out.println("Volume: " + volume);
    }

    void subirCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    void descerCanal() {
        if (canal > 1) {
            canal--;
        }
        System.out.println("Canal: " + canal);
    }

    public static void main(String[] args) {

        TV tv = new TV();

        tv.tamanhoTela = 50;
        tv.voltagem = 220;
        tv.marca = "LG";

        tv.ligar();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.subirCanal();
        tv.descerCanal();
        tv.desligar();
    }
} 
