package Exercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPrimeiro Livro:");
        Livros livro1 = new Livros();
        livro1.registrarLivro("0-7475-3269-9");
        livro1.mostrarInformacoes();

        System.out.println("\nSegundo Livro:");

        Livros livro2 = new Livros();
        livro2.registrarLivro("0-7868-5629-7", "O Ladrão de Raios");
        livro2.mostrarInformacoes();

        System.out.println("\nTerceiro Livro:");

        Livros livro3 = new Livros();
        livro3.registrarLivro("978-972-23-3907-0","A menina que roubava livros", "Ficção juvenil");
        livro3.mostrarInformacoes();

        System.out.println("\nQuarto Livro:");

        Livros livro4 = new Livros();
        livro4.registrarLivro("978-85-8057-290-2","Garota exemplar", "Suspense", "Gillian Flynn");
        livro4.mostrarInformacoes();
    }
}
