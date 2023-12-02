package LSP.violacao;
// Viola o princípio da Substituição de Liskov ao introduzir exceções não previstas na classe base (Transporte) por meio dos métodos startMotor e analisarTanque nas subclasses (Skate e Bicicleta). Isso impede que objetos dessas subclasses sejam substituíveis por objetos da classe base sem alterar o comportamento básico esperado pela classe base.

// Exceção personalizada para indicar a falta de motor
class SemMotorException extends RuntimeException {
    public SemMotorException(String message) {
        super(message);
    }
}

// Exceção personalizada para indicar a falta de gasolina
class SemGasolinaException extends RuntimeException {
    public SemGasolinaException(String message) {
        super(message);
    }
}

public class Transporte {
    private String nome;
    private double velocidade;
    private String motor;
    private double gasolina;

    public Transporte(String nome, double velocidade, String motor) {
        this.nome = nome;
        this.velocidade = velocidade;
  
    }

    public void startMotor() {
        if (motor == null || motor.isEmpty()) {
            throw new SemMotorException("Este transporte não possui um motor.");
        }
        System.out.println("Motor do transporte " + nome + " iniciado.");
    }

    public void analisarTanque() {
        if (gasolina <= 0) {
            throw new SemGasolinaException("O tanque de gasolina está vazio.");
        }
        System.out.println("Analisando tanque do transporte " + nome + ".");
    }

}



