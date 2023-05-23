package Exercicio1;

public class Carro {
    private String marca, cor;
    private int ano, portas;
    private double valor, velocidade;

    public Carro(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }


    public void iniciarPartida() {
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");

    }

    public void frear() {
        velocidade = velocidade - getFreio();
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    public void acelerar() {
        velocidade = velocidade + getAceleracao();
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }

    public int getAceleracao() {
        return 0;
    }
    public int getFreio() {
        return 0;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public int getPortas() {
        return portas;
    }

    public String getCor() {
        return cor;
    }
}
