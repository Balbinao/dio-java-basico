package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoItens;

    public CarrinhoDeCompras() {
        this.carrinhoItens = new ArrayList<>();

    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(preco, nome, quantidade);
        this.carrinhoItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!carrinhoItens.isEmpty()){
            for(Item i : carrinhoItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
                carrinhoItens.removeAll(itensParaRemover);
            }
        }else{
            System.out.println("Carrinho esta vazio");
        }
    }
    public double calcularValorTotal() throws RuntimeException {
        double valorTotal = 0;
        if(!carrinhoItens.isEmpty()){
            for(Item i : carrinhoItens){
                double valor = i.getPreco() * i.getQuantidade();
                valorTotal += valor;
            }
            return valorTotal;
        }else {
        throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens(){
        if(!carrinhoItens.isEmpty()){
            System.out.println(this.carrinhoItens);
        }
        else{
            System.out.println("A lista está vazia");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens = " + carrinhoItens +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Arroz", 15, 3);
        carrinhoDeCompras.adicionarItem("Feijao", 10, 3);
        carrinhoDeCompras.adicionarItem("Milho", 5, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é de R$" + carrinhoDeCompras.calcularValorTotal());
    }
}
