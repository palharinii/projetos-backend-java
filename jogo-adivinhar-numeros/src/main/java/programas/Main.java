package programas;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char resposta;
        do {
            Computador computador = new Computador(random);
            computador.gerarNumerosAleatorios();
            int numeroSorteado = computador.sortearNumeroPorId();

            Jogador jogador = new Jogador();
            int numeroTentativas = jogador.inserirNivelDificuldade(scanner);
            jogador.inserirNumeroAleatorio(scanner, numeroSorteado, numeroTentativas);

            resposta = jogador.sair(scanner);
        } while(resposta != '1');
    }
}