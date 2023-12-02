package DIP.violacao;

public class Medico {
    private Cirurgia cirurgia;
    private String nome;

    public Medico(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void cirurgiaComPlano(String nomePaciente, double valor){
        System.out.println("Cirurgia (com plano) realizada para o paciente: " + nomePaciente);
        System.out.println("Valor: " + valor);
    }

    public void cirurgiaSemPlano(String nomePaciente){
        System.out.println("Cirurgia (sem plano) realizada para o paciente: " + nomePaciente);
    }
}
