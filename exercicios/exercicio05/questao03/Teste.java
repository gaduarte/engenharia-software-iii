package questao03;
import java.io.IOException;

public class Teste {
    public static void main(String[] args) {
        testarPersistencia();
        testarPersistenciaJson();
    }

    public static void testarPersistencia() {
        try {
            String dados = "Dados de teste";
            String arquivo = "arquivo.txt";

            Persistencia persistencia = new Persistencia(dados, arquivo);
            persistencia.salvar(dados, arquivo);

            System.out.println("Persistencia: Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    public static void testarPersistenciaJson() {
        try {
            String dadosJson = "{\"chave\":\"valor\"}";
            String arquivoJson = "arquivo.json";

            PersistenciaJson persistenciaJson = new PersistenciaJson(dadosJson, arquivoJson);
            persistenciaJson.salvar(dadosJson, arquivoJson);

            System.out.println("PersistenciaJson: Dados JSON salvos com sucesso.");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Erro ao salvar dados JSON: " + e.getMessage());
        }
    }
}
