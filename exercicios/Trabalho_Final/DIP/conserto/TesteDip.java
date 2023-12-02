package DIP.conserto;

public class TesteDip {
    public static void main(String[] args) {
        Medico_v2 medico = new Medico_v2("Dr. Smith");

        PacienteSemPlano pacienteSemPlano = new PacienteSemPlano("João", 200.0, false);
        System.out.println("Informações do Paciente Sem Plano:");
        pacienteSemPlano.realizarConsulta();
        pacienteSemPlano.realizarCirurgiaSemPlano(medico);

        System.out.println("-----");

        Paciente_v2 pacienteComPlano = new Paciente_v2("Maria", 150.0, true);
        System.out.println("Informações do Paciente Com Plano:");
        pacienteComPlano.realizarConsulta();
        pacienteComPlano.realizarCirurgiaComPlano(medico);
    }
}
