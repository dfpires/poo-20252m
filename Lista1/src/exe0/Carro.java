package exe0;

public class Carro {
    // variáveis
    public int ano;
    public float velocidade;
    public boolean motor; // true ou false
    public String marca, modelo;

    // métodos construtores
    public Carro(){

    }
    public Carro(String ma, String mo, int an, boolean mt, float ve){
        this.marca = ma;
        this.modelo = mo;
        this.ano = an;
        this.motor = mt;
        this.velocidade = ve;
    }
    // métodos de instância
    public void exibe(){
        // this representa o objeto que chama o método
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo +
                "\nAno: " + this.ano + "\nMotor: " + this.motor +
                "\nVelocidade: " + this.velocidade);
    }
    public void desligar(){
        if (this.motor){
            this.motor = false;
            this.velocidade = 0;
        }
    }
    public void ligar(){
        if (!this.motor){
            this.motor = true;
        }
    }
    public void acelerar(float x){
        if (this.motor){
            this.velocidade += x;
        }
    }
    public void frear(float x){
        if (this.motor){
            if (this.velocidade - x >= 0){
                this.velocidade -= x;
            }
        }
    }
}
