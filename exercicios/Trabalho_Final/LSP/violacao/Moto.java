package LSP.violacao;

public class Moto extends Transporte {
        public Moto(String nome, double velocidade, String motor) {
            super(nome, velocidade, motor);
        }

        @Override
        public void startMotor() {
            System.out.println("Aquecendo o motor da moto.");
        }

        @Override
        public void analisarTanque() {
            System.out.println("Verificando nível de gasolina da moto.");
        }
    }
