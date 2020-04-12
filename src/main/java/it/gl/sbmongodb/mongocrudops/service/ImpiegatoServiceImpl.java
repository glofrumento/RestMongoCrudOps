package it.gl.sbmongodb.mongocrudops.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gl.sbmongodb.mongocrudops.dao.ImpiegatoDAO;
import it.gl.sbmongodb.mongocrudops.model.Impiegato;

@Service
public class ImpiegatoServiceImpl implements ImpiegatoService {

  // The dao repository will use the Mongodb-Repository to perform the database
  // operations.
  @Autowired
  ImpiegatoDAO dao;

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.assignment.springboot.mongo.service.Employeeservice#createEmployee(java.
   * util.List)
   */
  @Override
  public void createImpiegato(List<Impiegato> imp) {
    dao.saveAll(imp);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.assignment.springboot.mongo.service.Employeeservice#getAllEmployees()
   */
  @Override
  public Collection<Impiegato> getAllImpiegati() {
    return dao.findAll();
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.assignment.springboot.mongo.service.Employeeservice#findEmployeeById(int)
   */
  @Override
  public Optional<Impiegato> findImpiegatoById(int id) {
    return dao.findById(id);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.assignment.springboot.mongo.service.Employeeservice#deleteEmployeeById(
   * int)
   */
  @Override
  public void deleteImpiegatoById(int id) {
    dao.deleteById(id);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.assignment.springboot.mongo.service.Employeeservice#updateEmployee(int)
   */
  @Override
  public void updateImpiegato(Impiegato emp) {
    dao.save(emp);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.assignment.springboot.mongo.service.Employeeservice#deleteAllEmployees()
   */
  @Override
  public void deleteAllImpiegati() {
    dao.deleteAll();
  }
  
}
