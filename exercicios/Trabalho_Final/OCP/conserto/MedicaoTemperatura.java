package OCP.conserto;

public class MedicaoTemperatura  implements Medir{
    private double valor;

    public MedicaoTemperatura(double valor){
        this.valor = valor;
    }

    public double getTemperatura(){
        return valor;
    }

    @Override
    public double medir(){
        return valor * 10;
    }
}
