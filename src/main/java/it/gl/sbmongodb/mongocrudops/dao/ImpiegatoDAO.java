package it.gl.sbmongodb.mongocrudops.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import it.gl.sbmongodb.mongocrudops.model.Impiegato;

@Repository
public interface ImpiegatoDAO extends MongoRepository <Impiegato, Integer> {

}
