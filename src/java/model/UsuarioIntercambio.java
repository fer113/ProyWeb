package model;
// Generated 18/11/2018 08:20:16 AM by Hibernate Tools 4.3.1



/**
 * UsuarioIntercambio generated by hbm2java
 */
public class UsuarioIntercambio  implements java.io.Serializable {


     private Integer idUsuarioIntercambio;
     private Intercambio intercambio;
     private Usuario usuario;
     private Boolean estadoAceptacion;
     private String idIntercambiar;
     private Boolean creadorIntercambio;

    public UsuarioIntercambio() {
    }

    public UsuarioIntercambio(Intercambio intercambio, Usuario usuario, Boolean estadoAceptacion, String idIntercambiar, Boolean creadorIntercambio) {
       this.intercambio = intercambio;
       this.usuario = usuario;
       this.estadoAceptacion = estadoAceptacion;
       this.idIntercambiar = idIntercambiar;
       this.creadorIntercambio = creadorIntercambio;
    }
   
    public Integer getIdUsuarioIntercambio() {
        return this.idUsuarioIntercambio;
    }
    
    public void setIdUsuarioIntercambio(Integer idUsuarioIntercambio) {
        this.idUsuarioIntercambio = idUsuarioIntercambio;
    }
    public Intercambio getIntercambio() {
        return this.intercambio;
    }
    
    public void setIntercambio(Intercambio intercambio) {
        this.intercambio = intercambio;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Boolean getEstadoAceptacion() {
        return this.estadoAceptacion;
    }
    
    public void setEstadoAceptacion(Boolean estadoAceptacion) {
        this.estadoAceptacion = estadoAceptacion;
    }
    public String getIdIntercambiar() {
        return this.idIntercambiar;
    }
    
    public void setIdIntercambiar(String idIntercambiar) {
        this.idIntercambiar = idIntercambiar;
    }
    public Boolean getCreadorIntercambio() {
        return this.creadorIntercambio;
    }
    
    public void setCreadorIntercambio(Boolean creadorIntercambio) {
        this.creadorIntercambio = creadorIntercambio;
    }




}


