package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Usuario.findAll", query = "select o from Usuario o") })
public class Usuario implements Serializable {
    private static final long serialVersionUID = -5118109049982513406L;
    @Column(nullable = false, length = 60)
    private String correo;
    @Id
    @Column(nullable = false)
    private Integer idusuario;
    @Column(nullable = false, length = 60)
    private String nombre;
    @Column(nullable = false, length = 60)
    private String telefono;

    public Usuario() {
    }

    public Usuario(String correo, Integer idusuario, String nombre, String telefono) {
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
