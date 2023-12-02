package ISP.conserto;

public class Penguim_v2 implements Nadador, Vertebrado, Animal{
    @Override
    public void nada(){
        System.out.println("Penguim Nadando");
    }

    @Override
    public void vertebrado(){
        System.out.println("Penguim é vertebrado");
    }

    @Override
    public int tempoVida(){
        return 20;
    }
}
