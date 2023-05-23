package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro kwid = new Renault(2023, 20000, "Preto", 4);
        Carro mobi = new Fiat(2022, 30000, "Branco", 2);
        Carro tucson = new Hyundai(2021, 40000, "Azul", 4);

        System.out.println("Testando o Renault: ");
        System.out.println("Ano: " + kwid.getAno() + "\nValor: " + kwid.getValor() + "\nCor: " + kwid.getCor() + "\nPortas: " + kwid.getPortas());
        kwid.iniciarPartida();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Checar Velocidade");
            System.out.println("4. Ir para o próximo carro");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    kwid.acelerar();
                    break;
                case 2:
                    kwid.frear();
                    break;
                case 3:
                    System.out.println("A velocidade é "+kwid.getVelocidade());
                    break;
                case 4:
                    System.out.println("Próximo carro...\n");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 4);


        System.out.println("Testando o Fiat: ");
        System.out.println("Ano: " + mobi.getAno() + "\nValor: " + mobi.getValor() + "\nCor: " + mobi.getCor() + "\nPortas: " + mobi.getPortas());
        mobi.iniciarPartida();

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Checar Velocidade");
            System.out.println("4. Ir para o próximo carro");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    mobi.acelerar();
                    break;
                case 2:
                    mobi.frear();
                    break;
                case 3:
                    System.out.println("A velocidade é "+mobi.getVelocidade());
                    break;
                case 4:
                    System.out.println("Próximo carro...\n");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 4);


        System.out.println("Testando o Hyundai: ");
        System.out.println("Ano: " + tucson.getAno() + "\nValor: " + tucson.getValor() + "\nCor: " + tucson.getCor() + "\nPortas: " + tucson.getPortas());
        tucson.iniciarPartida();

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Checar Velocidade");
            System.out.println("4. Ir para o próximo carro");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    tucson.acelerar();
                    break;
                case 2:
                    tucson.frear();
                    break;
                case 3:
                    System.out.println("A velocidade é "+tucson.getVelocidade());
                    break;
                case 4:
                    System.out.println("Esse era o último carro!\n");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 4);

    }
}