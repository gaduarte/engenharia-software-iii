package OCP.violacao;
/* Viola o princípio Open Closed (OCP), pois sempre que for preciso adicionar uma nova medição, 
será preciso modificar diretamente a classe Medidora e adicionar um novo método.
*/

public class Medidora {
    private double valor;

    public Medidora(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public double medirTemperatura(){
        return valor + 20 * 10;
    }
    public double medirPressaoAtmosferica(){
        return valor / 10;
    }
    public double medirAltura(){
        return valor * 0.5;
    }
    public double medirComprimento(){
        return valor * 1.5;
    }
}
