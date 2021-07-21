package br.com.pesn.mongoproject.controllers;

import br.com.pesn.mongoproject.models.Pokemon;
import br.com.pesn.mongoproject.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAllPokemons(){
        return service.getAllPokemons();
    }

    @GetMapping(path = "number")
    public ResponseEntity<Pokemon> getByNumber(@RequestParam("number") Integer number){
        return service.getPokemonByNumber(number);
    }

    @PostMapping
    public ResponseEntity<Pokemon> insertPokemon(@RequestBody Pokemon pkm){
        return service.insertNewPokemon(pkm);
    }
}
