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
@WebService
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
                 inserta = conexion.prepareStatement("insert into solicitudro values(?,?,?,?)");
                 consulta = conexion.prepareStatement("Select * From Solicitudro");
                 actualiza = conexion.prepareStatement("Update Solicitudro set fchmaxima = ?, fchsolicitud = ?,idcliente = ? Where idsolicitud = ?");
                 borra = conexion.prepareStatement("Delete From Solicitudro Where idsolicitud = ?");
                 
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
        public Collection<Solicitudro1> getSolicitudes() {
             Collection<Solicitudro1> solicitudes;
             solicitudes = new ArrayList<Solicitudro1>();
             try {
                 ResultSet rset;
                 rset = consulta.executeQuery();
                 while (rset.next()){
                     solicitudes.add(new Solicitudro1 (rset.getDate("fchmaxima"),rset.getDate("fchsolicitud"), rset.getRef("cliente"),
                     rset.getLong("idsolicitud")
                    )
                     );
                 };
                 rset.close();
                 return solicitudes;
             }
             catch (SQLException e) {
             return solicitudes;
             }
         }
        
        @WebMethod
        public boolean insertaSolicitud(Solicitudro1 solicitud){
             try{         
                 inserta.setLong(1,solicitud.getIdsolicitud());
                 inserta.setDate(2, new java.sql.Date(solicitud.getFchsolicitud().getTime()));
                 inserta.setDate(3, new java.sql.Date(solicitud.getFchmaxima().getTime()));
                 inserta.setRef(4,solicitud.getIdcliente() );
                 inserta.executeUpdate();
                 return true;
             }
             catch (SQLException e) {
                return false;
             }
         }
        
        @WebMethod//Revisar la fecha en caso defallo pasarala a java.sql.Date
        public boolean actualizaSolicitud(Solicitudro1 solicitud){
            try {
                 actualiza.setDate(1, new java.sql.Date(solicitud.getFchmaxima().getTime()));
                 actualiza.setDate(2, new java.sql.Date(solicitud.getFchsolicitud().getTime()));
                 actualiza.setRef(3, solicitud.getIdcliente() );
                 actualiza.setLong(4, solicitud.getIdsolicitud());
                 actualiza.executeUpdate();
                 return true;
             }
             catch (SQLException e) {
                 return false;
             }
        }
        
        @WebMethod
        public boolean borraSolicitud(Solicitudro1 solicitud){
             try {
                 borra.setLong(1, solicitud.getIdsolicitud());
                 borra.executeUpdate();
                 return true;
             }
             catch (SQLException e) {
                return false;
             }
         }
        
    public void setSessionContext( SessionContext ctx){
           this.sessionContext = ctx;
        }

         
}
