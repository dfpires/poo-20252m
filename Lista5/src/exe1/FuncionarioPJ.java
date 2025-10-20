package exe1;
public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(){
        super();
    }
    public FuncionarioPJ(String nome, double salario){
        super(nome, salario);
    }
    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }

}
