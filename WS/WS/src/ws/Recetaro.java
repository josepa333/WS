package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Recetaro.findAll", query = "select o from Recetaro o") })
@IdClass(RecetaroPK.class)
public class Recetaro implements Serializable {
    private static final long serialVersionUID = 1183406656279223249L;
    private Long cantidad;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprima;
    @Id
    @Column(nullable = false)
    private Integer idprenda;
    @Id
    @Column(nullable = false)
    private Integer idtalla;
    private Object materiaprima;
    private Object prenda;
    private Object talla;
    private Object unidadmedida;

    public Recetaro() {
    }

    public Recetaro(Long cantidad, Integer idmateriaprima, Integer idprenda, Integer idtalla, Object materiaprima,
                    Object prenda, Object talla, Object unidadmedida) {
        this.cantidad = cantidad;
        this.idmateriaprima = idmateriaprima;
        this.idprenda = idprenda;
        this.idtalla = idtalla;
        this.materiaprima = materiaprima;
        this.prenda = prenda;
        this.talla = talla;
        this.unidadmedida = unidadmedida;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdmateriaprima() {
        return idmateriaprima;
    }

    public void setIdmateriaprima(Integer idmateriaprima) {
        this.idmateriaprima = idmateriaprima;
    }

    public Integer getIdprenda() {
        return idprenda;
    }

    public void setIdprenda(Integer idprenda) {
        this.idprenda = idprenda;
    }

    public Integer getIdtalla() {
        return idtalla;
    }

    public void setIdtalla(Integer idtalla) {
        this.idtalla = idtalla;
    }

    public Object getMateriaprima() {
        return materiaprima;
    }

    public void setMateriaprima(Object materiaprima) {
        this.materiaprima = materiaprima;
    }

    public Object getPrenda() {
        return prenda;
    }

    public void setPrenda(Object prenda) {
        this.prenda = prenda;
    }

    public Object getTalla() {
        return talla;
    }

    public void setTalla(Object talla) {
        this.talla = talla;
    }

    public Object getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(Object unidadmedida) {
        this.unidadmedida = unidadmedida;
    }
}
