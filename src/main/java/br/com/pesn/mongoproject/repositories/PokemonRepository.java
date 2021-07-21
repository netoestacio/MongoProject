package br.com.pesn.mongoproject.repositories;

import br.com.pesn.mongoproject.models.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, Integer> {
    Pokemon findByNumber(Integer number);
}
