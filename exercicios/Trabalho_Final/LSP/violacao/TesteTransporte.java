package LSP.violacao;

public class TesteTransporte {
    public static void main(String[] args) {
        Carro carro = new Carro("Carro 01", 150, "MotorV8");
        carro.startMotor();
        carro.analisarTanque();

        System.out.println("------------------------");

        Skate skate = new Skate("Skate 01", 20, null);
        try {
            skate.startMotor();
        } catch (SemMotorException e) {
            System.out.println(e.getMessage());
        }

        try {
            skate.analisarTanque();
        } catch (SemGasolinaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------");

        Bicicleta bicicleta = new Bicicleta("Bicicleta 01", 15, null);
        try {
            bicicleta.startMotor();
        } catch (SemMotorException e) {
            System.out.println(e.getMessage());
        }

        try {
            bicicleta.analisarTanque();
        } catch (SemGasolinaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------");


        Moto moto = new Moto("Moto 01", 180, "MotorPotente");
        moto.startMotor();
        moto.analisarTanque();
    }
}

