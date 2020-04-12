package it.gl.sbmongodb.mongocrudops.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Mongo database annotation.
@Document(collection= "impiegato")
public class Impiegato {

  @Id
  private int id;
  private String nome;
  private String funzione;
  
  public Impiegato() {
    super();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getFunzione() {
    return funzione;
  }

  public void setFunzione(String funzione) {
    this.funzione = funzione;
  }

  @Override
  public String toString() {
    return "Impiegato [id=" + id + ", nome=" + nome + ", funzione=" + funzione + "]";
  }
  
}
