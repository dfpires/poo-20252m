import exe3.CarroEletrico;
import exe3.Eletrico;
import exe3.PatineteEletrico;
import exe3.Veiculo;

import java.util.ArrayList;

public class MainVeiculo {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        CarroEletrico ce = new CarroEletrico("Tesla");
        PatineteEletrico pe = new PatineteEletrico("PatElet");

        veiculos.add(ce);
        veiculos.add(pe);

        for (Veiculo v : veiculos) {
            v.mover();
            if (v instanceof Eletrico) {
                Eletrico el = (Eletrico) v; // cast para tipo primitivo - coerção para objeto
                el.carregarBateria();
            }
        }
    }
}
