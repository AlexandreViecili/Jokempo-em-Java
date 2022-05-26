package jokempo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre F. V. Pinheiro
 */
public class Jokempo {

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("===================================");
            System.out.println("||            JOKEMPO            ||");
            System.out.println("===================================");
            System.out.println("Você consegue superar o Computador?");
            int jogador, computador;
            int jogadorP = 0;
            int computadorP = 0;            
            Scanner input = new Scanner(System.in);
            Random aleatorio = new Random();
            System.out.println("===================================");
            System.out.println("||          Placar Atual         ||");
            System.out.println("||   Jogador: 0 Computador:  0   ||");
            System.out.println("===================================");
            System.out.println("");
            System.out.println("Escolha sua jogada:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");        
            System.out.println("");
            while (jogadorP < 3 && computadorP < 3){
                jogador = input.nextInt();
                computador = aleatorio.nextInt(3) + 1;
                switch (jogador) {
                case 1:
                    System.out.println("Você escolheu PEDRA");
                    break;
                case 2:
                    System.out.println("Você escolheu PAPEL");
                    break;
                case 3:
                    System.out.println("Você escolheu TESOURA");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
                }
                switch (computador) {
                case 1:
                    System.out.println("O computador escolheu PEDRA.");
                    break;
                case 2:
                    System.out.println("O computador escolheu PAPEL");
                    break;
                case 3:
                    System.out.println("O computador escolheu TESOURA");
                    break;
                }
                System.out.println("");
                if (jogador == computador){
                    System.out.println("EMPATE!");
                } else {
                    if ((jogador - computador == -2) || (jogador - computador == 1)){
                    System.out.println("VOCÊ GANHOU ESTA RODADA!");
                    jogadorP = jogadorP + 1;
                  } else {
                        if ((jogador - computador == -1) || (jogador - computador == 2)){
                            System.out.println("O COMPUTADOR GANHOU ESTA RODADA!");    
                    }computadorP = computadorP + 1;
                    }
                  }
            System.out.println("===================================");
            System.out.println("||          Placar Atual         ||");
            System.out.println("||   Jogador: " +jogadorP+ " Computador:  " +computadorP+ "   ||");
            System.out.println("===================================");
            }
            if (jogadorP > computadorP) {
                System.out.println("VOCÊ VENCEU O JOGO!!");
            } else if (jogadorP < computadorP) {
                System.out.println("O COMPUTADOR VENCEU O JOGO");            
            } else {
                System.out.println("O JOGO EMPATOU!!");
            }
            System.out.println("Digite qualquer tecla pra jogar novamente ou digite '0' para sair");            
            opcao = input.nextInt();
        } while (opcao != 0);
        System.out.println("Obrigado por jogar!");    
    }    
}
        
    
    
