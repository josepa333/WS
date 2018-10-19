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
@NamedQueries({ @NamedQuery(name = "Catalogosys.findAll", query = "select o from Catalogosys o") })
public class Catalogosys implements Serializable {
    private static final long serialVersionUID = -4524968185306135451L;
    @Column(nullable = false)
    private Integer cantidadminima;
    @Column(nullable = false)
    private Integer costounitario;
    @Column(nullable = false, length = 50)
    private String descripcion;
    @Column(nullable = false)
    private Long existenciaactual;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprima;
    @OneToMany(mappedBy = "catalogosys", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Receta> recetaList;
    @ManyToOne
    @JoinColumn(name = "IDUNIDADMEDIDA")
    private Unidadmedida unidadmedida1;
    @OneToMany(mappedBy = "catalogosys1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Lineaordencompra> lineaordencompraList1;
    @OneToMany(mappedBy = "catalogosys2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Catalogoprvsys> catalogoprvsysList2;
    @OneToMany(mappedBy = "catalogosys3", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Faltantes> faltantesList2;

    public Catalogosys() {
    }

    public Catalogosys(Integer cantidadminima, Integer costounitario, String descripcion, Long existenciaactual,
                       Integer idmateriaprima, Unidadmedida unidadmedida1) {
        this.cantidadminima = cantidadminima;
        this.costounitario = costounitario;
        this.descripcion = descripcion;
        this.existenciaactual = existenciaactual;
        this.idmateriaprima = idmateriaprima;
        this.unidadmedida1 = unidadmedida1;
    }

    public Integer getCantidadminima() {
        return cantidadminima;
    }

    public void setCantidadminima(Integer cantidadminima) {
        this.cantidadminima = cantidadminima;
    }

    public Integer getCostounitario() {
        return costounitario;
    }

    public void setCostounitario(Integer costounitario) {
        this.costounitario = costounitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getExistenciaactual() {
        return existenciaactual;
    }

    public void setExistenciaactual(Long existenciaactual) {
        this.existenciaactual = existenciaactual;
    }

    public Integer getIdmateriaprima() {
        return idmateriaprima;
    }

    public void setIdmateriaprima(Integer idmateriaprima) {
        this.idmateriaprima = idmateriaprima;
    }


    public List<Receta> getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(List<Receta> recetaList) {
        this.recetaList = recetaList;
    }

    public Receta addReceta(Receta receta) {
        getRecetaList().add(receta);
        receta.setCatalogosys(this);
        return receta;
    }

    public Receta removeReceta(Receta receta) {
        getRecetaList().remove(receta);
        receta.setCatalogosys(null);
        return receta;
    }

    public Unidadmedida getUnidadmedida1() {
        return unidadmedida1;
    }

    public void setUnidadmedida1(Unidadmedida unidadmedida1) {
        this.unidadmedida1 = unidadmedida1;
    }

    public List<Lineaordencompra> getLineaordencompraList1() {
        return lineaordencompraList1;
    }

    public void setLineaordencompraList1(List<Lineaordencompra> lineaordencompraList1) {
        this.lineaordencompraList1 = lineaordencompraList1;
    }

    public Lineaordencompra addLineaordencompra(Lineaordencompra lineaordencompra) {
        getLineaordencompraList1().add(lineaordencompra);
        lineaordencompra.setCatalogosys1(this);
        return lineaordencompra;
    }

    public Lineaordencompra removeLineaordencompra(Lineaordencompra lineaordencompra) {
        getLineaordencompraList1().remove(lineaordencompra);
        lineaordencompra.setCatalogosys1(null);
        return lineaordencompra;
    }

    public List<Catalogoprvsys> getCatalogoprvsysList2() {
        return catalogoprvsysList2;
    }

    public void setCatalogoprvsysList2(List<Catalogoprvsys> catalogoprvsysList2) {
        this.catalogoprvsysList2 = catalogoprvsysList2;
    }

    public Catalogoprvsys addCatalogoprvsys(Catalogoprvsys catalogoprvsys) {
        getCatalogoprvsysList2().add(catalogoprvsys);
        catalogoprvsys.setCatalogosys2(this);
        return catalogoprvsys;
    }

    public Catalogoprvsys removeCatalogoprvsys(Catalogoprvsys catalogoprvsys) {
        getCatalogoprvsysList2().remove(catalogoprvsys);
        catalogoprvsys.setCatalogosys2(null);
        return catalogoprvsys;
    }

    public List<Faltantes> getFaltantesList2() {
        return faltantesList2;
    }

    public void setFaltantesList2(List<Faltantes> faltantesList2) {
        this.faltantesList2 = faltantesList2;
    }

    public Faltantes addFaltantes(Faltantes faltantes) {
        getFaltantesList2().add(faltantes);
        faltantes.setCatalogosys3(this);
        return faltantes;
    }

    public Faltantes removeFaltantes(Faltantes faltantes) {
        getFaltantesList2().remove(faltantes);
        faltantes.setCatalogosys3(null);
        return faltantes;
    }
}
