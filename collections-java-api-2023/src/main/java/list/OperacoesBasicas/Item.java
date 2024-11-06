package main.java.list.OperacoesBasicas;

public class Item {
    String nome;
    double preco;
    int quantidade;

    public Item(double preco, String nome, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return "Item {" +
                " nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", quant = " + quantidade +
                '}';
    }
}
