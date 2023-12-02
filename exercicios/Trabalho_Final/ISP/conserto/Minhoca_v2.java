package ISP.conserto;

public class Minhoca_v2 implements Invertebrado, Animal{
    @Override
    public void invertebrado(){
        System.out.println("Minhoca é invertebrado");
    }

    @Override
    public int tempoVida(){
        return 1;
    }
}
