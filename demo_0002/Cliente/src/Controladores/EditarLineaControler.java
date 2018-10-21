package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vistas.editarLineaSolicitud;

import webservice.LineaSolicitud;

public class EditarLineaControler  implements ActionListener {
    private LineaSolicitud lineaIDs;
    private editarLineaSolicitud vista;
      
    public EditarLineaControler(LineaSolicitud linea, editarLineaSolicitud  pVista) {
        this.vista = pVista;
        this.lineaIDs = linea;
        this.vista.setVisible(true);
        
        vista.Guardar.addActionListener(this);
        vista.ordenID.setText( Long.toString(lineaIDs.getIdordenproduccion() ));
        vista.solicitudID.setText( Long.toString(lineaIDs.getIdsolicitud()));
        vista.lineaID.setText( Integer.toString(lineaIDs.getIdlineasolicitud()));
        
        vista.cantidadID.setValue( lineaIDs.getCantidad()  );
        vista.tallaID.setValue( lineaIDs.getIdtalla());
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "Guardar":
                JOptionPane.showMessageDialog(vista,"Guardado");
                guardarLinea();
                break;
            default:
                JOptionPane.showMessageDialog(vista,"Ninguna de las opciones registradas");
                break;
        } 
    }
    
    private void guardarLinea(){
    
        
        LineaSolicitud tmpLinea  = new LineaSolicitud();
        tmpLinea.setCantidad( (Integer) vista.cantidadID.getValue() );
        tmpLinea.setIdtalla( (Integer) vista.tallaID.getValue() );
        tmpLinea.setIdprenda( (Integer) vista.prendaID.getValue() );
        tmpLinea.setIdsolicitud(lineaIDs.getIdsolicitud() );
        tmpLinea.setIdordenproduccion( lineaIDs.getIdordenproduccion());
        tmpLinea.setIdlineasolicitud(lineaIDs.getIdlineasolicitud() );
        Cookie.actualizarLinea(tmpLinea);
    }
}
