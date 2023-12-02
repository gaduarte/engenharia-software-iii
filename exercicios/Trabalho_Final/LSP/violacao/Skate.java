package LSP.violacao;
public class Skate extends Transporte {
        public Skate(String nome, double velocidade, String motor) {
            super(nome, velocidade, motor);
        }
        
        @Override
        public void startMotor() {
            throw new SemMotorException("Skates não têm motor para iniciar.");
        }

        @Override
        public void analisarTanque() {
            throw new SemGasolinaException("Skates não têm tanque para analisar.");
        }
}