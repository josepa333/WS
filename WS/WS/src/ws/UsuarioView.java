package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "UsuarioView.findAll", query = "select o from UsuarioView o") })
@Table(name = "USUARIO_VIEW")
public class UsuarioView implements Serializable {
    private static final long serialVersionUID = -6243880554748125855L;
    @Column(length = 60)
    private String correo;
    private Integer idusuario;
    @Column(length = 60)
    private String nombre;
    @Column(length = 60)
    private String telefono;

    public UsuarioView() {
    }

    public UsuarioView(String correo, Integer idusuario, String nombre, String telefono) {
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
