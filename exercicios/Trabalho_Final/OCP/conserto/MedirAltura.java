package OCP.conserto;

public class MedirAltura implements Medir{
    private double valor;

    public MedirAltura(double valor){
        this.valor = valor;
    }

    public double getAltura(){
        return valor;
    }

    @Override
    public double medir(){
        return valor * 0.5;
    }
}
