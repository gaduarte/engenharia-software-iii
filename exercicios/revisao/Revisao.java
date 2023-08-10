import java.util.ArrayList;
import java.util.List;

public class Revisao {

    public interface ProdutoDesconto{
        double calcularDesconto();
    }

    public static class Produto {
        public String nome;
        private int quantidade;
        private double preco;

        public Produto() {

        }

        public Produto(String nome, int quantidade, double preco) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }

        public int getQuantidade(){
            return quantidade;
        }

        public void setQuantidade(int quantidade){
            this.quantidade = quantidade;
        }

        public double getPreco(){
            return preco;
        }

        public void setPreco(double preco){
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
        }
        
    }

    public static class MarcaA extends Produto implements ProdutoDesconto{
        private String modelo;

        public MarcaA() {

        }

        public MarcaA(String modelo, String nome, int quantidade,double preco) {
            super(nome,quantidade,preco);
            this.modelo = modelo;
        }

        public String getModelo(){
            return modelo;
        }

        public void setModelo(String modelo){
            this.modelo = modelo;
        }

        @Override
        public double calcularDesconto(){
            return getPreco() * 0.5;
        }

        @Override
        public String toString() {
            return super.toString() + " Modelo=" + getModelo();
        }
    }

    public static class Pedido{
        private List<Produto> produtos = new ArrayList<>();

        public void adicionarProd(Produto produto){
            produtos.add(produto);
        }

        public List<Produto> getProdutos(){
            return produtos;
        }
    }

    public static void main(String[] args) {
        MarcaA pratoMarca = new MarcaA("modelo-0.1", "prato",2,33.0);
        MarcaA talherMarca = new MarcaA("modelo-0.2", "copo", 4, 8.0);

        Pedido pedido = new Pedido();
        pedido.adicionarProd(pratoMarca);
        pedido.adicionarProd(talherMarca);

        System.out.println("Produtos: ");
        for (Produto produto : pedido.getProdutos()){
            System.out.println(produto);
        }
        
    }

}

