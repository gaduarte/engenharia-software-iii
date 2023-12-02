package DIP.violacao;

public class TesteConsulta {
    public static void main(String[] args) {
        Medico medico = new Medico("Dr. Silva");
        Paciente pacienteComPlano = new Paciente("Alice", 100.0, "Consulta de Rotina", true);
        Paciente pacienteSemPlano = new Paciente("Bob", 120.0, "Consulta de Urgência", false);

        // Realizar cirurgia com plano para o paciente com plano
        pacienteComPlano.cirurgia(medico);
        System.out.println();

        // Realizar cirurgia sem plano para o paciente sem plano
        pacienteSemPlano.cirurgia(medico);
        System.out.println();
        
        // Exibir informações do paciente com plano
        System.out.println("Informações do paciente com plano:");
        System.out.println("Nome: " + pacienteComPlano.getNome());
        System.out.println("Consulta: " + pacienteComPlano.getNomeConsulta());
        System.out.println("Valor da consulta: " + pacienteComPlano.getValor());
        System.out.println("Plano: " + (pacienteComPlano.getPlano() ? "Sim" : "Não"));
        System.out.println();

        // Exibir informações do paciente sem plano
        System.out.println("Informações do paciente sem plano:");
        System.out.println("Nome: " + pacienteSemPlano.getNome());
        System.out.println("Consulta: " + pacienteSemPlano.getNomeConsulta());
        System.out.println("Valor da consulta: " + pacienteSemPlano.getValor());
        System.out.println("Plano: " + (pacienteSemPlano.getPlano() ? "Sim" : "Não"));
    }
}

