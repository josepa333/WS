package ws;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Ordencompraro.findAll", query = "select o from Ordencompraro o") })
public class Ordencompraro implements Serializable {
    private static final long serialVersionUID = 1217336232993301893L;
    @Column(length = 15)
    private String estado;
    private Object faltantes;
    @Temporal(TemporalType.DATE)
    private Date fchemitida;
    @Id
    @Column(nullable = false)
    private Integer idordencompra;
    private Object lineasordencompra;
    private Object proveedor;

    public Ordencompraro() {
    }

    public Ordencompraro(String estado, Object faltantes, Date fchemitida, Integer idordencompra,
                         Object lineasordencompra, Object proveedor) {
        this.estado = estado;
        this.faltantes = faltantes;
        this.fchemitida = fchemitida;
        this.idordencompra = idordencompra;
        this.lineasordencompra = lineasordencompra;
        this.proveedor = proveedor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Object getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(Object faltantes) {
        this.faltantes = faltantes;
    }

    public Date getFchemitida() {
        return fchemitida;
    }

    public void setFchemitida(Date fchemitida) {
        this.fchemitida = fchemitida;
    }

    public Integer getIdordencompra() {
        return idordencompra;
    }

    public void setIdordencompra(Integer idordencompra) {
        this.idordencompra = idordencompra;
    }

    public Object getLineasordencompra() {
        return lineasordencompra;
    }

    public void setLineasordencompra(Object lineasordencompra) {
        this.lineasordencompra = lineasordencompra;
    }

    public Object getProveedor() {
        return proveedor;
    }

    public void setProveedor(Object proveedor) {
        this.proveedor = proveedor;
    }
}
