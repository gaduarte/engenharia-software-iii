package OCP.conserto;

public class MedirComprimento implements Medir {
    private double valor;

    public MedirComprimento(double valor){
        this.valor = valor;
    }

    public double getAltura(){
        return valor;
    }

    @Override
    public double medir(){
        return valor * 1.5;
    }
}
