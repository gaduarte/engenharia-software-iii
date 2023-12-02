package LSP.violacao;

public class Bicicleta extends Transporte {
        public Bicicleta(String nome, double velocidade, String motor) {
            super(nome, velocidade, motor);
        }

        @Override
        public void startMotor() {
            throw new SemMotorException("Bicicletas não têm motor para iniciar.");
        }

        @Override
        public void analisarTanque() {
            throw new SemGasolinaException("Bicicletas não têm tanque para analisar.");
        }
    }
