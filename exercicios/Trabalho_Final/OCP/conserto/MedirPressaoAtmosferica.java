package OCP.conserto;

public class MedirPressaoAtmosferica implements Medir{
    private double valor;

    public MedirPressaoAtmosferica(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    @Override
    public double medir(){
        return valor / 10;
    }
}
