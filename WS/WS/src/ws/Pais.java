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
@NamedQueries({ @NamedQuery(name = "Pais.findAll", query = "select o from Pais o") })
public class Pais implements Serializable {
    private static final long serialVersionUID = -2447609391975747908L;
    @Id
    @Column(nullable = false)
    private Integer idpais;
    @Column(nullable = false, length = 40)
    private String nombre;
    @OneToMany(mappedBy = "pais", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Cliente> clienteList;

    public Pais() {
    }

    public Pais(Integer idpais, String nombre) {
        this.idpais = idpais;
        this.nombre = nombre;
    }

    public Integer getIdpais() {
        return idpais;
    }

    public void setIdpais(Integer idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Cliente addCliente(Cliente cliente) {
        getClienteList().add(cliente);
        cliente.setPais(this);
        return cliente;
    }

    public Cliente removeCliente(Cliente cliente) {
        getClienteList().remove(cliente);
        cliente.setPais(null);
        return cliente;
    }
}
