package br.edu.fatecfranca.ExemploAPI.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
// classe vai responder pelas requisições /mensagem
public class ExemploController {

    List<Produto> produtos = new ArrayList<Produto>();

    // verbo GET
    @GetMapping
    public List<Produto> consulta(){
        return produtos;
    }

    // verbo GET
    @GetMapping("/{id}")
    public Produto consultaPersonalizada(@PathVariable int id){
        for (Produto produto: produtos){
            if (produto.getId() ==  id){
                return produto;
            }
        }
        // não encontrou
        return null;
    }

    // verbo POST
    @PostMapping
    public Produto insere(@RequestBody Produto produto){
            produtos.add(produto);
            return produto;
    }
    // verbo DELETE
    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable int id){
        for (Produto produto: produtos){
            if (produto.getId() == id){
                return produtos.remove(produto);
            }
        }
        // não encontrou
        return false;
    }

}
