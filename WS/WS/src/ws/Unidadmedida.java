package ws;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Unidadmedida.findAll", query = "select o from Unidadmedida o") })
public class Unidadmedida implements Serializable {
    private static final long serialVersionUID = -297593784486294301L;
    @Id
    @Column(nullable = false)
    private Integer idunidadmedida;
    @Column(nullable = false, length = 15)
    private String unidadmedida;
    @OneToMany(mappedBy = "unidadmedida", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Lineaordencompra> lineaordencompraList;
    @OneToMany(mappedBy = "unidadmedida1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Catalogosys> catalogosysList;
    @OneToMany(mappedBy = "unidadmedida2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Faltantes> faltantesList1;
    @OneToMany(mappedBy = "unidadmedida3", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Conversion> conversionList;
    @OneToMany(mappedBy = "unidadmedida4", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Conversion> conversionList1;
    @OneToMany(mappedBy = "unidadmedida5", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Receta> recetaList3;
    @OneToMany(mappedBy = "unidadmedida6", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Catalogoprv> catalogoprvList1;

    public Unidadmedida() {
    }

    public Unidadmedida(Integer idunidadmedida, String unidadmedida) {
        this.idunidadmedida = idunidadmedida;
        this.unidadmedida = unidadmedida;
    }

    public Integer getIdunidadmedida() {
        return idunidadmedida;
    }

    public void setIdunidadmedida(Integer idunidadmedida) {
        this.idunidadmedida = idunidadmedida;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public List<Lineaordencompra> getLineaordencompraList() {
        return lineaordencompraList;
    }

    public void setLineaordencompraList(List<Lineaordencompra> lineaordencompraList) {
        this.lineaordencompraList = lineaordencompraList;
    }

    public Lineaordencompra addLineaordencompra(Lineaordencompra lineaordencompra) {
        getLineaordencompraList().add(lineaordencompra);
        lineaordencompra.setUnidadmedida(this);
        return lineaordencompra;
    }

    public Lineaordencompra removeLineaordencompra(Lineaordencompra lineaordencompra) {
        getLineaordencompraList().remove(lineaordencompra);
        lineaordencompra.setUnidadmedida(null);
        return lineaordencompra;
    }

    public List<Catalogosys> getCatalogosysList() {
        return catalogosysList;
    }

    public void setCatalogosysList(List<Catalogosys> catalogosysList) {
        this.catalogosysList = catalogosysList;
    }

    public Catalogosys addCatalogosys(Catalogosys catalogosys) {
        getCatalogosysList().add(catalogosys);
        catalogosys.setUnidadmedida1(this);
        return catalogosys;
    }

    public Catalogosys removeCatalogosys(Catalogosys catalogosys) {
        getCatalogosysList().remove(catalogosys);
        catalogosys.setUnidadmedida1(null);
        return catalogosys;
    }

    public List<Faltantes> getFaltantesList1() {
        return faltantesList1;
    }

    public void setFaltantesList1(List<Faltantes> faltantesList1) {
        this.faltantesList1 = faltantesList1;
    }

    public Faltantes addFaltantes(Faltantes faltantes) {
        getFaltantesList1().add(faltantes);
        faltantes.setUnidadmedida2(this);
        return faltantes;
    }

    public Faltantes removeFaltantes(Faltantes faltantes) {
        getFaltantesList1().remove(faltantes);
        faltantes.setUnidadmedida2(null);
        return faltantes;
    }

    public List<Conversion> getConversionList() {
        return conversionList;
    }

    public void setConversionList(List<Conversion> conversionList) {
        this.conversionList = conversionList;
    }

    public Conversion addConversion(Conversion conversion) {
        getConversionList().add(conversion);
        conversion.setUnidadmedida3(this);
        return conversion;
    }

    public Conversion removeConversion(Conversion conversion) {
        getConversionList().remove(conversion);
        conversion.setUnidadmedida3(null);
        return conversion;
    }

    public List<Conversion> getConversionList1() {
        return conversionList1;
    }

    public void setConversionList1(List<Conversion> conversionList1) {
        this.conversionList1 = conversionList1;
    }

    public List<Receta> getRecetaList3() {
        return recetaList3;
    }

    public void setRecetaList3(List<Receta> recetaList3) {
        this.recetaList3 = recetaList3;
    }

    public Receta addReceta(Receta receta) {
        getRecetaList3().add(receta);
        receta.setUnidadmedida5(this);
        return receta;
    }

    public Receta removeReceta(Receta receta) {
        getRecetaList3().remove(receta);
        receta.setUnidadmedida5(null);
        return receta;
    }

    public List<Catalogoprv> getCatalogoprvList1() {
        return catalogoprvList1;
    }

    public void setCatalogoprvList1(List<Catalogoprv> catalogoprvList1) {
        this.catalogoprvList1 = catalogoprvList1;
    }

    public Catalogoprv addCatalogoprv(Catalogoprv catalogoprv) {
        getCatalogoprvList1().add(catalogoprv);
        catalogoprv.setUnidadmedida6(this);
        return catalogoprv;
    }

    public Catalogoprv removeCatalogoprv(Catalogoprv catalogoprv) {
        getCatalogoprvList1().remove(catalogoprv);
        catalogoprv.setUnidadmedida6(null);
        return catalogoprv;
    }
}
