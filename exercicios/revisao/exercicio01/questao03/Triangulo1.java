public class Triangulo1 {
    private int lado1;
    private int lado2;
    private int lado3;

    Triangulo1(int lado1, int lado2, int lado3){
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }

    public int getLado1(){
        return lado1;
    }

    public void setLado1(int lado1){
        this.lado1 = lado1;
    }

    public int getLado2(){
        return lado2;
    }

    public void setLado2(int lado2){
        this.lado2 = lado2;
    }

    public int getLado3(){
        return lado3;
    }

    public void setLado3(int lado3){
        this.lado3 = lado3;
    }


    public void ehtriangulo(int lado1, int lado2, int lado3) throws TrianguloException {
        if (!((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2)) {
            throw new TrianguloException("Não é triângulo.");
        }
    }    

    public void tipoTriangulo() throws TrianguloException{
        if(lado1 == lado2 && lado2 == lado3){
            throw new TrianguloException("Equilátero.");
        }
        if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            throw new TrianguloException("Escaleno.");
        }
        throw new TrianguloException("Isóceles.");
    }
    
}
