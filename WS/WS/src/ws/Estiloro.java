package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Estiloro.findAll", query = "select o from Estiloro o") })
public class Estiloro implements Serializable {
    private static final long serialVersionUID = -5705697104132118842L;
    @Column(length = 15)
    private String color;
    @Column(length = 60)
    private String descripcion;
    @Id
    @Column(nullable = false)
    private Integer idestilo;

    public Estiloro() {
    }

    public Estiloro(String color, String descripcion, Integer idestilo) {
        this.color = color;
        this.descripcion = descripcion;
        this.idestilo = idestilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdestilo() {
        return idestilo;
    }

    public void setIdestilo(Integer idestilo) {
        this.idestilo = idestilo;
    }
}
