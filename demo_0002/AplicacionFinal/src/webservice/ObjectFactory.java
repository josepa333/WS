
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

    private final static QName _ActualizaLineasSolicitud_QNAME =
        new QName("http://webservice/", "actualizaLineasSolicitud");
    private final static QName _ActualizaLineasSolicitudResponse_QNAME =
        new QName("http://webservice/", "actualizaLineasSolicitudResponse");
    private final static QName _ActualizaSolicitud_QNAME = new QName("http://webservice/", "actualizaSolicitud");
    private final static QName _ActualizaSolicitudResponse_QNAME =
        new QName("http://webservice/", "actualizaSolicitudResponse");
    private final static QName _BorraLineasSolicitud_QNAME = new QName("http://webservice/", "borraLineasSolicitud");
    private final static QName _BorraLineasSolicitudResponse_QNAME =
        new QName("http://webservice/", "borraLineasSolicitudResponse");
    private final static QName _BorraSolicitud_QNAME = new QName("http://webservice/", "borraSolicitud");
    private final static QName _BorraSolicitudResponse_QNAME =
        new QName("http://webservice/", "borraSolicitudResponse");
    private final static QName _CloseConexion_QNAME = new QName("http://webservice/", "closeConexion");
    private final static QName _CloseConexionResponse_QNAME = new QName("http://webservice/", "closeConexionResponse");
    private final static QName _Commit_QNAME = new QName("http://webservice/", "commit");
    private final static QName _CommitResponse_QNAME = new QName("http://webservice/", "commitResponse");
    private final static QName _Consulta1_QNAME = new QName("http://webservice/", "consulta1");
    private final static QName _Consulta1Response_QNAME = new QName("http://webservice/", "consulta1Response");
    private final static QName _Consulta2_QNAME = new QName("http://webservice/", "consulta2");
    private final static QName _Consulta2Response_QNAME = new QName("http://webservice/", "consulta2Response");
    private final static QName _ConsultaTodasLasLineas_QNAME =
        new QName("http://webservice/", "consultaTodasLasLineas");
    private final static QName _ConsultaTodasLasLineasResponse_QNAME =
        new QName("http://webservice/", "consultaTodasLasLineasResponse");
    private final static QName _GetConection_QNAME = new QName("http://webservice/", "getConection");
    private final static QName _GetConectionResponse_QNAME = new QName("http://webservice/", "getConectionResponse");
    private final static QName _GetLineaSolicitudes_QNAME = new QName("http://webservice/", "getLineaSolicitudes");
    private final static QName _GetLineaSolicitudesResponse_QNAME =
        new QName("http://webservice/", "getLineaSolicitudesResponse");
    private final static QName _GetSolicitudes_QNAME = new QName("http://webservice/", "getSolicitudes");
    private final static QName _GetSolicitudesResponse_QNAME =
        new QName("http://webservice/", "getSolicitudesResponse");
    private final static QName _InsertaLineasSolicitud_QNAME =
        new QName("http://webservice/", "insertaLineasSolicitud");
    private final static QName _InsertaLineasSolicitudResponse_QNAME =
        new QName("http://webservice/", "insertaLineasSolicitudResponse");
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
     * Create an instance of {@link ActualizaLineasSolicitud }
     *
     */
    public ActualizaLineasSolicitud createActualizaLineasSolicitud() {
        return new ActualizaLineasSolicitud();
    }

    /**
     * Create an instance of {@link ActualizaLineasSolicitudResponse }
     *
     */
    public ActualizaLineasSolicitudResponse createActualizaLineasSolicitudResponse() {
        return new ActualizaLineasSolicitudResponse();
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
     * Create an instance of {@link BorraLineasSolicitud }
     *
     */
    public BorraLineasSolicitud createBorraLineasSolicitud() {
        return new BorraLineasSolicitud();
    }

    /**
     * Create an instance of {@link BorraLineasSolicitudResponse }
     *
     */
    public BorraLineasSolicitudResponse createBorraLineasSolicitudResponse() {
        return new BorraLineasSolicitudResponse();
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
     * Create an instance of {@link Consulta1 }
     *
     */
    public Consulta1 createConsulta1() {
        return new Consulta1();
    }

    /**
     * Create an instance of {@link Consulta1Response }
     *
     */
    public Consulta1Response createConsulta1Response() {
        return new Consulta1Response();
    }

    /**
     * Create an instance of {@link Consulta2 }
     *
     */
    public Consulta2 createConsulta2() {
        return new Consulta2();
    }

    /**
     * Create an instance of {@link Consulta2Response }
     *
     */
    public Consulta2Response createConsulta2Response() {
        return new Consulta2Response();
    }

    /**
     * Create an instance of {@link ConsultaTodasLasLineas }
     *
     */
    public ConsultaTodasLasLineas createConsultaTodasLasLineas() {
        return new ConsultaTodasLasLineas();
    }

    /**
     * Create an instance of {@link ConsultaTodasLasLineasResponse }
     *
     */
    public ConsultaTodasLasLineasResponse createConsultaTodasLasLineasResponse() {
        return new ConsultaTodasLasLineasResponse();
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
     * Create an instance of {@link GetLineaSolicitudes }
     *
     */
    public GetLineaSolicitudes createGetLineaSolicitudes() {
        return new GetLineaSolicitudes();
    }

    /**
     * Create an instance of {@link GetLineaSolicitudesResponse }
     *
     */
    public GetLineaSolicitudesResponse createGetLineaSolicitudesResponse() {
        return new GetLineaSolicitudesResponse();
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
     * Create an instance of {@link InsertaLineasSolicitud }
     *
     */
    public InsertaLineasSolicitud createInsertaLineasSolicitud() {
        return new InsertaLineasSolicitud();
    }

    /**
     * Create an instance of {@link InsertaLineasSolicitudResponse }
     *
     */
    public InsertaLineasSolicitudResponse createInsertaLineasSolicitudResponse() {
        return new InsertaLineasSolicitudResponse();
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
     * Create an instance of {@link LineaSolicitud }
     *
     */
    public LineaSolicitud createLineaSolicitud() {
        return new LineaSolicitud();
    }

    /**
     * Create an instance of {@link Solicitudro1 }
     *
     */
    public Solicitudro1 createSolicitudro1() {
        return new Solicitudro1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaLineasSolicitud }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actualizaLineasSolicitud")
    public JAXBElement<ActualizaLineasSolicitud> createActualizaLineasSolicitud(ActualizaLineasSolicitud value) {
        return new JAXBElement<ActualizaLineasSolicitud>(_ActualizaLineasSolicitud_QNAME,
                                                         ActualizaLineasSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaLineasSolicitudResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actualizaLineasSolicitudResponse")
    public JAXBElement<ActualizaLineasSolicitudResponse> createActualizaLineasSolicitudResponse(ActualizaLineasSolicitudResponse value) {
        return new JAXBElement<ActualizaLineasSolicitudResponse>(_ActualizaLineasSolicitudResponse_QNAME,
                                                                 ActualizaLineasSolicitudResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BorraLineasSolicitud }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "borraLineasSolicitud")
    public JAXBElement<BorraLineasSolicitud> createBorraLineasSolicitud(BorraLineasSolicitud value) {
        return new JAXBElement<BorraLineasSolicitud>(_BorraLineasSolicitud_QNAME, BorraLineasSolicitud.class, null,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorraLineasSolicitudResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "borraLineasSolicitudResponse")
    public JAXBElement<BorraLineasSolicitudResponse> createBorraLineasSolicitudResponse(BorraLineasSolicitudResponse value) {
        return new JAXBElement<BorraLineasSolicitudResponse>(_BorraLineasSolicitudResponse_QNAME,
                                                             BorraLineasSolicitudResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta1 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consulta1")
    public JAXBElement<Consulta1> createConsulta1(Consulta1 value) {
        return new JAXBElement<Consulta1>(_Consulta1_QNAME, Consulta1.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta1Response }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consulta1Response")
    public JAXBElement<Consulta1Response> createConsulta1Response(Consulta1Response value) {
        return new JAXBElement<Consulta1Response>(_Consulta1Response_QNAME, Consulta1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta2 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consulta2")
    public JAXBElement<Consulta2> createConsulta2(Consulta2 value) {
        return new JAXBElement<Consulta2>(_Consulta2_QNAME, Consulta2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta2Response }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consulta2Response")
    public JAXBElement<Consulta2Response> createConsulta2Response(Consulta2Response value) {
        return new JAXBElement<Consulta2Response>(_Consulta2Response_QNAME, Consulta2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTodasLasLineas }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consultaTodasLasLineas")
    public JAXBElement<ConsultaTodasLasLineas> createConsultaTodasLasLineas(ConsultaTodasLasLineas value) {
        return new JAXBElement<ConsultaTodasLasLineas>(_ConsultaTodasLasLineas_QNAME, ConsultaTodasLasLineas.class,
                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTodasLasLineasResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consultaTodasLasLineasResponse")
    public JAXBElement<ConsultaTodasLasLineasResponse> createConsultaTodasLasLineasResponse(ConsultaTodasLasLineasResponse value) {
        return new JAXBElement<ConsultaTodasLasLineasResponse>(_ConsultaTodasLasLineasResponse_QNAME,
                                                               ConsultaTodasLasLineasResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineaSolicitudes }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getLineaSolicitudes")
    public JAXBElement<GetLineaSolicitudes> createGetLineaSolicitudes(GetLineaSolicitudes value) {
        return new JAXBElement<GetLineaSolicitudes>(_GetLineaSolicitudes_QNAME, GetLineaSolicitudes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineaSolicitudesResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getLineaSolicitudesResponse")
    public JAXBElement<GetLineaSolicitudesResponse> createGetLineaSolicitudesResponse(GetLineaSolicitudesResponse value) {
        return new JAXBElement<GetLineaSolicitudesResponse>(_GetLineaSolicitudesResponse_QNAME,
                                                            GetLineaSolicitudesResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaLineasSolicitud }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "insertaLineasSolicitud")
    public JAXBElement<InsertaLineasSolicitud> createInsertaLineasSolicitud(InsertaLineasSolicitud value) {
        return new JAXBElement<InsertaLineasSolicitud>(_InsertaLineasSolicitud_QNAME, InsertaLineasSolicitud.class,
                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaLineasSolicitudResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "insertaLineasSolicitudResponse")
    public JAXBElement<InsertaLineasSolicitudResponse> createInsertaLineasSolicitudResponse(InsertaLineasSolicitudResponse value) {
        return new JAXBElement<InsertaLineasSolicitudResponse>(_InsertaLineasSolicitudResponse_QNAME,
                                                               InsertaLineasSolicitudResponse.class, null, value);
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
