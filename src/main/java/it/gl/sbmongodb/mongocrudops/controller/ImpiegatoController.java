package it.gl.sbmongodb.mongocrudops.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.gl.sbmongodb.mongocrudops.model.Impiegato;
import it.gl.sbmongodb.mongocrudops.service.ImpiegatoService;

@RestController
@RequestMapping(value = "/v1")
public class ImpiegatoController {

  @GetMapping(value = "/hello")
  public String getHello() {
    return "hello";
  }

  @Autowired
  ImpiegatoService serv;

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  /**
   * Method to save employees in the db.
   * 
   * @param emp
   * @return
   */
  // curl -X POST localhost:8083/mdbcrud/v1/crea -H "Content-Type: application/json" -d "[{\"id\":\"10\",\"nome\":\"Mario\",\"funzione\":\"Impiegato\"}]"
  // curl -X POST localhost:8083/mdbcrud/v1/crea -H "Content-Type: application/json" -d "[{\"id\":\"30\",\"nome\":\"Luca\",\"funzione\":\"Impiegato\"},{\"id\":\"60\",\"nome\":\"Pino\",\"funzione\":\"Portiere\"}]"
  @PostMapping(value = "/crea")
  public String create(@RequestBody List<Impiegato> imp) {
    logger.debug("Salvataggio impiegato.");
    serv.createImpiegato(imp);
    return "Impiegato salvato.";
  }

  /**
   * Method to fetch all employees from the db.
   * 
   * @return
   */
  // curl localhost:8083/mdbcrud/v1/getTutti | jq
  @GetMapping(value = "/getTutti")
  public Collection<Impiegato> getAll() {
    logger.debug("Getting all employees.");
    return serv.getAllImpiegati();
  }

  /**
   * Method to fetch employee by id.
   * 
   * @param id
   * @return
   */
  // curl localhost:8083/mdbcrud/v1/getbyid/10 | jq
  @GetMapping(value = "/getbyid/{employee-id}")
  public Optional<Impiegato> getById(@PathVariable(value = "employee-id") int id) {
    logger.debug("Info sull'impiegato con id = {}.", id);
    return serv.findImpiegatoById(id);
  }

  /**
   * Method to update employee by id.
   * 
   * @param id
   * @param e
   * @return
   */
  // curl -X PUT localhost:8083/mdbcrud/v1/update/10 -H "Content-Type: application/json" -d "{\"id\":\"10\",\"nome\":\"Giorgetto\",\"funzione\":\"Impiegato\"}"
  @PutMapping(value = "/update/{employee-id}")
  public String update(@PathVariable(value = "employee-id") int id, @RequestBody Impiegato imp) {
    logger.debug("Aggiornamento info impiegato con id = {}.", id);
    imp.setId(id);
    serv.updateImpiegato(imp);
    return "Info impiegto con id = " + id + " aggiornate.";
  }

  /**
   * Method to delete employee by id.
   * 
   * @param id
   * @return
   */
  // curl -X DELETE localhost:8083/mdbcrud/v1/delete/10 
  @DeleteMapping(value = "/delete/{employee-id}")
  public String delete(@PathVariable(value = "employee-id") int id) {
    logger.debug("Deleting employee with employee-id= {}.", id);
    serv.deleteImpiegatoById(id);
    return "Info sull'impiegato con id= " + id + " cancellate.";
  }

  /**
   * Method to delete all employees from the db.
   * 
   * @return
   */
  @DeleteMapping(value = "/deleteTutti")
  public String deleteAll() {
    logger.debug("Cancellazione di tutti gli impiegati.");
    serv.deleteAllImpiegati();
    return "Tutti gli impiegati cancellati.";
  }
}
