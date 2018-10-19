package ws;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
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
import java.util.Collection;


@Stateless(name = "SessionEJB", mappedName = "WS-WS-SessionEJB")
@TransactionManagement(TransactionManagementType.BEAN)
@WebService
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
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

    public SessionEJBBean() {
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
             inserta = conexion.prepareStatement("insert into solicitud values(?,?,?,?)");
             consulta = conexion.prepareStatement("Select * From solicitudro");
             actualiza = conexion.prepareStatement("Update Solicitud set fchmaxima = ?, fchsolicitud = ?,idcliente = ? Where idsolicitud = ?");
             borra = conexion.prepareStatement("Delete From Solicitud Where idsolicitud = ?");
             
             //Lineas
             insertaLineas = conexion.prepareStatement("Insert into Lineasolicitud Values(?,?,?,?,?,?)");
             consultaLineas = conexion.prepareStatement("Select * From Lineasolicitud");
             actualizaLineas = conexion.prepareStatement("Update lineaSolicitud set cantidad = ?, idtalla = ?, idprenda = ? Where idlineasolicitud = ?");
             borraLineas = conexion.prepareStatement("Delete From Lineasolicitud Where idlineasolicitud = ?");

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
           listaConexiones.get(indice).commit();
           return true;
        }
        catch (SQLException e){
           return false;
        }
    }
   
    @WebMethod
    public Collection<Solicitudro> getSolicitudes() {
         Collection<Solicitudro> solicitudes;
         solicitudes = new ArrayList<Solicitudro>();
         try {
             ResultSet rset;
             rset = consulta.executeQuery();
             while (rset.next()){
                 solicitudes.add(new Solicitudro((Cliente) rset.getObject("idcliente"), 
                                                 rset.getDate("fchmaxima"),
                                                 rset.getDate("fchsolicitud"),
                                                 rset.getLong("idsolicitud"),
                                                 (Collection<Ref>) rset.getRef("lineassolicitud"))
                 );
             };
             rset.close();
             return solicitudes;
         }
         catch (SQLException e) {
         return solicitudes;
         }
     }


    @Override
    public boolean insertaSolicitud(Solicitudro solicitud) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean actualizaSolicitud(Solicitudro solicitud) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean borraSolicitud(Solicitudro solicitud) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean insertaLineasSolicitud(Lineasolicitudro lineaSolicitud) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean actualizaLineasSolicitud(Lineasolicitudro lineaSolicitud) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean borraLineasSolicitud(Lineasolicitudro lineaSolicitud) {
        // TODO Implement this method
        return false;
    }

    @Override
    public Collection<Lineasolicitudro> getLineaSolicitudes() {
        // TODO Implement this method
        return Collections.emptySet();
    }
}
