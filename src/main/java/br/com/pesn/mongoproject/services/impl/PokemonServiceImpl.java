package br.com.pesn.mongoproject.services.impl;

import br.com.pesn.mongoproject.models.Pokemon;
import br.com.pesn.mongoproject.repositories.PokemonRepository;
import br.com.pesn.mongoproject.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonRepository repository;

    @Override
    public ResponseEntity<List<Pokemon>> getAllPokemons() {
        return new ResponseEntity<List<Pokemon>>(repository.findAll(), HttpStatus.OK) ;
    }

    @Override
    public ResponseEntity<Pokemon> getPokemonByNumber(Integer number) {
        return new ResponseEntity<Pokemon>(repository.findByNumber(number), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Pokemon> insertNewPokemon(Pokemon pkm) {
        return new ResponseEntity<Pokemon>(repository.save(pkm), HttpStatus.OK);
    }
}
