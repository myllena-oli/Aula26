package Exercicio1;

public class Hyundai extends Carro{

    public Hyundai(int ano, double valor, String cor, int portas) {
        super("Hyundai", ano, valor, cor, portas, 5);
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade());
    }

    @Override
    public int getFreio() {
        return 2;
    }

    @Override
    public int getAceleracao() {
        return 15;
    }

}
