package ISP.violacao;

public class Penguim implements Animal{
    
    @Override
    public void nada(){
        System.out.println("Penguim Nadando");
    }

    @Override
    public void voa(){
        throw new UnsupportedOperationException("Penguim não voa");
    }

    @Override
    public void mamifero(){
        throw new UnsupportedOperationException("Penguim não é um mamífero");
    }

    @Override
    public void vertebrado(){
        System.out.println("Penguim é vertebrado");
    }

    @Override
    public void invertebrado(){
        throw new UnsupportedOperationException("Penguim não é um invertebrado");
    }

    @Override
    public int tempoVida(){
        return 20;
    }
}
