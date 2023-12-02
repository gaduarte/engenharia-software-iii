package ISP.conserto;

public class Golfinho_v2 implements Nadador, Mamifero, Vertebrado, Animal{
    @Override
    public void nada(){
        System.out.println("Golfinho nadando");
    }

    @Override
    public void mamifero() {
        System.out.println("Golfinho é um mamífero");
    }

    @Override
    public void vertebrado(){
        System.out.println("Golfinho é um vertebrado");
    }

    @Override
    public int tempoVida(){
        return 30;
    }
}
