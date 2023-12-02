package ISP.conserto;

public class TesteIsp {
    public static void main(String[] args){
        Golfinho_v2 golfinho = new Golfinho_v2();
        Peixe_Voador_v2 peixe = new Peixe_Voador_v2();
        Penguim_v2 penguim = new Penguim_v2();
        Minhoca_v2 minhoca = new Minhoca_v2();

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
