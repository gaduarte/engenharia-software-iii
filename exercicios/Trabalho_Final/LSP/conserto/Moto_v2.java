package LSP.conserto;

public class Moto_v2 {
    private String nome;
    private Motor motor;
    private Tanque tanque;

    public Moto_v2(String nome, Motor motor, Tanque tanque) {
        this.nome = nome;
        this.motor = motor;
        this.tanque = tanque;
    }

    public void startMotor(){
        motor.start();
    }

    public void analisarTanque(){
        tanque.analisar();
    }
}
