package Exercicio1;

public class Fiat extends Carro{
    public Fiat(int ano, double valor, String cor, int portas) {
        super("Fiat", ano, valor, cor, portas, 3);
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade());
    }

    @Override
    public int getAceleracao() {
        return 12;
    }

    @Override
    public int getFreio() {
        return 6;
    }

}
