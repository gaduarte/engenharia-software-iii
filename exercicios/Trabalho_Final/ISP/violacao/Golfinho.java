package ISP.violacao;

public class Golfinho implements Animal {
    @Override
    public void nada(){
        System.out.println("Golfinho nadando");
    }

    @Override
    public void voa(){
        throw new UnsupportedOperationException("Golfinho não voa");
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
    public void invertebrado(){
        throw new UnsupportedOperationException("Golfinho não é invertebrado");
    }

    @Override
    public int tempoVida(){
        return 30;
    }
}
