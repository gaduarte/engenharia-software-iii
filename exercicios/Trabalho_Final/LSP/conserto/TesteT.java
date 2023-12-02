package LSP.conserto;

public class TesteT {
    public static void main(String[] args) {
        Carro_v2 carro = new Carro_v2("Carro A", new MotorPadrao(), new TanquePadrao());
        Bicicleta_v2 bicicleta = new Bicicleta_v2("Bicicleta B");
        Skate_v2 skate = new Skate_v2("Skate C");
        Moto_v2 moto = new Moto_v2("Moto Z", new MotorPadrao(), new TanquePadrao());

        System.out.println("Teste com Carro:");
        carro.startMotor();
        carro.analisarTanque();

        System.out.println("\nTeste com Bicicleta:");
        bicicleta.startMotor();
        bicicleta.analisarTanque();

        System.out.println("\nTeste com Skate:");
        skate.startMotor();
        skate.analisarTanque();

        System.out.println("\nTeste com Moto: ");
        moto.startMotor();
        moto.analisarTanque();
    }
}
