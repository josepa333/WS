package Controladores;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Vistas.crearPedido;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import javax.xml.datatype.XMLGregorianCalendar;

import webservice.LineaSolicitud;
import webservice.Solicitudro1;


public class crearPedidoControlador implements ActionListener{
    
    
    private crearPedido vista;
    private ArrayList<LineaSolicitud> lineas;
    private int idContador;
    
    public crearPedidoControlador(crearPedido vista) {
        this.vista = vista;
        this.idContador = Cookie.getTotalLineasSolicitudes() + 1;//cambiar a lineas
        this.vista.setVisible(true);
        lineas = new ArrayList<>();
        this.vista.anadeLineaBT.addActionListener(this);
        this.vista.borrarLineaBT.addActionListener(this);
        this.vista.crearPedidoBT.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "Agregar linea":
                JOptionPane.showMessageDialog(vista,"Agregar linea");
                anadeLinea();
                break;
            case "Borrar linea":
                JOptionPane.showMessageDialog(vista,"Borrar linea");
                borraLinea();
                break;
             case "Crear pedido":
                JOptionPane.showMessageDialog(vista,"Implementar Web service");
                insertaLineas();
                this.vista.setVisible(false);
                break;
            default:
                JOptionPane.showMessageDialog(vista,"Ninguna de las opciones registradas");
                break;
        } 
    }
    
    private void insertaLineas(){
        //solicitud
        int idActual = (Integer) vista.idPedido.getValue();
        XMLGregorianCalendar fchMax = null;
        XMLGregorianCalendar fchSol = null;
        try {
             fchMax = DatatypeFactory.newInstance().newXMLGregorianCalendar( vista.fchMaximaTX.getText() );//textbox
             fchSol = DatatypeFactory.newInstance().newXMLGregorianCalendar(vista.fchPedidoTX.getText() );
        } catch (DatatypeConfigurationException e) {
            System.out.println(e.getMessage());
        }
        
        Solicitudro1 solTemp = new Solicitudro1();
        solTemp.setFchsolicitud( fchSol );
        solTemp.setFchmaxima( fchMax );
        solTemp.setIdcliente( Long.valueOf( (Integer) vista.clienteID.getValue()));
        solTemp.setIdsolicitud(Long.valueOf( idActual) );
        Cookie.insertaSolicitud(solTemp);
        
        //lineas
        for (LineaSolicitud temp : lineas) {
            System.out.println("es: " + temp.getIdlineasolicitud());
            Cookie.insertaLinea(temp);    
        }
    }
    
    
    private void anadeLinea(){
        int talla =(Integer) vista.tallaID.getValue();
        int cantidad = (Integer) vista.cantidadSN.getValue();
        int prenda = (Integer) vista.prendaID.getValue();
        int idActual = (Integer) vista.idPedido.getValue();
        String item = "Prenda: "  + Integer.toString((Integer) vista.prendaID.getValue())+ " Talla: ";
        item += Integer.toString((Integer)vista.tallaID.getValue()) + " Cantidad: ";
        item += Integer.toString(cantidad);
        item += " Orden: " + Integer.toString( (Integer) vista.ordenID.getValue()  );
        vista.listaLineas.add(item);
        
        LineaSolicitud tmp = new LineaSolicitud();
        tmp.setCantidad(cantidad);
        tmp.setIdprenda( prenda);
        tmp.setIdtalla(talla);
        tmp.setIdlineasolicitud( idContador );
        idContador ++;
        tmp.setIdordenproduccion( Long.valueOf((Integer) vista.ordenID.getValue()) );
        tmp.setIdsolicitud(Long.valueOf( idActual));
        lineas.add( tmp  );
    }
    
    
    private void borraLinea(){
       int pos = vista.listaLineas.getSelectedIndex();
       vista.listaLineas.remove(pos); 
       lineas.remove(pos);
    }
}