
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the webservice package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizaSolicitud_QNAME = new QName("http://webservice/", "actualizaSolicitud");
    private final static QName _ActualizaSolicitudResponse_QNAME =
        new QName("http://webservice/", "actualizaSolicitudResponse");
    private final static QName _BorraSolicitud_QNAME = new QName("http://webservice/", "borraSolicitud");
    private final static QName _BorraSolicitudResponse_QNAME =
        new QName("http://webservice/", "borraSolicitudResponse");
    private final static QName _CloseConexion_QNAME = new QName("http://webservice/", "closeConexion");
    private final static QName _CloseConexionResponse_QNAME = new QName("http://webservice/", "closeConexionResponse");
    private final static QName _Commit_QNAME = new QName("http://webservice/", "commit");
    private final static QName _CommitResponse_QNAME = new QName("http://webservice/", "commitResponse");
    private final static QName _GetConection_QNAME = new QName("http://webservice/", "getConection");
    private final static QName _GetConectionResponse_QNAME = new QName("http://webservice/", "getConectionResponse");
    private final static QName _GetSolicitudes_QNAME = new QName("http://webservice/", "getSolicitudes");
    private final static QName _GetSolicitudesResponse_QNAME =
        new QName("http://webservice/", "getSolicitudesResponse");
    private final static QName _InsertaSolicitud_QNAME = new QName("http://webservice/", "insertaSolicitud");
    private final static QName _InsertaSolicitudResponse_QNAME =
        new QName("http://webservice/", "insertaSolicitudResponse");
    private final static QName _SetSessionContext_QNAME = new QName("http://webservice/", "setSessionContext");
    private final static QName _SetSessionContextResponse_QNAME =
        new QName("http://webservice/", "setSessionContextResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizaSolicitud }
     *
     */
    public ActualizaSolicitud createActualizaSolicitud() {
        return new ActualizaSolicitud();
    }

    /**
     * Create an instance of {@link ActualizaSolicitudResponse }
     *
     */
    public ActualizaSolicitudResponse createActualizaSolicitudResponse() {
        return new ActualizaSolicitudResponse();
    }

    /**
     * Create an instance of {@link BorraSolicitud }
     *
     */
    public BorraSolicitud createBorraSolicitud() {
        return new BorraSolicitud();
    }

    /**
     * Create an instance of {@link BorraSolicitudResponse }
     *
     */
    public BorraSolicitudResponse createBorraSolicitudResponse() {
        return new BorraSolicitudResponse();
    }

    /**
     * Create an instance of {@link CloseConexion }
     *
     */
    public CloseConexion createCloseConexion() {
        return new CloseConexion();
    }

    /**
     * Create an instance of {@link CloseConexionResponse }
     *
     */
    public CloseConexionResponse createCloseConexionResponse() {
        return new CloseConexionResponse();
    }

    /**
     * Create an instance of {@link Commit }
     *
     */
    public Commit createCommit() {
        return new Commit();
    }

    /**
     * Create an instance of {@link CommitResponse }
     *
     */
    public CommitResponse createCommitResponse() {
        return new CommitResponse();
    }

    /**
     * Create an instance of {@link GetConection }
     *
     */
    public GetConection createGetConection() {
        return new GetConection();
    }

    /**
     * Create an instance of {@link GetConectionResponse }
     *
     */
    public GetConectionResponse createGetConectionResponse() {
        return new GetConectionResponse();
    }

    /**
     * Create an instance of {@link GetSolicitudes }
     *
     */
    public GetSolicitudes createGetSolicitudes() {
        return new GetSolicitudes();
    }

    /**
     * Create an instance of {@link GetSolicitudesResponse }
     *
     */
    public GetSolicitudesResponse createGetSolicitudesResponse() {
        return new GetSolicitudesResponse();
    }

    /**
     * Create an instance of {@link InsertaSolicitud }
     *
     */
    public InsertaSolicitud createInsertaSolicitud() {
        return new InsertaSolicitud();
    }

    /**
     * Create an instance of {@link InsertaSolicitudResponse }
     *
     */
    public InsertaSolicitudResponse createInsertaSolicitudResponse() {
        return new InsertaSolicitudResponse();
    }

    /**
     * Create an instance of {@link SetSessionContext }
     *
     */
    public SetSessionContext createSetSessionContext() {
        return new SetSessionContext();
    }

    /**
     * Create an instance of {@link SetSessionContextResponse }
     *
     */
    public SetSessionContextResponse createSetSessionContextResponse() {
        return new SetSessionContextResponse();
    }

    /**
     * Create an instance of {@link Solicitudro1 }
     *
     */
    public Solicitudro1 createSolicitudro1() {
        return new Solicitudro1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaSolicitud }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actualizaSolicitud")
    public JAXBElement<ActualizaSolicitud> createActualizaSolicitud(ActualizaSolicitud value) {
        return new JAXBElement<ActualizaSolicitud>(_ActualizaSolicitud_QNAME, ActualizaSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaSolicitudResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actualizaSolicitudResponse")
    public JAXBElement<ActualizaSolicitudResponse> createActualizaSolicitudResponse(ActualizaSolicitudResponse value) {
        return new JAXBElement<ActualizaSolicitudResponse>(_ActualizaSolicitudResponse_QNAME,
                                                           ActualizaSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorraSolicitud }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "borraSolicitud")
    public JAXBElement<BorraSolicitud> createBorraSolicitud(BorraSolicitud value) {
        return new JAXBElement<BorraSolicitud>(_BorraSolicitud_QNAME, BorraSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorraSolicitudResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "borraSolicitudResponse")
    public JAXBElement<BorraSolicitudResponse> createBorraSolicitudResponse(BorraSolicitudResponse value) {
        return new JAXBElement<BorraSolicitudResponse>(_BorraSolicitudResponse_QNAME, BorraSolicitudResponse.class,
                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseConexion }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "closeConexion")
    public JAXBElement<CloseConexion> createCloseConexion(CloseConexion value) {
        return new JAXBElement<CloseConexion>(_CloseConexion_QNAME, CloseConexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseConexionResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "closeConexionResponse")
    public JAXBElement<CloseConexionResponse> createCloseConexionResponse(CloseConexionResponse value) {
        return new JAXBElement<CloseConexionResponse>(_CloseConexionResponse_QNAME, CloseConexionResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commit }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "commit")
    public JAXBElement<Commit> createCommit(Commit value) {
        return new JAXBElement<Commit>(_Commit_QNAME, Commit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "commitResponse")
    public JAXBElement<CommitResponse> createCommitResponse(CommitResponse value) {
        return new JAXBElement<CommitResponse>(_CommitResponse_QNAME, CommitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConection }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getConection")
    public JAXBElement<GetConection> createGetConection(GetConection value) {
        return new JAXBElement<GetConection>(_GetConection_QNAME, GetConection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConectionResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getConectionResponse")
    public JAXBElement<GetConectionResponse> createGetConectionResponse(GetConectionResponse value) {
        return new JAXBElement<GetConectionResponse>(_GetConectionResponse_QNAME, GetConectionResponse.class, null,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolicitudes }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getSolicitudes")
    public JAXBElement<GetSolicitudes> createGetSolicitudes(GetSolicitudes value) {
        return new JAXBElement<GetSolicitudes>(_GetSolicitudes_QNAME, GetSolicitudes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolicitudesResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getSolicitudesResponse")
    public JAXBElement<GetSolicitudesResponse> createGetSolicitudesResponse(GetSolicitudesResponse value) {
        return new JAXBElement<GetSolicitudesResponse>(_GetSolicitudesResponse_QNAME, GetSolicitudesResponse.class,
                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaSolicitud }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "insertaSolicitud")
    public JAXBElement<InsertaSolicitud> createInsertaSolicitud(InsertaSolicitud value) {
        return new JAXBElement<InsertaSolicitud>(_InsertaSolicitud_QNAME, InsertaSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaSolicitudResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "insertaSolicitudResponse")
    public JAXBElement<InsertaSolicitudResponse> createInsertaSolicitudResponse(InsertaSolicitudResponse value) {
        return new JAXBElement<InsertaSolicitudResponse>(_InsertaSolicitudResponse_QNAME,
                                                         InsertaSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSessionContext }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "setSessionContext")
    public JAXBElement<SetSessionContext> createSetSessionContext(SetSessionContext value) {
        return new JAXBElement<SetSessionContext>(_SetSessionContext_QNAME, SetSessionContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSessionContextResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "setSessionContextResponse")
    public JAXBElement<SetSessionContextResponse> createSetSessionContextResponse(SetSessionContextResponse value) {
        return new JAXBElement<SetSessionContextResponse>(_SetSessionContextResponse_QNAME,
                                                          SetSessionContextResponse.class, null, value);
    }

}
