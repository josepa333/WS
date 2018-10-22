package Vistas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaConsulta2 {
    
    public void ver_tabla(JTable pTabla,ArrayList<String> consulta){
        
        pTabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tablaPredeterminada = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        
        tablaPredeterminada.addColumn("ANNO");
        tablaPredeterminada.addColumn("PAIS");
        tablaPredeterminada.addColumn("CLIENTE");
        tablaPredeterminada.addColumn("VENTA");
        
        Object fila[] = new Object[4];
            
        if(consulta.size() > 0){
            for(int i=0; i<consulta.size(); i++){
                String lineaConsulta[] = new String[4];
                lineaConsulta = consulta.get(i).split(",");
                fila[0] = lineaConsulta[0];
                fila[1] = lineaConsulta[1];
                fila[2] = lineaConsulta[2];
                fila[3] = lineaConsulta[3];
                tablaPredeterminada.addRow(fila);
            }
        }
        
        else{
            fila[0] = "";
            fila[1] = "";
            fila[2] = "";
            fila[3] = "";
            tablaPredeterminada.addRow(fila);
        }
        pTabla.setModel(tablaPredeterminada);
        pTabla.setRowHeight(30);
    }
}
