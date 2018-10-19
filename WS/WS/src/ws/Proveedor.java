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
import javax.persistence.OneToOne;

@Entity
@NamedQueries({ @NamedQuery(name = "Proveedor.findAll", query = "select o from Proveedor o") })
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 6932225775585230000L;
    @Column(nullable = false)
    private Integer cantidadminimapedido;
    @Column(nullable = false, length = 60)
    private String correo;
    @Column(nullable = false, length = 60)
    private String direccion;
    @Id
    @Column(nullable = false)
    private Integer idproveedor;
    @Column(nullable = false, length = 60)
    private String nombre;
    @Column(nullable = false, length = 20)
    private String nombredecontacto;
    @Column(nullable = false, length = 10)
    private String telefono;
    @OneToMany(mappedBy = "proveedor", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Catalogoprv> catalogoprvList;
    @OneToOne(mappedBy = "proveedor1")
    private Prvnacional prvnacionalList;
    @OneToMany(mappedBy = "proveedor2", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Ordencompra> lineaordencompraList;
    @OneToOne(mappedBy = "proveedor3")
    private Prvextranjero prvextranjeroList;

    public Proveedor() {
    }

    public Proveedor(Integer cantidadminimapedido, String correo, String direccion, Integer idproveedor, String nombre,
                     String nombredecontacto, String telefono) {
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

    public List<Catalogoprv> getCatalogoprvList() {
        return catalogoprvList;
    }

    public void setCatalogoprvList(List<Catalogoprv> catalogoprvList) {
        this.catalogoprvList = catalogoprvList;
    }

    public Catalogoprv addCatalogoprv(Catalogoprv catalogoprv) {
        getCatalogoprvList().add(catalogoprv);
        catalogoprv.setProveedor(this);
        return catalogoprv;
    }

    public Catalogoprv removeCatalogoprv(Catalogoprv catalogoprv) {
        getCatalogoprvList().remove(catalogoprv);
        catalogoprv.setProveedor(null);
        return catalogoprv;
    }

    public Prvnacional getPrvnacionalList() {
        return prvnacionalList;
    }

    public void setPrvnacionalList(Prvnacional prvnacionalList) {
        this.prvnacionalList = prvnacionalList;
    }

    public List<Ordencompra> getLineaordencompraList() {
        return lineaordencompraList;
    }

    public void setLineaordencompraList(List<Ordencompra> lineaordencompraList) {
        this.lineaordencompraList = lineaordencompraList;
    }

    public Ordencompra addOrdencompra(Ordencompra ordencompra) {
        getLineaordencompraList().add(ordencompra);
        ordencompra.setProveedor2(this);
        return ordencompra;
    }

    public Ordencompra removeOrdencompra(Ordencompra ordencompra) {
        getLineaordencompraList().remove(ordencompra);
        ordencompra.setProveedor2(null);
        return ordencompra;
    }

    public Prvextranjero getPrvextranjeroList() {
        return prvextranjeroList;
    }

    public void setPrvextranjeroList(Prvextranjero prvextranjeroList) {
        this.prvextranjeroList = prvextranjeroList;
    }
}
