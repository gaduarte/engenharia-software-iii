package ISP.violacao;

public class PeixeVoador implements Animal {
    @Override
    public void nada(){
        System.out.println("Peixe Nadando");
    }

    @Override
    public void voa(){
        System.out.println("Peixe Voando");
    }

    @Override
    public void mamifero(){
        throw new UnsupportedOperationException("Peixe não é um mamífero");
    }

    @Override
    public void vertebrado(){
        System.out.println("Peixe Voador é vertebrado");
    }

    @Override
    public void invertebrado(){
        throw new UnsupportedOperationException("Peixe voador não é um invertebrado");
    }

    @Override
    public int tempoVida(){
        return 2;
    }
}

