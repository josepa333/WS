package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Usuarioro.findAll", query = "select o from Usuarioro o") })
public class Usuarioro implements Serializable {
    private static final long serialVersionUID = 5535188748742591607L;
    @Column(length = 60)
    private String correo;
    @Id
    @Column(nullable = false)
    private Integer idusuario;
    @Column(length = 60)
    private String nombre;
    @Column(length = 60)
    private String telefono;

    public Usuarioro() {
    }

    public Usuarioro(String correo, Integer idusuario, String nombre, String telefono) {
        this.correo = correo;
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
