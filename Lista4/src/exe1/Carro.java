package exe1;

public class Carro extends Veiculo {
    private int nroPortas;

    public Carro(){
        super();
    }
    public Carro(String placa, String modelo, double valorBase, int nroPortas) {
        super(placa, modelo, valorBase);
        this.nroPortas = nroPortas;
    }

    public int getNroPortas() {
        return nroPortas;
    }
    public void setNroPortas(int nroPortas) {
        this.nroPortas = nroPortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                super.toString() +
                "nroPortas=" + nroPortas +
                '}';
    }

    @Override
    public double calcularImposto() {
        return this.valorBase * 0.03f;
    }
}
