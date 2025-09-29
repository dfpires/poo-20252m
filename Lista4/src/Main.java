import exe0.Assistente;
import exe0.Diretor;
import exe0.Funcionario;
import exe0.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void exibir(Funcionario funcionario) {
        // o objeto funcionario vai executar o método toString() de qual classe?
        // depende da classe que for passada como parâmetro quando da chamada
        // se for passado um assistente, executa toString() do Assistente
        // se for passado um gerente, executa toString() do Gerente
        // se for passado um diretor, executa toString() do Diretor
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args) {

        // fu1 vai ter um comportamento polimórfico
        Assistente as1 = new Assistente("Pedro", "Franca", "123.456.789-0", 2000, 3);
        exibir(as1);

        Gerente ge1 = new Gerente("Aline", "Franca", "5678", 4000, 1000);
        exibir(ge1);

        Diretor di1 = new Diretor("Carlos", "Franca", "8965", 5000, 1200);
        exibir(di1);

        // cria um vetor de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(as1);
        funcionarios.add(ge1);
        funcionarios.add(di1);
        // calcula folha de pagto
        // percorre o vetor e soma os salários
        double total = 0;
        for(Funcionario objFunc : funcionarios) { // objFunc vai iterar em funcionários
            total += objFunc.calculaSalario(); // objFunc é polimórfico
        }
        System.out.println("Total de salários " + total);
    }
}