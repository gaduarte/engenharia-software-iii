package DIP.conserto;

public class PacienteSemPlano implements CirurgiaSemPlano, Consulta {
    private String nome;
    private double valor;
    private boolean comPlano;

    public PacienteSemPlano(String nome, double valor, boolean comPlano) {
        this.nome = nome;
        this.valor = valor;
        this.comPlano = comPlano;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean temPlano() {
        return comPlano;
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Consulta realizada para o paciente " + nome);
        if (comPlano) {
            System.out.println("Valor: " + valor);
        }
    }

    @Override
    public void realizarCirurgiaSemPlano(Medico_v2 medico){
        System.out.println("Cirurgia (sem plano) realizada para o paciente " + nome + " pelo médico " + medico.getNome());
    }
}
