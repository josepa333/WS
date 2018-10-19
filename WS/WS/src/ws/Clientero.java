package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Clientero.findAll", query = "select o from Clientero o") })
public class Clientero implements Serializable {
    private static final long serialVersionUID = 1993663044705256412L;
    @Column(length = 15)
    private String cedula;
    @Column(length = 60)
    private String correo;
    @Column(length = 60)
    private String direccioncobro;
    @Column(length = 60)
    private String direccionexacta;
    @Id
    @Column(nullable = false)
    private Long idcliente;
    @Column(length = 20)
    private String nombre;
    private Object pais;
    @Column(length = 20)
    private String primerapellido;
    @Column(length = 20)
    private String segundoapellido;
    private Object solicitudes;
    @Column(length = 10)
    private String telefono;

    public Clientero() {
    }

    public Clientero(String cedula, String correo, String direccioncobro, String direccionexacta, Long idcliente,
                     String nombre, Object pais, String primerapellido, String segundoapellido, Object solicitudes,
                     String telefono) {
        this.cedula = cedula;
        this.correo = correo;
        this.direccioncobro = direccioncobro;
        this.direccionexacta = direccionexacta;
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.pais = pais;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.solicitudes = solicitudes;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccioncobro() {
        return direccioncobro;
    }

    public void setDireccioncobro(String direccioncobro) {
        this.direccioncobro = direccioncobro;
    }

    public String getDireccionexacta() {
        return direccionexacta;
    }

    public void setDireccionexacta(String direccionexacta) {
        this.direccionexacta = direccionexacta;
    }

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getPais() {
        return pais;
    }

    public void setPais(Object pais) {
        this.pais = pais;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public Object getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Object solicitudes) {
        this.solicitudes = solicitudes;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
