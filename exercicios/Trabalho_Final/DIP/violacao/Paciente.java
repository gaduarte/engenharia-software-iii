package DIP.violacao;
// O código fornecido viola o Princípio da Inversão de Dependência (DIP) porque as classes Medico e Paciente dependem diretamente das implementações concretas Cirurgia, Consulta_Com_Plano e Consulta_sem_Plano e Cirurgia. Isso cria um acoplamento forte entre essas classes e suas dependências, o que torna difícil a extensão e a manutenção do código.

public class Paciente {
    private Consulta_Com_Plano consulta_Com_Plano;
    private Consulta_sem_Plano consulta_sem_Plano;
    private Cirurgia cirurgia;
    private String nome;
    private double valor;
    private String nomeConsulta;
    private boolean comPlano;

    public Paciente(String nome, double valor, String nomeConsulta, boolean comPlano){
        this.nome = nome;
        this.valor = valor;
        this.nomeConsulta = nomeConsulta;
        this.comPlano = comPlano;
    }

    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }

    public String getNomeConsulta(){
        return nomeConsulta;
    }

    public boolean getPlano(){
        return comPlano;
    }

    public void cirurgia(Medico medico){
        if (comPlano) {
            medico.cirurgiaComPlano(nome, valor);
        } else {
            medico.cirurgiaSemPlano(nome);
        }
    }
}