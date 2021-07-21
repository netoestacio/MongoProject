package br.com.pesn.mongoproject.services;

import br.com.pesn.mongoproject.models.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PokemonService {

     ResponseEntity<List<Pokemon>> getAllPokemons();
     ResponseEntity<Pokemon> getPokemonByNumber(Integer number);
     ResponseEntity<Pokemon> insertNewPokemon(Pokemon pkm);
}
