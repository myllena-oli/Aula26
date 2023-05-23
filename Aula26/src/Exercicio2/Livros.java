package Exercicio2;

public class Livros {
    private String genero;
    private String nome;
    private String isbn;
    private String pessoaAutora;
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPessoaAutora(String pessoaAutora) {
        this.pessoaAutora = pessoaAutora;
    }

    public void registrarLivro(String isbn) {
        setIsbn(isbn);
        System.out.println("O livro foi registrado com o ISBN " + isbn);
    }

    public void registrarLivro(String isbn, String nome) {
        setIsbn(isbn);
        setNome(nome);
        System.out.println("O livro foi registrado com o ISBN " + isbn + " e o nome " + nome);
    }

    public void registrarLivro(String isbn, String nome, String genero) {
        setIsbn(isbn);
        setNome(nome);
        setGenero(genero);
        System.out.println("O livro foi registrado com o ISBN " + isbn + ", o nome " + nome + " e o gênero " + genero);
    }

    public void registrarLivro(String isbn, String nome, String genero, String pessoaAutora) {
        setIsbn(isbn);
        setNome(nome);
        setGenero(genero);
        setPessoaAutora(pessoaAutora);
        System.out.println("O livro foi registrado com todos os atributos.");
    }

    public void mostrarInformacoes() {
        System.out.println("Informações do livro:");
        System.out.println("\nNome: " + nome + "\nISBN: " + isbn + "\nAutor: " + pessoaAutora + "\nGênero: " + genero);
    }


}
