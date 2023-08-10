
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
    }

    public static void main(String[] args) {
        MarcaA pratoMarca = new MarcaA("modelo-0.1", "prato",2,33.0);

        System.out.println("Modelo: " + pratoMarca.getModelo());
        System.out.println("Nome: " + pratoMarca.nome);
        System.out.println("Quantidade: " + pratoMarca.getQuantidade());
        System.out.println("Preço: " + pratoMarca.getPreco());
        System.out.println("Preço com Desconto: " + pratoMarca.calcularDesconto());
        
    }

}
