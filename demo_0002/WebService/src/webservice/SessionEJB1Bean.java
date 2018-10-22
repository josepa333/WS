package webservice;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


@Stateless(name = "SessionEJB1", mappedName = "demo_0002-WebService-SessionEJB1")
@TransactionManagement(TransactionManagementType.BEAN)
@WebService(wsdlLocation = "/META-INF/SessionEJB1BeanService.wsdl")
public class SessionEJB1Bean implements SessionEJB1, SessionEJB1Local {
    @Resource
    SessionContext sessionContext;
        static ArrayList<Connection> listaConexiones = new ArrayList<Connection>(0) ;
        static PreparedStatement inserta ;
        static PreparedStatement actualiza;
        static PreparedStatement borra;
        static PreparedStatement consulta;
        
        static PreparedStatement insertaLineas ;
        static PreparedStatement actualizaLineas;
        static PreparedStatement borraLineas;
        static PreparedStatement consultaLineas;
        
        static PreparedStatement actualizaTablasAnidadas;
        static PreparedStatement consultaTodasLasFilas;
        
        //Consultas
        static PreparedStatement consultaQuery1;
        static PreparedStatement consultaQuery2;

    public SessionEJB1Bean() {
        
    }
    @WebMethod
         public int getConection(){
             Connection conexion = null;
             try {
                 InitialContext ctx = new InitialContext();
                 DataSource odsconn = (DataSource)ctx.lookup("/app/jdbc/jdbc/conexionBDDS");
                 conexion = odsconn.getConnection();
                 conexion.setAutoCommit(false);
                 conexion.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
                 listaConexiones.add(conexion);
                 
                 inserta = conexion.prepareStatement("INSERT INTO solicitudro values(?, ?, ?,(select ref(c) from clientero c where idCliente = ?),COLLECTIONLINEASOLICITUD_TYPE())");
                 consulta = conexion.prepareStatement("select sol.IDSOLICITUD, sol.FCHSOLICITUD, sol.FCHMAXIMA, deref(sol.CLIENTE).idCliente clID, sol.LINEASSOLICITUD from solicitudro sol");
                 actualiza = conexion.prepareStatement("Update Solicitudro set fchmaxima = ?, fchsolicitud = ? Where idsolicitud = ?");
                 borra = conexion.prepareStatement("Delete From Solicitudro Where idsolicitud = ?");
                
                 //Lineas
                 actualizaTablasAnidadas = conexion.prepareCall("{call actualizaLineasSolicitud}");
                 
                 consultaTodasLasFilas = conexion.prepareStatement("select count(*) co from lineasolicitudro");
                 
                 insertaLineas = conexion.prepareStatement("insert into lineasolicitudro values(?,(select ref(p) from prendaro p where idprenda = ?),(select ref(t) from tallaro t where idtalla = ?),?,(select ref(o) from ordenproduccionro o where idordenproduccion = ?),(select ref(s) from solicitudro s where idsolicitud = ?))");
                 consultaLineas = conexion.prepareStatement("select idlineasolicitud,cantidad, deref(lin.prenda).idprenda prenda,deref(lin.talla).idtalla talla , deref(lin.ordenproduccion).idordenproduccion ordenproduccion ,deref(lin.solicitud).idsolicitud SOLICITUD from lineasolicitudro lin where deref(lin.solicitud).idsolicitud = ?");
                 actualizaLineas = conexion.prepareStatement("update lineasolicitudro set cantidad = ?, talla = (select ref(t) from tallaro t where idtalla = ?), prenda = (select ref(p) from prendaro p where idprenda = ?) Where idlineasolicitud = ?");
                 borraLineas = conexion.prepareStatement("Delete From Lineasolicitudro Where idlineasolicitud = ?");

                //Consultas
                 consultaQuery1 = conexion.prepareStatement("SELECT deref(ls.solicitud).idSolicitud SOLICITUD, r.idMateriaPrima IDMATERIAPRIMA, deref(f.UnidadMedida).idUnidadMedida UNIDADMEDIDA, f.cantidadFaltante CANTIDADFALTANTE FROM LineaSolicitudRO ls , RecetaRO r, FaltantesRO f WHERE ((deref(ls.prenda).idPrenda = r.idPrenda)and (deref(ls.talla).idtalla = r.idPrenda) and (r.idMateriaPrima = f.idMateriaPrima) and (deref(ls.ordenproduccion).idOrdenProduccion = f.idOrdenProduccion))");
                 consultaQuery2 = conexion.prepareStatement("SELECT EXTRACT( year FROM deref(ls.SOLICITUD).FCHSOLICITUD) ANNO, deref(deref(deref(ls.SOLICITUD).Cliente).Pais).NOMBRE PAIS, deref(deref(ls.SOLICITUD).Cliente).NOMBRE CLIENTE, sum(ls.cantidad *deref(ls.prenda).costounitario) VENTA FROM    LINEASOLICITUDRO ls GROUP BY EXTRACT( year FROM deref(ls.SOLICITUD).FCHSOLICITUD), CUBE(deref(deref(deref(ls.SOLICITUD).Cliente).Pais).NOMBRE, deref(deref(ls.SOLICITUD).Cliente).NOMBRE) ORDER BY EXTRACT( year FROM deref(ls.SOLICITUD).FCHSOLICITUD)");
                     
                 return listaConexiones.size() - 1;
             }
                 catch (NamingException e){
                 return -1;
             }
                 catch (SQLException e){
                 return -1;
             }
         }
        
