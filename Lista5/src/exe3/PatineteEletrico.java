package exe3;

public class PatineteEletrico extends Veiculo implements Eletrico{

    public PatineteEletrico(String modelo){
        super(modelo);
    }
    @Override
    public void carregarBateria() {
        System.out.println("Carregando Bateria do patinete elétrico");
    }

    @Override
    public void mover() {
        System.out.println("Movendo patinete elétrico");
    }
}
