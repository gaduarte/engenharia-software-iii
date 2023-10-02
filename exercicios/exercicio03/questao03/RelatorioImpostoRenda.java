package questao03;

public class RelatorioImpostoRenda {
    public void gerarRelatorio(ImpostoDeRenda impostodeRenda, double impostoDevido) {
        System.out.println("CPF: " + impostodeRenda.getCpf());
        System.out.println("Rendimentos: " + impostodeRenda.getRendimentos());
        System.out.println("Despesas: " + impostodeRenda.getDespesas());
        System.out.println("Imposto Devido: " + impostoDevido);
    }
}
