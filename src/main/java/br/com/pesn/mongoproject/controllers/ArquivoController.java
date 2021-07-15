package br.com.pesn.mongoproject.controllers;

import br.com.pesn.mongoproject.models.Arquivo;
import br.com.pesn.mongoproject.services.ArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/arquivo")
public class ArquivoController {

    @Autowired
    private ArquivoService service;

    @PostMapping("/")
    public void salvarArquivo(@RequestParam("nome") String nome, @RequestParam("conteudo") String conteudo) {
        service.salvar(nome, conteudo);
    }

    @GetMapping("/listar")
    public List<Arquivo> listarArquivos() {
        return service.findAll();
    }

    @GetMapping("/count")
    public Long contageArquivos(){
        return service.count();
    }

    @GetMapping("/buscar")
    public Arquivo buscarArquivo(@RequestParam("id") String id){
        return service.findById(id);
    }

    @DeleteMapping("/deletar")
    public void deletar(@RequestParam("id") String id) {
        service.delete(id);
    }

}
