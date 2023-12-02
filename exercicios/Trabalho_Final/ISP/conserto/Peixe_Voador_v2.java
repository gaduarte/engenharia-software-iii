package ISP.conserto;

public class Peixe_Voador_v2 implements Nadador, Vertebrado, Voador, Animal{
    @Override
    public void nada(){
        System.out.println("Peixe Nadando");
    }

    @Override
    public void voa(){
        System.out.println("Peixe Voando");
    }

    @Override
    public void vertebrado(){
        System.out.println("Peixe Voador é vertebrado");
    }

    @Override
    public int tempoVida(){
        return 2;
    }
}
