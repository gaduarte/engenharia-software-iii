package LSP.violacao;

public class Carro extends Transporte {
    public Carro(String nome, double velocidade, String motor) {
        super(nome, velocidade, motor);
    }

    @Override
    public void startMotor() {
        System.out.println("Aquecendo o motor do carro.");
    }

    @Override
    public void analisarTanque() {
        System.out.println("Verificando nível de gasolina do carro.");
    }
}
