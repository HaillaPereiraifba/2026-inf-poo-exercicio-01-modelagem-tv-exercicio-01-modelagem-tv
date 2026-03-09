public class TV {

    //Características da TV
    int tamanhoTela; // tamanho da tela em polegadas
    int volume = 5;  // volume começa em 5 (mínimo 1 e máximo 10)
    String marca; // marca da TV
    int voltagem; // 110 ou 220
    int canal = 1; // canal inicial

    // Método para ligar a TV
    void ligar() {
        int consumo = voltagem * tamanhoTela;// calcula o consumo
        System.out.println("TV ligada");
        System.out.println("Consumo: " + consumo);
    }

    // Método para desligar a TV
    void desligar() {
        System.out.println("TV desligada");
    }

    // Aumenta o volume
    void aumentarVolume() {
        if (volume < 10) { //só aumenta se for menor que 10
            volume++;
        }
        System.out.println("Volume: " + volume);
    }

    // Diminui o volume
    void diminuirVolume() {
        if (volume>1) { // só diminui se for maior que 1
            volume--;
        }
        System.out.println("Volume: "+volume);
    }

    // Passa para o próximo canal
    void subirCanal() {
        canal++;
        System.out.println("Canal: "+canal);
    }

    // Volta para o canal anterior
    void descerCanal() {
        canal--;
        System.out.println("Canal: "+canal);
    }
}