        @WebMethod
         public boolean closeConexion(int indice){
            try {
                listaConexiones.get(indice).close();
                return true ;
             }
             catch (SQLException e) {
                 return false;
             }
         }
        
        @WebMethod
         public boolean commit(int indice){
             try {
                actualizaTablasAnidadas.executeUpdate();
                listaConexiones.get(indice).commit();
                return true;
             }
             catch (SQLException e){
                return false;
             }
         }
        
        @WebMethod
        public Collection<Solicitudro1> getSolicitudes() {
             Collection<Solicitudro1> solicitudes;
             solicitudes = new ArrayList<Solicitudro1>();
             try {
                 ResultSet rset;
                 rset = consulta.executeQuery();
                 while (rset.next()){
                     solicitudes.add(new Solicitudro1 (rset.getDate("fchmaxima"),rset.getDate("fchsolicitud"), rset.getLong("clID"),
                     rset.getLong("idsolicitud") )
                     );
                 };
                 rset.close();
                 return solicitudes;
             }
             
             catch (SQLException e) {
                 java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                Solicitudro1 sol = new Solicitudro1( sqlDate,sqlDate, 2L,3L ); 
                sol.setError(e.getMessage());
                solicitudes.add(sol);
             return solicitudes;
             }
         }
        
        
        @WebMethod
        public String insertaSolicitud(Solicitudro1 solicitud){
             try{         
                 inserta.setLong(1,solicitud.getIdsolicitud());
                 inserta.setDate(2, new java.sql.Date(solicitud.getFchsolicitud().getTime()));
                 inserta.setDate(3, new java.sql.Date(solicitud.getFchmaxima().getTime()));
                 inserta.setLong (4,solicitud.getIdcliente() );
                 inserta.executeUpdate();
                 return "true";
             }
             catch (SQLException e) {
                return e.getMessage();
             }
             catch(Exception e){
                 return  e.getMessage();
             }
         }
        
        @WebMethod//Revisar la fecha en caso defallo pasarala a java.sql.Date
        public String actualizaSolicitud(Solicitudro1 solicitud){
            try {
                 actualiza.setDate(1, new java.sql.Date(solicitud.getFchmaxima().getTime()));
                 actualiza.setDate(2, new java.sql.Date(solicitud.getFchsolicitud().getTime()));
                 actualiza.setLong(3, solicitud.getIdsolicitud());
                 actualiza.executeUpdate();
                 return "true";
             }
             catch (SQLException e) {
                 return e.getMessage();
             }
            catch(Exception e){
                return  e.getMessage();
            }
        }
        
        @WebMethod
        public String borraSolicitud(Solicitudro1 solicitud){
             try {
                 borra.setLong(1, solicitud.getIdsolicitud());
                 borra.executeUpdate();
                 return "true";
             }
             catch (SQLException e) {
                return  e.getMessage();
             }
             catch(Exception e){
                 return  e.getMessage();
             }
         }
        
