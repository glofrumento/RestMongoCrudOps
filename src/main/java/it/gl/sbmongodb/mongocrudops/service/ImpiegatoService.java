package it.gl.sbmongodb.mongocrudops.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import it.gl.sbmongodb.mongocrudops.model.Impiegato;

public interface ImpiegatoService {

  /**
   * Crea un nuovo Impiegao in Mongodb.
   * 
   * @param emp
   */
  public void createImpiegato(List<Impiegato> imp);

  /**
   * Carica tutti gli impiegati da Mongodb.
   * 
   * @return
   */
  public Collection<Impiegato> getAllImpiegati();

  /**
   * Carica un impiegato con id da mongodb.
   * 
   * @param id
   * @return
   */
  public Optional<Impiegato> findImpiegatoById(int id);

  /**
   * Cancella un impiegato con id da mongodb.
   * 
   * @param id
   */
  public void deleteImpiegatoById(int id);

  /**
   * Aggiorna un impiegato con id da mongodb.
   * 
   * @param id
   */
  public void updateImpiegato(Impiegato imp);

  /**
   * Method to delete all employees using mongo-db repository.
   */
  public void deleteAllImpiegati();
}
