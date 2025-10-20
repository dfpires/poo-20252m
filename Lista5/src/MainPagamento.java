import exe2.CartaoCredito;
import exe2.Pagamento;
import exe2.Pix;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPagamento {
    public static void main(String[] args) {

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento pix1 = new Pix();
        Pagamento pix2 = new Pix();
        Pagamento cartaoCredito1 = new CartaoCredito();

        pagamentos.add(cartaoCredito);
        pagamentos.add(pix1);
        pagamentos.add(pix2);
        pagamentos.add(cartaoCredito1);

        Scanner sc = new Scanner(System.in);
        for(Pagamento p : pagamentos) {
            System.out.println("Informe valor da autorização");
            p.autorizar(sc.nextDouble()); // polimorfismo
        }
    }
}
