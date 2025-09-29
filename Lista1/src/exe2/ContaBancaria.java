package exe2;
public class ContaBancaria {
    public String titular, numero;
    public double saldo;
    public boolean ativa;

    public ContaBancaria(){
    }
    public ContaBancaria(String titular, String numero, double saldo, boolean ativa){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
    }
    public void exibe(){
        // 12345-7
        System.out.println("Titular: " + titular +
                "\nNumero: " + numero.substring(4) + "\nSaldo: " + saldo +
                "\nAtiva: " + ativa);
    }
    public void ativar(){
        if (!this.ativa){
            this.ativa = true;
        }
    }
    public void desativar(){
        if (this.ativa && this.saldo >= 0){
            this.ativa = false;
        }
    }
    public void depositar(double valor){
        if (valor > 0 && this.ativa){
            this.saldo += valor;
            System.out.println("Depósito realizado");
        }
        else System.out.println("Depósito falhou");
    }
    public boolean sacar(double valor){
        if (valor > 0 && this.ativa && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado");
            return true;
        }
        else {
            System.out.println("Saque falhou");
            return false;
        }
    }
    public void transferir(ContaBancaria destino, double valor){
        if (destino.ativa) {
            // tira da conta que chamou o método
            if (this.sacar(valor)) {
                destino.depositar(valor); // insere na conta destino
            }
        }
    }
}
