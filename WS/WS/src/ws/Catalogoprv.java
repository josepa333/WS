package ws;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Catalogoprv.findAll", query = "select o from Catalogoprv o") })
@IdClass(CatalogoprvPK.class)
public class Catalogoprv implements Serializable {
    private static final long serialVersionUID = 1075005275263559865L;
    @Column(nullable = false)
    private Long cantidad;
    @Column(nullable = false)
    private Integer costoporunidad;
    @Column(nullable = false, length = 50)
    private String descripcion;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprimaprv;
    @Column(nullable = false)
    private Integer tiempoentrega;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDPROVEEDOR")
    private Proveedor proveedor;
    @OneToMany(mappedBy = "catalogoprv1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Catalogoprvsys> catalogoprvsysList1;
    @ManyToOne
    @JoinColumn(name = "IDUNIDADMEDIDA")
    private Unidadmedida unidadmedida6;

    public Catalogoprv() {
    }

    public Catalogoprv(Long cantidad, Integer costoporunidad, String descripcion, Integer idmateriaprimaprv,
                       Proveedor proveedor, Unidadmedida unidadmedida6, Integer tiempoentrega) {
        this.cantidad = cantidad;
        this.costoporunidad = costoporunidad;
        this.descripcion = descripcion;
        this.idmateriaprimaprv = idmateriaprimaprv;
        this.proveedor = proveedor;
        this.unidadmedida6 = unidadmedida6;
        this.tiempoentrega = tiempoentrega;
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


    public Integer getTiempoentrega() {
        return tiempoentrega;
    }

    public void setTiempoentrega(Integer tiempoentrega) {
        this.tiempoentrega = tiempoentrega;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Catalogoprvsys> getCatalogoprvsysList1() {
        return catalogoprvsysList1;
    }

    public void setCatalogoprvsysList1(List<Catalogoprvsys> catalogoprvsysList1) {
        this.catalogoprvsysList1 = catalogoprvsysList1;
    }

    public Catalogoprvsys addCatalogoprvsys(Catalogoprvsys catalogoprvsys) {
        getCatalogoprvsysList1().add(catalogoprvsys);
        catalogoprvsys.setCatalogoprv1(this);
        return catalogoprvsys;
    }

    public Catalogoprvsys removeCatalogoprvsys(Catalogoprvsys catalogoprvsys) {
        getCatalogoprvsysList1().remove(catalogoprvsys);
        catalogoprvsys.setCatalogoprv1(null);
        return catalogoprvsys;
    }

    public Unidadmedida getUnidadmedida6() {
        return unidadmedida6;
    }

    public void setUnidadmedida6(Unidadmedida unidadmedida6) {
        this.unidadmedida6 = unidadmedida6;
    }
}
