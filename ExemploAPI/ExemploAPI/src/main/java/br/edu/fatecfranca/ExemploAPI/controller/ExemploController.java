package br.edu.fatecfranca.ExemploAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
// classe vai responder pelas requisições /mensagem
public class ExemploController {

    // verbo GET
    @GetMapping
    public String consulta(){
        return "Este método faz um select no banco de dados";
    }

    // verbo GET
    @GetMapping("/{nome}/{sobrenome}")
    public String consultaPersonalizada(@PathVariable String nome, @PathVariable String sobrenome){
        return "Também faz select, mas agora com a cláusula where " + nome + " " +  sobrenome;
    }

    // verbo POST
    @PostMapping
    public String insere(){
        return "Este método faz um insert no banco de dados";
    }

}
