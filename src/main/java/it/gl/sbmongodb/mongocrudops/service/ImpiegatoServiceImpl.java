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

  @Autowired
  ImpiegatoDAO dao;

  @Override
  public void createImpiegato(List<Impiegato> imp) {
    dao.saveAll(imp);
  }

  @Override
  public Collection<Impiegato> getAllImpiegati() {
    return dao.findAll();
  }

  @Override
  public Optional<Impiegato> findImpiegatoById(int id) {
    return dao.findById(id);
  }

  @Override
  public void deleteImpiegatoById(int id) {
    dao.deleteById(id);
  }

  @Override
  public void updateImpiegato(Impiegato emp) {
    dao.save(emp);
  }

  @Override
  public void deleteAllImpiegati() {
    dao.deleteAll();
  }
  
}
