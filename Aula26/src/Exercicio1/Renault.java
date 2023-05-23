package Exercicio1;

public class Renault extends Carro {

    public Renault(int ano, double valor, String cor, int portas) {
        super("Renault", ano, valor, cor, portas, 0);
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade());
    }

    @Override
    public int getAceleracao() {
        return 10;
    }

    @Override
    public int getFreio() {
        return 5;
    }
}
