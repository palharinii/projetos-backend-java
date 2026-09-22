package programas;

import java.util.Scanner;

public class Jogador {
    public int inserirNivelDificuldade(Scanner scanner) {
        System.out.println("""
                insira o nivel de dificuldade:
                1. Facil (10 tentativas)
                2. Padrao (5 tentativas)
                3. Dificil (3 tentativas)""");

        int tentativas;

        do {
            System.out.print("sua resposta: ");
            int nivel = scanner.nextInt();
            scanner.nextLine();

            switch(nivel) {
                case 1 -> tentativas = 10;
                case 2 -> tentativas = 5;
                case 3 -> tentativas = 3;
                default -> {
                    System.out.println("o nivel so pode estar entre (1-3), tente novamente!");
                    tentativas = 0;
                }
            }
        } while(tentativas == 0);

        return tentativas;
    }

    public void inserirNumeroAleatorio(Scanner scanner, int numeroSorteado, int numeroTentativas) {
        boolean flag = true;

        int i = 0;
        while(i < numeroTentativas) {
            System.out.print("insira um numero entre (0-100): ");
            int tentativa = scanner.nextInt();
            scanner.nextLine();

            if(numeroSorteado > tentativa) {
                System.out.println("incorreto! o numero sorteado e maior que " + tentativa);
            } else if(numeroSorteado < tentativa) {
                System.out.println("incorreto! o numero sorteado e menor que " + tentativa);
            } else {
                System.out.println("correto! " + "o numero sorteado e: " + numeroSorteado);
                flag = false;
                break;
            }

            System.out.println("numero de tentativas restantes: " + (numeroTentativas - (i + 1)) + "\n");

            i++;
        }

        if(flag) {
            System.out.println("o numero sorteado era: " + numeroSorteado);
        }
    }

    public char sair(Scanner scanner) {
        System.out.println("""
                deseja sair?
                1. Sim
                2. Nao""");

        do {
            System.out.print("sua resposta: ");
            char resposta = scanner.nextLine().charAt(0);

            if(resposta != '1' && resposta != '2') {
                System.out.println("resposta inválida, tente novamente!");
            } else {
                return resposta;
            }
        } while(true);
    }
}