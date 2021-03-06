package model;
// Generated 18/11/2018 08:20:16 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tema generated by hbm2java
 */
public class Tema  implements java.io.Serializable {


     private Integer id;
     private String nombreTema;
     private Set intercambios = new HashSet(0);

    public Tema() {
    }

    public Tema(String nombreTema, Set intercambios) {
       this.nombreTema = nombreTema;
       this.intercambios = intercambios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombreTema() {
        return this.nombreTema;
    }
    
    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }
    public Set getIntercambios() {
        return this.intercambios;
    }
    
    public void setIntercambios(Set intercambios) {
        this.intercambios = intercambios;
    }




}


