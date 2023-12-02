package LSP.conserto;

public class Skate_v2 {
    private String nome;
    private Motor motor;
    private Tanque tanque;

    public Skate_v2(String nome) {
        this.nome = nome;
        this.motor = new SemMotor();
        this.tanque = new SemTanque();
    }

    public void startMotor() {
        motor.start();
    }

    public void analisarTanque() {
        tanque.analisar();
    }
}
