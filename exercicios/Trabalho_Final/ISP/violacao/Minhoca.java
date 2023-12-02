package ISP.violacao;

public class Minhoca implements Animal{
    @Override
    public void nada(){
        throw new UnsupportedOperationException("Minhoca não nada");
    }
    @Override
    public void voa(){
        throw new UnsupportedOperationException("Minhoca não voa");
    }

    @Override
    public void mamifero(){
        throw new UnsupportedOperationException("Minhoca não é um mamífero");
    }

    @Override
    public void vertebrado(){
        throw new UnsupportedOperationException("Minhoca não é um vertebrado");
    }

    @Override
    public void invertebrado(){
        System.out.println("Minhoca é invertebrado");
    }

    @Override
    public int tempoVida(){
        return 1;
    }
}

