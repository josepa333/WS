
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for solicitudro1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="solicitudro1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fchmaxima" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fchsolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idcliente" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="idsolicitud" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudro1", propOrder = { "fchmaxima", "fchsolicitud", "idcliente", "idsolicitud" })
public class Solicitudro1 {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fchmaxima;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fchsolicitud;
    @XmlSchemaType(name = "anySimpleType")
    protected Object idcliente;
    protected Long idsolicitud;

    /**
     * Gets the value of the fchmaxima property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFchmaxima() {
        return fchmaxima;
    }

    /**
     * Sets the value of the fchmaxima property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFchmaxima(XMLGregorianCalendar value) {
        this.fchmaxima = value;
    }

    /**
     * Gets the value of the fchsolicitud property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFchsolicitud() {
        return fchsolicitud;
    }

    /**
     * Sets the value of the fchsolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFchsolicitud(XMLGregorianCalendar value) {
        this.fchsolicitud = value;
    }

    /**
     * Gets the value of the idcliente property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getIdcliente() {
        return idcliente;
    }

    /**
     * Sets the value of the idcliente property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setIdcliente(Object value) {
        this.idcliente = value;
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

}
