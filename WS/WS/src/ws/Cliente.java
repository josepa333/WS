package ws;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Cliente.findAll", query = "select o from Cliente o") })
public class Cliente implements Serializable {
    private static final long serialVersionUID = 6475387696161731942L;
    @Column(nullable = false, length = 15)
    private String cedula;
    @Column(nullable = false, length = 60)
    private String correo;
    @Column(nullable = false, length = 60)
    private String direccioncobro;
    @Column(nullable = false, length = 60)
    private String direccionexacta;
    @Id
    @Column(nullable = false)
    private Long idcliente;
    @Column(nullable = false, length = 20)
    private String nombre;
    @Column(nullable = false, length = 20)
    private String primerapellido;
    @Column(nullable = false, length = 20)
    private String segundoapellido;
    @Column(nullable = false, length = 10)
    private String telefono;
    @OneToMany(mappedBy = "cliente", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Solicitud> bitacoralineasolicitudList;
    @ManyToOne
    @JoinColumn(name = "IDPAIS")
    private Pais pais;

    public Cliente() {
    }

    public Cliente(String cedula, String correo, String direccioncobro, String direccionexacta, Long idcliente,
                   Pais pais, String nombre, String primerapellido, String segundoapellido, String telefono) {
        this.cedula = cedula;
        this.correo = correo;
        this.direccioncobro = direccioncobro;
        this.direccionexacta = direccionexacta;
        this.idcliente = idcliente;
        this.pais = pais;
        this.nombre = nombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Solicitud> getBitacoralineasolicitudList() {
        return bitacoralineasolicitudList;
    }

    public void setBitacoralineasolicitudList(List<Solicitud> bitacoralineasolicitudList) {
        this.bitacoralineasolicitudList = bitacoralineasolicitudList;
    }

    public Solicitud addSolicitud(Solicitud solicitud) {
        getBitacoralineasolicitudList().add(solicitud);
        solicitud.setCliente(this);
        return solicitud;
    }

    public Solicitud removeSolicitud(Solicitud solicitud) {
        getBitacoralineasolicitudList().remove(solicitud);
        solicitud.setCliente(null);
        return solicitud;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
