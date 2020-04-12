package it.gl.sbmongodb.mongocrudops.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import it.gl.sbmongodb.mongocrudops.model.Impiegato;

public interface ImpiegatoService {

  /**
   * Method to create new employees in the db using mongo-db repository.
   * 
   * @param emp
   */
  public void createImpiegato(List<Impiegato> imp);

  /**
   * Method to fetch all employees from the db using mongo-db repository.
   * 
   * @return
   */
  public Collection<Impiegato> getAllImpiegati();

  /**
   * Method to fetch employee by id using mongo-db repository.
   * 
   * @param id
   * @return
   */
  public Optional<Impiegato> findImpiegatoById(int id);

  /**
   * Method to delete employee by id using mongo-db repository.
   * 
   * @param id
   */
  public void deleteImpiegatoById(int id);

  /**
   * Method to update employee by id using mongo-db repository.
   * 
   * @param id
   */
  public void updateImpiegato(Impiegato imp);

  /**
   * Method to delete all employees using mongo-db repository.
   */
  public void deleteAllImpiegati();
}
