package br.com.pesn.mongoproject.repositories;

import br.com.pesn.mongoproject.models.Arquivo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquivoRepository extends MongoRepository<Arquivo, String> {
}