    @WebMethod
     public Collection<LineaSolicitud> getLineaSolicitudes(Long idSolicitud) {
          Collection<LineaSolicitud> solicitudes;
                    solicitudes = new ArrayList<LineaSolicitud>();
                    try {
                        ResultSet rset;
                        consultaLineas.setLong(1, idSolicitud);
                        rset = consultaLineas.executeQuery();
                        while (rset.next()){
                            solicitudes.add(new LineaSolicitud (rset.getInt("CANTIDAD"),
                                                                rset.getInt("IDLINEASOLICITUD"),
                                                                rset.getLong("ORDENPRODUCCION"),
                                                                rset.getInt("PRENDA"),
                                                                rset.getLong("SOLICITUD"),
                                                                rset.getInt("TALLA")
                                                               )
                            );
                        };
                        rset.close();
                        return solicitudes;
                    }
                    catch (SQLException e) {
                        solicitudes.add(new LineaSolicitud (e.getErrorCode(),0,0L,0,0L,0));
                    return solicitudes;
                    }
                }
         
    @WebMethod
    public String insertaLineasSolicitud(LineaSolicitud lineaSolicitud){
         try{         
             
             insertaLineas.setInt(1,lineaSolicitud.getIdlineasolicitud() );
             insertaLineas.setInt(2,lineaSolicitud.getIdprenda());
             insertaLineas.setInt(3,lineaSolicitud.getIdtalla());
             insertaLineas.setInt(4,lineaSolicitud.getCantidad() );
             insertaLineas.setLong(5,lineaSolicitud.getIdordenproduccion() );
             insertaLineas.setLong(6,lineaSolicitud.getIdsolicitud());//Int .getID...

             insertaLineas.executeUpdate();
             return "true";
         }
         catch (SQLException e) {
            return  e.getMessage();
         }
         catch(Exception e){
             return  e.getMessage();
         }
     }
    
    @WebMethod
    public String actualizaLineasSolicitud(LineaSolicitud lineaSolicitud){
        try {
             actualizaLineas.setInt(1,lineaSolicitud.getCantidad() );
             actualizaLineas.setInt(2,lineaSolicitud.getIdtalla() );
             actualizaLineas.setInt(3,lineaSolicitud.getIdprenda() );
             actualizaLineas.setInt(4,lineaSolicitud.getIdlineasolicitud());
             actualizaLineas.executeUpdate();
             return "true";
         }
         catch (SQLException e) {
             return  e.getMessage();
         }
        catch(Exception e){
            return  e.getMessage();
        }
    }
    
    @WebMethod
    public String borraLineasSolicitud(LineaSolicitud lineaSolicitud){
         try {
             borraLineas.setLong(1, lineaSolicitud.getIdlineasolicitud());
             borraLineas.executeUpdate();
             return "true";
         }
         catch (SQLException e) {
            return  e.getMessage();
         }
         catch(Exception e){
             return  e.getMessage();
         }
     }
    
    @WebMethod
    public int consultaTodasLasLineas(){
         try {
             ResultSet rset;
             rset = consultaTodasLasFilas.executeQuery();
             rset.next();
             return rset.getInt("CO");
         }
         catch (SQLException e) {
            return  e.getErrorCode();
         }
     }
    
        
    public void setSessionContext( SessionContext ctx){
           this.sessionContext = ctx;
        }


    @Override
    public ArrayList<String> consulta1() {
        ArrayList<String> consulta;
        consulta = new ArrayList<String>();
        try {
            ResultSet rset;
            rset = consultaQuery1.executeQuery();
            while (rset.next()){
                String lineaConsulta = Long.toString(rset.getLong("SOLICITUD") ) + "," +
                                       Long.toString(rset.getLong("IDMATERIAPRIMA") ) + "," +
                                       Long.toString(rset.getLong("UNIDADMEDIDA") ) +  "," +
                                       Float.toString(rset.getFloat("CANTIDADFALTANTE") );
                consulta.add( lineaConsulta );
            };
            rset.close();
            return consulta;
        }
        catch (SQLException e) {
            consulta.add(e.getMessage());
           return consulta ;
        }
        catch (Exception e) {
            consulta.add(e.getMessage());
           return consulta ;
        }
    }

    @Override
    public ArrayList<String> consulta2() {
        ArrayList<String> consulta;
        consulta = new ArrayList<String>();
        try {
            ResultSet rset;
            rset = consultaQuery2.executeQuery();
            while (rset.next()){
                String lineaConsulta = Integer.toString(rset.getInt("ANNO") ) + "," +
                                       rset.getString("PAIS") + "," +
                                       rset.getString("CLIENTE") +  "," +
                                       Long.toString(rset.getLong("VENTA") );
                consulta.add( lineaConsulta );
            };
            rset.close();
            return consulta;
        }
        catch (SQLException e) {
            consulta.add(e.getMessage());
           return consulta ;
        }
        catch (Exception e) {
            consulta.add(e.getMessage());
           return consulta ;
        }
    }
}
