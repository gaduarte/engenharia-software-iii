package questao12;

import java.util.ArrayList;
import java.util.List;

abstract class Relacionamento {
    enum TipoRelacionamento {
        INICIOU,
        ACEITOU,
        OUTRO
    }

    private TipoRelacionamento tipo;
    private Usuario iniciador;
    private Usuario aceitador;

    public Relacionamento(TipoRelacionamento tipo, Usuario iniciador, Usuario aceitador){
        this.tipo=tipo;
        this.iniciador=iniciador;
        this.aceitador=aceitador;
    }

    public TipoRelacionamento getTipo() {
            return tipo;
        }

    public Usuario getIniciador() {
            return iniciador;
        }

    public Usuario getAceitador() {
            return aceitador;
        }
}

class Usuario{
    private List<Relacionamento> relacionamentos;

    public Usuario(){
        relacionamentos = new ArrayList<>();
    }

    public void adicionarRelacionamento(Relacionamento relacionamento){
        relacionamentos.add(relacionamento);
    }
}
