package ws;

import java.io.Serializable;

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Ordencompra.findAll", query = "select o from Ordencompra o") })
public class Ordencompra implements Serializable {
    private static final long serialVersionUID = 9062432650852511130L;
    @Column(nullable = false, length = 15)
    private String estado;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fchemitida;
    @Id
    @Column(nullable = false)
    private Integer idordencompra;
    @OneToMany(mappedBy = "lineaordencompra", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Lineaordencompra> lineaordencompraList2;
    @ManyToOne
    @JoinColumn(name = "IDPROVEEDOR")
    private Proveedor proveedor2;
    @OneToMany(mappedBy = "lineaordencompra1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Faltantes> faltantesList3;

    public Ordencompra() {
    }

    public Ordencompra(String estado, Date fchemitida, Integer idordencompra, Proveedor proveedor2) {
        this.estado = estado;
        this.fchemitida = fchemitida;
        this.idordencompra = idordencompra;
        this.proveedor2 = proveedor2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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


    public List<Lineaordencompra> getLineaordencompraList2() {
        return lineaordencompraList2;
    }

    public void setLineaordencompraList2(List<Lineaordencompra> lineaordencompraList2) {
        this.lineaordencompraList2 = lineaordencompraList2;
    }

    public Lineaordencompra addLineaordencompra(Lineaordencompra lineaordencompra) {
        getLineaordencompraList2().add(lineaordencompra);
        lineaordencompra.setLineaordencompra(this);
        return lineaordencompra;
    }

    public Lineaordencompra removeLineaordencompra(Lineaordencompra lineaordencompra) {
        getLineaordencompraList2().remove(lineaordencompra);
        lineaordencompra.setLineaordencompra(null);
        return lineaordencompra;
    }

    public Proveedor getProveedor2() {
        return proveedor2;
    }

    public void setProveedor2(Proveedor proveedor2) {
        this.proveedor2 = proveedor2;
    }

    public List<Faltantes> getFaltantesList3() {
        return faltantesList3;
    }

    public void setFaltantesList3(List<Faltantes> faltantesList3) {
        this.faltantesList3 = faltantesList3;
    }

    public Faltantes addFaltantes(Faltantes faltantes) {
        getFaltantesList3().add(faltantes);
        faltantes.setLineaordencompra1(this);
        return faltantes;
    }

    public Faltantes removeFaltantes(Faltantes faltantes) {
        getFaltantesList3().remove(faltantes);
        faltantes.setLineaordencompra1(null);
        return faltantes;
    }
}
