package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Prvextranjeroro.findAll", query = "select o from Prvextranjeroro o") })
public class Prvextranjeroro implements Serializable {
    private static final long serialVersionUID = -9112224387769325659L;
    private Integer cantidadminimapedido;
    @Column(length = 60)
    private String correo;
    @Column(length = 60)
    private String direccion;
    @Id
    @Column(nullable = false)
    private Integer idproveedor;
    @Column(length = 60)
    private String nombre;
    @Column(length = 20)
    private String nombredecontacto;
    @Column(length = 10)
    private String telefono;

    public Prvextranjeroro() {
    }

    public Prvextranjeroro(Integer cantidadminimapedido, String correo, String direccion, Integer idproveedor,
                           String nombre, String nombredecontacto, String telefono) {
        this.cantidadminimapedido = cantidadminimapedido;
        this.correo = correo;
        this.direccion = direccion;
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.nombredecontacto = nombredecontacto;
        this.telefono = telefono;
    }

    public Integer getCantidadminimapedido() {
        return cantidadminimapedido;
    }

    public void setCantidadminimapedido(Integer cantidadminimapedido) {
        this.cantidadminimapedido = cantidadminimapedido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombredecontacto() {
        return nombredecontacto;
    }

    public void setNombredecontacto(String nombredecontacto) {
        this.nombredecontacto = nombredecontacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
