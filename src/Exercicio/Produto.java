package Exercicio;

public class Produto implements Exibivel {
    // Atibutos
    public String nome;
    public double preco;
    public String categoria;

    // Contrutor
    public Produto(String nome, double preco,  String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Metodo exibirDetalhes

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome + "Preco: " + preco + "Categoria: " + categoria);
    }
}
