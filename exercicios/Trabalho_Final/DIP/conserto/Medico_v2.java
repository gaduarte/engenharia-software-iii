package DIP.conserto;

public class Medico_v2 implements Cirurgia_v2 {
    private String nome;

    public Medico_v2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void realizarCirurgia(Paciente_v2 paciente) {
        System.out.println("Cirurgia realizada para o paciente " + paciente.getNome());
        if (paciente.temPlano()) {
            System.out.println("Valor: " + paciente.getValor());
        }
    }
}
