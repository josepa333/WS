package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Faltantesro.findAll", query = "select o from Faltantesro o") })
@IdClass(FaltantesroPK.class)
public class Faltantesro implements Serializable {
    private static final long serialVersionUID = -3121162303291584843L;
    private Long cantidadfaltante;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprima;
    @Id
    @Column(nullable = false)
    private Long idordenproduccion;
    private Object materiaprima;
    private Object ordencompra;
    private Object ordenproduccion;
    private Object unidadmedida;

    public Faltantesro() {
    }

    public Faltantesro(Long cantidadfaltante, Integer idmateriaprima, Long idordenproduccion, Object materiaprima,
                       Object ordencompra, Object ordenproduccion, Object unidadmedida) {
        this.cantidadfaltante = cantidadfaltante;
        this.idmateriaprima = idmateriaprima;
        this.idordenproduccion = idordenproduccion;
        this.materiaprima = materiaprima;
        this.ordencompra = ordencompra;
        this.ordenproduccion = ordenproduccion;
        this.unidadmedida = unidadmedida;
    }

    public Long getCantidadfaltante() {
        return cantidadfaltante;
    }

    public void setCantidadfaltante(Long cantidadfaltante) {
        this.cantidadfaltante = cantidadfaltante;
    }

    public Integer getIdmateriaprima() {
        return idmateriaprima;
    }

    public void setIdmateriaprima(Integer idmateriaprima) {
        this.idmateriaprima = idmateriaprima;
    }

    public Long getIdordenproduccion() {
        return idordenproduccion;
    }

    public void setIdordenproduccion(Long idordenproduccion) {
        this.idordenproduccion = idordenproduccion;
    }

    public Object getMateriaprima() {
        return materiaprima;
    }

    public void setMateriaprima(Object materiaprima) {
        this.materiaprima = materiaprima;
    }

    public Object getOrdencompra() {
        return ordencompra;
    }

    public void setOrdencompra(Object ordencompra) {
        this.ordencompra = ordencompra;
    }

    public Object getOrdenproduccion() {
        return ordenproduccion;
    }

    public void setOrdenproduccion(Object ordenproduccion) {
        this.ordenproduccion = ordenproduccion;
    }

    public Object getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(Object unidadmedida) {
        this.unidadmedida = unidadmedida;
    }
}
