package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Lineaordencompraro.findAll", query = "select o from Lineaordencompraro o") })
@IdClass(LineaordencompraroPK.class)
public class Lineaordencompraro implements Serializable {
    private static final long serialVersionUID = 502725345346099719L;
    private Long cantidadfaltantetotal;
    private Integer costounitario;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprima;
    @Id
    @Column(nullable = false)
    private Integer idordencompra;
    private Object materiaprima;
    private Object ordencompra;
    private Object unidadmedida;

    public Lineaordencompraro() {
    }

    public Lineaordencompraro(Long cantidadfaltantetotal, Integer costounitario, Integer idmateriaprima,
                              Integer idordencompra, Object materiaprima, Object ordencompra, Object unidadmedida) {
        this.cantidadfaltantetotal = cantidadfaltantetotal;
        this.costounitario = costounitario;
        this.idmateriaprima = idmateriaprima;
        this.idordencompra = idordencompra;
        this.materiaprima = materiaprima;
        this.ordencompra = ordencompra;
        this.unidadmedida = unidadmedida;
    }

    public Long getCantidadfaltantetotal() {
        return cantidadfaltantetotal;
    }

    public void setCantidadfaltantetotal(Long cantidadfaltantetotal) {
        this.cantidadfaltantetotal = cantidadfaltantetotal;
    }

    public Integer getCostounitario() {
        return costounitario;
    }

    public void setCostounitario(Integer costounitario) {
        this.costounitario = costounitario;
    }

    public Integer getIdmateriaprima() {
        return idmateriaprima;
    }

    public void setIdmateriaprima(Integer idmateriaprima) {
        this.idmateriaprima = idmateriaprima;
    }

    public Integer getIdordencompra() {
        return idordencompra;
    }

    public void setIdordencompra(Integer idordencompra) {
        this.idordencompra = idordencompra;
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

    public Object getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(Object unidadmedida) {
        this.unidadmedida = unidadmedida;
    }
}
