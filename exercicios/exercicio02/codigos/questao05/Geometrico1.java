package questao05;

/* Coesão Lógica */

abstract class Geometrico1 {
    private float lado;
    private float altura;
    private float base;

    public Geometrico1(float lado, float altura, float base){
        this.lado=lado;
        this.altura=altura;
        this.base=base;
    }

    public float getLado(){
        return lado;
    }

    public float getAltura(){
        return altura;
    }

    public float getBase(){
        return base;
    }

    public void mostrarArquivo(){
        System.out.println("Lado: "+ lado + "Altura: " + altura + "Base: " + base);
    }

    abstract float area();
    abstract float perimetro();
}

class Triangulo extends Geometrico1{
    public Triangulo(float lado, float altura, float base){
        super(lado, altura, base);
    }

    float area(){
        return (this.getBase()*this.getAltura())/2;
    }

    float perimetro(){
        return this.getLado() + this.getLado() + this.getLado();
    }
}
