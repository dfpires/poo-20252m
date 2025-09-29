package prova;

import java.util.ArrayList;
import java.util.List;
public class Exposicao {
    private String nome;
    private List<ObraArte> obras;
    public Exposicao(){
        obras = new ArrayList<ObraArte>();
    }
    public Exposicao(String nome){
        this.nome = nome;
        this.obras = new ArrayList<ObraArte>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addObra(ObraArte obra){
        obras.add(obra);
    }
    public void removeObra(String titulo){
        for(ObraArte obra : this.obras){
            if(obra.getTitulo().equals(titulo)){
                obras.remove(obra);
                return;
            }
        }
        System.out.println("Obra nao encontrada");
    }

    public String toString(){
        return "Exposição: " + this.nome + this.obras.toString();
    }
    public String resumo(){
        return "Nome " + this.nome + "qtde de obras " + this.obras.size();
    }
}
