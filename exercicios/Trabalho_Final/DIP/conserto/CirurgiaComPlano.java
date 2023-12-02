package DIP.conserto;

public interface CirurgiaComPlano {
    void realizarCirurgiaComPlano(Medico_v2 medico);
    boolean temPlano();
    double getValor();
}


