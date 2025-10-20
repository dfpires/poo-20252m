package exe3;

public class CarroEletrico extends Veiculo implements Eletrico {

    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carro elétrico carregando bateria...");
    }

    @Override
    public void mover() {
        System.out.println("Movendo carro elétrico...");
    }
}
