
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineaSolicitud complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="lineaSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idlineasolicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idordenproduccion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idprenda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idsolicitud" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idtalla" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineaSolicitud",
         propOrder = { "cantidad", "idlineasolicitud", "idordenproduccion", "idprenda", "idsolicitud", "idtalla"
    })
public class LineaSolicitud {

    protected Integer cantidad;
    protected Integer idlineasolicitud;
    protected Long idordenproduccion;
    protected Integer idprenda;
    protected Long idsolicitud;
    protected Integer idtalla;

    /**
     * Gets the value of the cantidad property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the idlineasolicitud property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdlineasolicitud() {
        return idlineasolicitud;
    }

    /**
     * Sets the value of the idlineasolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdlineasolicitud(Integer value) {
        this.idlineasolicitud = value;
    }

    /**
     * Gets the value of the idordenproduccion property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getIdordenproduccion() {
        return idordenproduccion;
    }

    /**
     * Sets the value of the idordenproduccion property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setIdordenproduccion(Long value) {
        this.idordenproduccion = value;
    }

    /**
     * Gets the value of the idprenda property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdprenda() {
        return idprenda;
    }

    /**
     * Sets the value of the idprenda property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdprenda(Integer value) {
        this.idprenda = value;
    }

    /**
     * Gets the value of the idsolicitud property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getIdsolicitud() {
        return idsolicitud;
    }

    /**
     * Sets the value of the idsolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setIdsolicitud(Long value) {
        this.idsolicitud = value;
    }

    /**
     * Gets the value of the idtalla property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdtalla() {
        return idtalla;
    }

    /**
     * Sets the value of the idtalla property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdtalla(Integer value) {
        this.idtalla = value;
    }

}
