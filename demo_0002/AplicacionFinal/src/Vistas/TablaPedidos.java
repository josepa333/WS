package Vistas;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import webservice.Solicitudro1;


public class TablaPedidos {
    
    
    public void ver_tabla(JTable pTabla,ArrayList<Solicitudro1> pedidos){
        
        pTabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tablaPredeterminada = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        
        tablaPredeterminada.addColumn("ID Solicitud");
        tablaPredeterminada.addColumn("Fecha Solicitud");
        tablaPredeterminada.addColumn("Fecha Máxima");
        tablaPredeterminada.addColumn("ID Cliente");
        tablaPredeterminada.addColumn("Detallas");
        tablaPredeterminada.addColumn("Editar");
        tablaPredeterminada.addColumn("Borrar");
        JButton botonDetalles = new JButton("Detalles");
        JButton botonEditar = new JButton("Editar");
        JButton botonBorrar = new JButton("Borrar");
        
        Object fila[] = new Object[7];
            
        if(pedidos.size() > 0){
            for(int i=0; i<pedidos.size(); i++){
                //fila[0] = propiedades.get(i).getClass().toString().replace("class modelo.", "");
                fila[0] = Long.toString(pedidos.get(i).getIdsolicitud());
                fila[1] = pedidos.get(i).getFchsolicitud();
                fila[2] = pedidos.get(i).getFchmaxima();
                fila[3] = pedidos.get(i).getIdcliente();
                fila[4] = botonDetalles;
                fila[5] = botonEditar;
                fila[6] = botonBorrar;
                tablaPredeterminada.addRow(fila);
            }
        }
        
        else{
            fila[0] = "";
            fila[1] = "";
            fila[2] = "";
            fila[3] = "";
            fila[4] =botonDetalles;
            fila[5] = botonEditar;
            fila[6] = botonBorrar;
            tablaPredeterminada.addRow(fila);
        }
        pTabla.setModel(tablaPredeterminada);
        pTabla.setRowHeight(30);
    }
}
