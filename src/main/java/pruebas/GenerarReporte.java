/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import entidades.escalafon.Empleado;
import entidades.reportes.RptAsistenciaDetallado;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import static vistas.reportes.RptRegistroAsistencia.band;

/**
 *
 * @author Documentos
 */
public class GenerarReporte implements Runnable{
    
    List<Empleado> empleados;
    
    public GenerarReporte(List<Empleado> empleados) {
        
        this.empleados = empleados;
        
        

    }

    @Override
    public void run() {
        
       
    }
    
    
    
}
