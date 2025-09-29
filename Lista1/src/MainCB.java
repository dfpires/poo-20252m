import exe2.ContaBancaria;

import java.util.Scanner;

public class MainCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // cria objeto com construtor vazio
        ContaBancaria conta1 = new ContaBancaria();
        // cria objeto com construtor completo
        ContaBancaria conta2 = new ContaBancaria("Lázaro", "12345-6", 0, true);

        conta2.desativar();
        conta2.ativar();
        conta2.depositar(1000);
        conta2.sacar(600);

        ContaBancaria conta3 = new ContaBancaria("João", "123-4", 0, true);


        System.out.println("Digite valor da transferência: ");
        double x = sc.nextDouble();
        conta2.transferir(conta3, x);

    }
}
