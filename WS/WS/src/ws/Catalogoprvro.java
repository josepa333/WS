package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Catalogoprvro.findAll", query = "select o from Catalogoprvro o") })
@IdClass(CatalogoprvroPK.class)
public class Catalogoprvro implements Serializable {
    private static final long serialVersionUID = -8522863066011071249L;
    private Long cantidad;
    private Integer costoporunidad;
    @Column(length = 50)
    private String descripcion;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprimaprv;
    @Id
    @Column(nullable = false)
    private Integer idproveedor;
    private Object proveedor;
    private Integer tiempoentrega;
    private Object unidadmedida;

    public Catalogoprvro() {
    }

    public Catalogoprvro(Long cantidad, Integer costoporunidad, String descripcion, Integer idmateriaprimaprv,
                         Integer idproveedor, Object proveedor, Integer tiempoentrega, Object unidadmedida) {
        this.cantidad = cantidad;
        this.costoporunidad = costoporunidad;
        this.descripcion = descripcion;
        this.idmateriaprimaprv = idmateriaprimaprv;
        this.idproveedor = idproveedor;
        this.proveedor = proveedor;
        this.tiempoentrega = tiempoentrega;
        this.unidadmedida = unidadmedida;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCostoporunidad() {
        return costoporunidad;
    }

    public void setCostoporunidad(Integer costoporunidad) {
        this.costoporunidad = costoporunidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdmateriaprimaprv() {
        return idmateriaprimaprv;
    }

    public void setIdmateriaprimaprv(Integer idmateriaprimaprv) {
        this.idmateriaprimaprv = idmateriaprimaprv;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Object getProveedor() {
        return proveedor;
    }

    public void setProveedor(Object proveedor) {
        this.proveedor = proveedor;
    }

    public Integer getTiempoentrega() {
        return tiempoentrega;
    }

    public void setTiempoentrega(Integer tiempoentrega) {
        this.tiempoentrega = tiempoentrega;
    }

    public Object getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(Object unidadmedida) {
        this.unidadmedida = unidadmedida;
    }
}
