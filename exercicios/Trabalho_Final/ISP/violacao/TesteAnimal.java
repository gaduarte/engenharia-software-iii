package ISP.violacao;

public class TesteAnimal {
    public static void main(String[] args){
        Golfinho golfinho = new Golfinho();
        PeixeVoador peixe = new PeixeVoador();
        Penguim penguim = new Penguim();
        Minhoca minhoca = new Minhoca();

        System.out.println("Golfinho:");
        golfinho.nada();
        golfinho.mamifero();
        golfinho.vertebrado();
        System.out.println("Tempo de vida: " + golfinho.tempoVida() + " anos");
        System.out.println();

        System.out.println("Peixe Voador:");
        peixe.nada();
        System.out.println("Tempo de vida: " + peixe.tempoVida() + " anos");
        System.out.println();

    
        System.out.println("Penguim:");
        penguim.nada();
        //penguim.mamifero(); 
        penguim.vertebrado();
        System.out.println("Tempo de vida: " + penguim.tempoVida() + " anos");
        System.out.println();


        System.out.println("Minhoca:");
        //minhoca.nada();
        minhoca.invertebrado();
        System.out.println("Tempo de vida: " + minhoca.tempoVida() + " anos");
    }
}

