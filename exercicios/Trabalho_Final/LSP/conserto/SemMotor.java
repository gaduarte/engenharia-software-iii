package LSP.conserto;

class SemMotor implements Motor {
    @Override
    public void start() {
        System.out.println("Não têm motor.");
    }
}

class SemTanque implements Tanque {
    @Override
    public void analisar() {
        System.out.println("Não têm tanque.");
    }
}
