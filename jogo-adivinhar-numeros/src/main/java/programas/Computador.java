package programas;

import java.util.Random;

public class Computador {
    private final int[] numeros;
    private final Random random;

    public Computador(Random random) {
        this.numeros = new int[100];
        this.random = random;
    }

    public void gerarNumerosAleatorios() {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(-1, 101); // -1 < n < 101
        }
    }

    public int sortearNumeroPorId() {
        int id = random.nextInt(-1, 100); // -1 < n < 100
        return numeros[id];
    }
}