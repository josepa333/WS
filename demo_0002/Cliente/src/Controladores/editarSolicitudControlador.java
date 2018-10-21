package Controladores;

import Vistas.editarSolicitud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import webservice.Solicitudro1;

public class editarSolicitudControlador implements ActionListener {
    Solicitudro1 solbase;
    editarSolicitud vista;
    
    public editarSolicitudControlador(Solicitudro1 solTem,editarSolicitud plantilla ){
        this.solbase = solTem;
        this.vista = plantilla;
        this.vista.setVisible(true);
        
        this.vista.Guardar.addActionListener(this);
        
        this.vista.solicitudID.setText(Long.toString(solbase.getIdsolicitud()) );
        this.vista.clienteID.setValue( solbase.getIdcliente());
        this.vista.fchSolicitud.setText( solbase.getFchsolicitud().toString() );
        this.vista.fchMaxima.setText( solbase.getFchmaxima().toString() );
    }
        
    private void guardaLinea(){
        
        XMLGregorianCalendar fchMax = null;
        XMLGregorianCalendar fchSol = null;
        try {
             fchMax = DatatypeFactory.newInstance().newXMLGregorianCalendar( vista.fchMaxima.getText() );//textbox
             fchSol = DatatypeFactory.newInstance().newXMLGregorianCalendar(vista.fchSolicitud.getText() );
        } catch (DatatypeConfigurationException e) {
            System.out.println(e.getMessage());
        }
        Solicitudro1 solTemp = new Solicitudro1();
        solTemp.setFchsolicitud( fchSol );
        solTemp.setFchmaxima( fchMax );
        solTemp.setIdcliente( Long.valueOf( (Integer) this.vista.clienteID.getValue()));
        solTemp.setIdsolicitud( solbase.getIdsolicitud() );
        Cookie.actualizarSolicitud(solTemp);
    }
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "Guardar":
                JOptionPane.showMessageDialog(vista,"Guardar");
                guardaLinea();
                this.vista.setVisible(false);
                break;
            default:
                break;
        } 
    }
    
}
