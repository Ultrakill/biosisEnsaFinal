/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import algoritmo.AnalisisAsistencia;
import biz.juvitec.controladores.MarcacionControlador;
import biz.juvitec.controladores.RegistroAsistenciaControlador;
import biz.juvitec.entidades.DetalleRegistroAsistencia;
import biz.juvitec.entidades.Empleado;
import biz.juvitec.entidades.Horario;
import biz.juvitec.entidades.Marcacion;
import biz.juvitec.entidades.RegistroAsistencia;
import vistas.dialogos.DlgEmpleado;
import vistas.modelos.MTDetalleRegistroAsistencia;
import vistas.modelos.MTEmpleado;
import vistas.modelos.MTHorarioRA;
import vistas.modelos.MTMarcacion;
import vistas.modelos.MTRegistroAsistencia;
import com.personal.utiles.FormularioUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import org.jdesktop.observablecollections.ObservableCollections;
import vistas.renders.RenderAsistencia;

/**
 *
 * @author fesquivelc
 */
public class VistaRegistroAsistencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroAsistencia
     */
    private List<Empleado> empleadoList;
    private List<RegistroAsistencia> registroAsistenciaList;
    private List<DetalleRegistroAsistencia> detalleRegistroAsistenciaList;
    private List<Horario> horarioList;
    private List<Marcacion> marcacionList;

    private final RegistroAsistenciaControlador rc;
    private final MarcacionControlador mc;

    public VistaRegistroAsistencia() {
        initComponents();

        rc = new RegistroAsistenciaControlador();
        mc = new MarcacionControlador();

        inicializar();
        bindeoSalvaje();
        buscar();
        actualizarControlesNavegacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlRegistroDetalleMarcaciones = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new org.jdesktop.swingx.JXTable();
        pnlNavegacion = new javax.swing.JPanel();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        spPagina = new javax.swing.JSpinner();
        txtTotal = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        cboTamanio = new javax.swing.JComboBox();
        pnlDetalle = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDetalleAsistencia = new org.jdesktop.swingx.JXTable();
        pnlMarcaciones = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMarcacionesDia = new org.jdesktop.swingx.JXTable();
        pnlHorario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHorario = new org.jdesktop.swingx.JXTable();
        jPanel3 = new javax.swing.JPanel();
        spFechaInicio = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spFechaFin = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEmpleados = new org.jdesktop.swingx.JXTable();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("REGISTRO DE ASISTENCIA");
        setToolTipText("Aquí se muestran todas las asistencias de los empleados");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0};
        jPanel1.setLayout(jPanel1Layout);

        java.awt.GridBagLayout pnlRegistroDetalleMarcacionesLayout = new java.awt.GridBagLayout();
        pnlRegistroDetalleMarcacionesLayout.columnWidths = new int[] {0, 10, 0, 10, 0};
        pnlRegistroDetalleMarcacionesLayout.rowHeights = new int[] {0, 10, 0};
        pnlRegistroDetalleMarcaciones.setLayout(pnlRegistroDetalleMarcacionesLayout);

        pnlRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de asistencia"));
        pnlRegistro.setLayout(new java.awt.GridBagLayout());

        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlRegistro.add(jScrollPane1, gridBagConstraints);

        pnlNavegacion.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btnPrimero.setText("<<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnPrimero);

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnAnterior);

        spPagina.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spPagina.setMinimumSize(new java.awt.Dimension(60, 20));
        spPagina.setPreferredSize(new java.awt.Dimension(60, 20));
        spPagina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPaginaStateChanged(evt);
            }
        });
        pnlNavegacion.add(spPagina);

        txtTotal.setEditable(false);
        txtTotal.setColumns(3);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("1");
        pnlNavegacion.add(txtTotal);

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnSiguiente);

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnUltimo);

        cboTamanio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "40", "50" }));
        cboTamanio.setMinimumSize(new java.awt.Dimension(53, 24));
        cboTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTamanioActionPerformed(evt);
            }
        });
        pnlNavegacion.add(cboTamanio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlRegistro.add(pnlNavegacion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.3;
        pnlRegistroDetalleMarcaciones.add(pnlRegistro, gridBagConstraints);

        pnlDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la asistencia"));
        pnlDetalle.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane5.setViewportView(tblDetalleAsistencia);

        pnlDetalle.add(jScrollPane5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlRegistroDetalleMarcaciones.add(pnlDetalle, gridBagConstraints);

        pnlMarcaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Marcaciones en el día"));
        pnlMarcaciones.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane4.setViewportView(tblMarcacionesDia);

        pnlMarcaciones.add(jScrollPane4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlRegistroDetalleMarcaciones.add(pnlMarcaciones, gridBagConstraints);

        pnlHorario.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle del horario"));
        pnlHorario.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane2.setViewportView(tblHorario);

        pnlHorario.add(jScrollPane2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlRegistroDetalleMarcaciones.add(pnlHorario, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlRegistroDetalleMarcaciones, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros de búsqueda"));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3.setLayout(jPanel3Layout);

        spFechaInicio.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(spFechaInicio, gridBagConstraints);

        jLabel3.setText("Fechas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel3, gridBagConstraints);

        spFechaFin.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(spFechaFin, gridBagConstraints);

        jLabel4.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        jPanel3.add(jLabel4, gridBagConstraints);

        cboArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel3.add(cboArea, gridBagConstraints);

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jButton2, gridBagConstraints);

        jLabel2.setText("Área:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel2, gridBagConstraints);

        jButton1.setText("LIMPIAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jButton1, gridBagConstraints);

        jLabel1.setText("Empleados:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        jButton3.setText("CARGAR REGISTROS ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel3.add(jButton3, gridBagConstraints);

        jScrollPane6.setViewportView(tblEmpleados);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel3.add(jScrollPane6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jPanel2, gridBagConstraints);

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        // TODO add your handling code here:
        primero();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        anterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void spPaginaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPaginaStateChanged
        // TODO add your handling code here:
        this.seleccionPagina();
    }//GEN-LAST:event_spPaginaStateChanged

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void cboTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTamanioActionPerformed
        // TODO add your handling code here:
        this.paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }//GEN-LAST:event_cboTamanioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DlgEmpleado dialogoEmpleados = new DlgEmpleado(this);
        dialogoEmpleados.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblRegistrosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseReleased
        // TODO add your handling code here:
        mostrarDetallesRegistro();
    }//GEN-LAST:event_tblRegistrosMouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        paginaActual = 1;
        buscar();
        actualizarControlesNavegacion();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DlgEmpleado dialogo = new DlgEmpleado(this);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cboArea;
    private javax.swing.JComboBox cboTamanio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel pnlDetalle;
    private javax.swing.JPanel pnlHorario;
    private javax.swing.JPanel pnlMarcaciones;
    private javax.swing.JPanel pnlNavegacion;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlRegistroDetalleMarcaciones;
    private javax.swing.JSpinner spFechaFin;
    private javax.swing.JSpinner spFechaInicio;
    private javax.swing.JSpinner spPagina;
    private org.jdesktop.swingx.JXTable tblDetalleAsistencia;
    private org.jdesktop.swingx.JXTable tblEmpleados;
    private org.jdesktop.swingx.JXTable tblHorario;
    private org.jdesktop.swingx.JXTable tblMarcacionesDia;
    private org.jdesktop.swingx.JXTable tblRegistros;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    MTRegistroAsistencia mtRegistro;

    private void bindeoSalvaje() {
        mtRegistro = new MTRegistroAsistencia(registroAsistenciaList);
        tblRegistros.setModel(mtRegistro);
        tblRegistros.setRowHeight(25);

        MTEmpleado mtEmpleado = new MTEmpleado(empleadoList);
        tblEmpleados.setModel(mtEmpleado);
        
        MTMarcacion mtMarcacion = new MTMarcacion(marcacionList);
        tblMarcacionesDia.setModel(mtMarcacion);
        
        MTDetalleRegistroAsistencia mtDetalleRegistro = new MTDetalleRegistroAsistencia(detalleRegistroAsistenciaList);
        tblDetalleAsistencia.setModel(mtDetalleRegistro);
        
        MTHorarioRA mtHorario = new MTHorarioRA(horarioList);
        tblHorario.setModel(mtHorario);
        
        
    }

    private void inicializar() {
        this.marcacionList = ObservableCollections.observableList(new ArrayList<Marcacion>());
        this.empleadoList = ObservableCollections.observableList(new ArrayList<Empleado>());
        this.registroAsistenciaList = ObservableCollections.observableList(new ArrayList<RegistroAsistencia>());
        this.detalleRegistroAsistenciaList = ObservableCollections.observableList(new ArrayList<DetalleRegistroAsistencia>());
        this.horarioList = ObservableCollections.observableList(new ArrayList<Horario>());

        FormularioUtil.modeloSpinnerFechaHora(spFechaInicio, "dd/MM/yyyy");
        FormularioUtil.modeloSpinnerFechaHora(spFechaFin, "dd/MM/yyyy");
        
        
    }
    
    RenderAsistencia render = new RenderAsistencia();

    private int paginaActual = 1;
    private int totalPaginas = 1;
    private int tamanioPagina = 0;
    private final AnalisisAsistencia analisis = new AnalisisAsistencia();
    private void buscar() {
        Date fechaInicio = (Date) spFechaInicio.getValue();
        Date fechaFin = (Date) spFechaFin.getValue();

        tamanioPagina = Integer.parseInt(cboTamanio.getSelectedItem().toString());

        if (!empleadoList.isEmpty()) {
            analisis.analizarEmpleados(empleadoList);
            mtRegistro.setEmpleadoList(empleadoList);
            registroAsistenciaList.clear();

            registroAsistenciaList.addAll(this.listar(empleadoList, fechaInicio, fechaFin, paginaActual, tamanioPagina));

//            tblRegistros.getColumn(0).setCellRenderer(render);
//            tblRegistros.getColumn(1).setCellRenderer(render);
//            tblRegistros.getColumn(2).setCellRenderer(render);
//            tblRegistros.getColumn(3).setCellRenderer(render);
//            tblRegistros.getColumn(4).setCellRenderer(render);
            tblRegistros.packAll();
            
        }

    }

    private List<RegistroAsistencia> listar(List<Empleado> empleado, Date fechaInicio, Date fechaFin, int pagina, int tamanio) {
        List<String> dnis = obtenerDNI(empleado);
        int total = rc.contarXEmpleadoXFecha(dnis, fechaInicio, fechaFin);
        if (total % tamanio == 0) {
            totalPaginas = total / tamanio;
        } else {
            totalPaginas = (total / tamanio) + 1;
        }

        if (totalPaginas == 0) {
            totalPaginas = 1;
        }

        return this.rc.buscarXEmpleadoXFecha(dnis, fechaInicio, fechaFin, (pagina - 1) * tamanio, tamanio);

    }

    private void siguiente() {
        paginaActual++;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void ultimo() {
        paginaActual = totalPaginas;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void primero() {
        paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void anterior() {
        paginaActual--;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void seleccionPagina() {
        paginaActual = (int) spPagina.getValue();
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void actualizarControlesNavegacion() {
        spPagina.setValue(paginaActual);
        txtTotal.setText(totalPaginas + "");

        SpinnerNumberModel modeloSP = (SpinnerNumberModel) spPagina.getModel();
        Comparable<Integer> maximo = totalPaginas;
        modeloSP.setMaximum(maximo);

        this.btnSiguiente.setEnabled(paginaActual != totalPaginas);
        this.btnUltimo.setEnabled(paginaActual != totalPaginas);

        this.btnAnterior.setEnabled(paginaActual != 1);
        this.btnPrimero.setEnabled(paginaActual != 1);
    }

    private List<String> obtenerDNI(List<Empleado> empleados) {
        List<String> dnis = new ArrayList<>();
        for (Empleado empleado : empleados) {
            dnis.add(empleado.getNroDocumento());
        }
        return dnis;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!empleadoList.contains(empleado)) {
            empleadoList.add(empleado);
        } else {
            JOptionPane.showMessageDialog(this, "No puede agregar al mismo empleado dos veces", "Mensaje del Sistema", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void mostrarDetallesRegistro() {
        int fila = tblRegistros.getSelectedRow();
        if (fila != -1) {
            RegistroAsistencia registro = this.registroAsistenciaList.get(fila);

            if(registro.getDetalleRegistroAsistenciaList() == null){
                detalleRegistroAsistenciaList.clear();
            }else{
                mostrarDetalle(registro);
            }
            
            mostrarHorario(registro.getHorario());
            mostrarMarcaciones(registro.getEmpleado(), registro.getFecha());
        }
    }

    private void mostrarDetalle(RegistroAsistencia registro) {
        detalleRegistroAsistenciaList.clear();
        if (registro.getDetalleRegistroAsistenciaList() != null) {
            detalleRegistroAsistenciaList.addAll(registro.getDetalleRegistroAsistenciaList());
        }
        tblDetalleAsistencia.packAll();

    }

    private void mostrarHorario(Horario horario) {
        horarioList.clear();
        horarioList.add(horario);
        tblHorario.packAll();
    }

    private void mostrarMarcaciones(String empleado, Date fecha) {
        marcacionList.clear();
        marcacionList.addAll(mc.buscarXFecha(empleado, fecha));
        tblMarcacionesDia.packAll();
    }
}