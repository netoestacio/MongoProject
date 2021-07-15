package br.com.pesn.mongoproject.services;

import br.com.pesn.mongoproject.models.Arquivo;
import br.com.pesn.mongoproject.repositories.ArquivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArquivoService {

    @Autowired
    private ArquivoRepository repository;

    public void salvar(String nome, String conteudo){
        repository.save(new Arquivo(nome, conteudo));
    }

    public List<Arquivo> findAll() {
        return repository.findAll();
    }

    public long count(){
        return repository.count();
    }

    public Arquivo findById(String id){
        return repository.findById(id).get();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

}
