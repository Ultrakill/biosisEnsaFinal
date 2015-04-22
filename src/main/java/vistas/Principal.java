/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import dao.DAO;
import entidades.Marcacion;
import entidades.RolAcceso;
import entidades.Usuario;
import vistas.dialogos.DlgCambiarPassword;
import vistas.mantenimientos.CRUDGrupoHorario;
import vistas.mantenimientos.CRUDHorario;
import vistas.mantenimientos.CRUDJornada;
import vistas.mantenimientos.CRUDPeriodo;
import vistas.mantenimientos.CRUDTipoPermiso;
import vistas.mantenimientos.CRUDUsuario;
import vistas.reportes.RptPermisos;
import vistas.reportes.RptRegistroAsistencia;
import vistas.reportes.RptVacaciones;
import com.personal.utiles.ImagenFondo;
import controladores.EmpleadoControlador;
import controladores.UsuarioControlador;
import entidades.escalafon.Empleado;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import utiles.UsuarioActivo;
import vistas.reportes.RptTardanzasFaltas;

/**
 *
 * @author fesquivelc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        File file = new File("img/fondo-ensa.gif");
        ImagenFondo borde;
        try {
            borde = new ImagenFondo(ImageIO.read(file));
            this.desktopPane.setBorder(borde);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jSeparator2 = new javax.swing.JSeparator();
        desktopPane = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        pnlBotnes = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JButton();
        btnMarcaciones = new javax.swing.JButton();
        btnAsignarPermiso = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        btnRegistroAsistencia = new javax.swing.JButton();
        lblJuvitec = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuMarcaciones = new javax.swing.JMenu();
        mnuVerEmpleados = new javax.swing.JMenuItem();
        mnuMarcacionesSinProcesar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        mnuHorario = new javax.swing.JMenu();
        mnuJornada = new javax.swing.JMenuItem();
        mnuHorarios = new javax.swing.JMenuItem();
        mnuGruposHorario = new javax.swing.JMenuItem();
        mnuAsignarHorario = new javax.swing.JMenuItem();
        mnuPermiso = new javax.swing.JMenu();
        mnuTiposPermiso = new javax.swing.JMenuItem();
        mnuAsignarPermiso = new javax.swing.JMenuItem();
        mnuAsignarVacaciones = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuConfiguracion = new javax.swing.JMenu();
        mnuPeriodos = new javax.swing.JMenuItem();
        mnuControlUsuario = new javax.swing.JMenuItem();
        mnuConfiguracionBD = new javax.swing.JMenuItem();
        mnuCambiarPasswd = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL DE ASISTENCIA DE PERSONAL - BIOSIS ENSA");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        desktopPane.add(jSeparator1);
        jSeparator1.setBounds(180, 30, 0, 2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1014;
        gridBagConstraints.ipady = 616;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(desktopPane, gridBagConstraints);

        java.awt.GridBagLayout pnlBotnesLayout = new java.awt.GridBagLayout();
        pnlBotnesLayout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0};
        pnlBotnesLayout.rowHeights = new int[] {0};
        pnlBotnes.setLayout(pnlBotnesLayout);

        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnEmpleados, gridBagConstraints);

        btnMarcaciones.setText("Marcaciones");
        btnMarcaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcacionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnMarcaciones, gridBagConstraints);

        btnAsignarPermiso.setText("Asignar permisos");
        btnAsignarPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarPermisoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnAsignarPermiso, gridBagConstraints);

        btnHorarios.setText("Horarios");
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnHorarios, gridBagConstraints);

        btnRegistroAsistencia.setText("Registro de asistencia");
        btnRegistroAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAsistenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(btnRegistroAsistencia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(pnlBotnes, gridBagConstraints);

        lblJuvitec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblJuvitec.setText("SERVICIOS INFORMÁTICOS JUVITEC S.R.L.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(lblJuvitec, gridBagConstraints);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(lblUsuario, gridBagConstraints);

        mnuMarcaciones.setMnemonic('e');
        mnuMarcaciones.setText("Empleados");

        mnuVerEmpleados.setMnemonic('t');
        mnuVerEmpleados.setText("Ver empleados");
        mnuVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerEmpleadosActionPerformed(evt);
            }
        });
        mnuMarcaciones.add(mnuVerEmpleados);

        mnuMarcacionesSinProcesar.setText("Marcaciones sin procesar");
        mnuMarcacionesSinProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMarcacionesSinProcesarActionPerformed(evt);
            }
        });
        mnuMarcaciones.add(mnuMarcacionesSinProcesar);

        mnuSalir.setMnemonic('x');
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuMarcaciones.add(mnuSalir);

        menuBar.add(mnuMarcaciones);

        mnuHorario.setMnemonic('f');
        mnuHorario.setText("Horarios");

        mnuJornada.setMnemonic('o');
        mnuJornada.setText("Jornadas");
        mnuJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJornadaActionPerformed(evt);
            }
        });
        mnuHorario.add(mnuJornada);

        mnuHorarios.setMnemonic('s');
        mnuHorarios.setText("Horarios");
        mnuHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHorariosActionPerformed(evt);
            }
        });
        mnuHorario.add(mnuHorarios);

        mnuGruposHorario.setText("Grupos horario");
        mnuGruposHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGruposHorarioActionPerformed(evt);
            }
        });
        mnuHorario.add(mnuGruposHorario);

        mnuAsignarHorario.setText("Asignar horario");
        mnuAsignarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarHorarioActionPerformed(evt);
            }
        });
        mnuHorario.add(mnuAsignarHorario);

        menuBar.add(mnuHorario);

        mnuPermiso.setText("Permisos");

        mnuTiposPermiso.setText("Tipos de permiso");
        mnuTiposPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTiposPermisoActionPerformed(evt);
            }
        });
        mnuPermiso.add(mnuTiposPermiso);

        mnuAsignarPermiso.setText("Asignar permiso");
        mnuAsignarPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarPermisoActionPerformed(evt);
            }
        });
        mnuPermiso.add(mnuAsignarPermiso);

        mnuAsignarVacaciones.setText("Asignar vacaciones");
        mnuAsignarVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarVacacionesActionPerformed(evt);
            }
        });
        mnuPermiso.add(mnuAsignarVacaciones);

        jMenuItem6.setText("Autorización horas extra");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuPermiso.add(jMenuItem6);

        menuBar.add(mnuPermiso);

        mnuReportes.setText("Reportes");

        jMenuItem1.setText("Reportes de asistencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem1);

        jMenuItem2.setText("Reportes de permisos / licencias / comisiones de servicio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem2);

        jMenuItem3.setText("Reportes de vacaciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem3);

        jMenuItem4.setText("Reporte de faltas y tardanzas en el día");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem4);

        menuBar.add(mnuReportes);

        mnuConfiguracion.setMnemonic('h');
        mnuConfiguracion.setText("Configuración");

        mnuPeriodos.setMnemonic('a');
        mnuPeriodos.setText("Períodos");
        mnuPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPeriodosActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuPeriodos);

        mnuControlUsuario.setText("Control de usuarios");
        mnuControlUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuControlUsuarioActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuControlUsuario);

        mnuConfiguracionBD.setText("Configuración de BD");
        mnuConfiguracionBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfiguracionBDActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuConfiguracionBD);

        mnuCambiarPasswd.setText("Cambiar contraseña");
        mnuCambiarPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarPasswdActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuCambiarPasswd);

        jMenuItem5.setText("Ejecutar SQL");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(jMenuItem5);

        menuBar.add(mnuConfiguracion);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerEmpleadosActionPerformed
        // TODO add your handling code here:
        empleados();
    }//GEN-LAST:event_mnuVerEmpleadosActionPerformed

    private void mnuConfiguracionBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfiguracionBDActionPerformed
        // TODO add your handling code here:
        Configuracion configBD = new Configuracion();
        agregarAPanel(configBD, this.getSize().width, 450);

        BasicInternalFrameUI ui = (BasicInternalFrameUI) configBD.getUI();
        Component northPane = ui.getNorthPane();
        MouseMotionListener[] motionListeners = (MouseMotionListener[]) northPane.getListeners(MouseMotionListener.class);

        for (MouseMotionListener listener : motionListeners) {
            northPane.removeMouseMotionListener(listener);
        }
    }//GEN-LAST:event_mnuConfiguracionBDActionPerformed

    private void mnuJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJornadaActionPerformed
        // TODO add your handling code here:
        CRUDJornada jornadas = new CRUDJornada();
        agregarAPanel(jornadas, true);
    }//GEN-LAST:event_mnuJornadaActionPerformed

    private void mnuHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHorariosActionPerformed
        // TODO add your handling code here:
        horarios();

    }//GEN-LAST:event_mnuHorariosActionPerformed

    private void mnuPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPeriodosActionPerformed
        // TODO add your handling code here:
        CRUDPeriodo periodos = new CRUDPeriodo();
        agregarAPanel(periodos, true);
    }//GEN-LAST:event_mnuPeriodosActionPerformed

    private void mnuGruposHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGruposHorarioActionPerformed
        // TODO add your handling code here:
        CRUDGrupoHorario grupos = new CRUDGrupoHorario();
        agregarAPanel(grupos, true);
    }//GEN-LAST:event_mnuGruposHorarioActionPerformed

    private void mnuMarcacionesSinProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMarcacionesSinProcesarActionPerformed
        // TODO add your handling code here:
        marcaciones();

    }//GEN-LAST:event_mnuMarcacionesSinProcesarActionPerformed

    private void mnuAsignarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarHorarioActionPerformed
        // TODO add your handling code here:
        FrmAsignacionHorario asignacion = new FrmAsignacionHorario();
        agregarAPanel(asignacion, true);
    }//GEN-LAST:event_mnuAsignarHorarioActionPerformed

    private void mnuTiposPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTiposPermisoActionPerformed
        // TODO add your handling code here:
        CRUDTipoPermiso tipos = new CRUDTipoPermiso();
        agregarAPanel(tipos, true);
    }//GEN-LAST:event_mnuTiposPermisoActionPerformed

    private void mnuAsignarPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarPermisoActionPerformed
        // TODO add your handling code here:
        permiso();
    }//GEN-LAST:event_mnuAsignarPermisoActionPerformed

    private void mnuAsignarVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarVacacionesActionPerformed
        // TODO add your handling code here:
        AsignarVacacion asignar = new AsignarVacacion();
        agregarAPanel(asignar, true);
    }//GEN-LAST:event_mnuAsignarVacacionesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
        empleados();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnMarcacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcacionesActionPerformed
        // TODO add your handling code here:
        marcaciones();
    }//GEN-LAST:event_btnMarcacionesActionPerformed

    private void btnAsignarPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarPermisoActionPerformed
        // TODO add your handling code here:
        permiso();
    }//GEN-LAST:event_btnAsignarPermisoActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
        // TODO add your handling code here:
        horarios();
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnRegistroAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAsistenciaActionPerformed
        // TODO add your handling code here:
        registroAsistencia();
    }//GEN-LAST:event_btnRegistroAsistenciaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        reporteAsistencia();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        reportePermiso();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        reporteVacaciones();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuControlUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuControlUsuarioActionPerformed
        // TODO add your handling code here:
        CRUDUsuario usuarios = new CRUDUsuario();
        agregarAPanel(usuarios);
    }//GEN-LAST:event_mnuControlUsuarioActionPerformed

    private void mnuCambiarPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarPasswdActionPerformed
        // TODO add your handling code here:
        DlgCambiarPassword passwd = new DlgCambiarPassword(this, UsuarioActivo.getUsuario(), true);
        passwd.setVisible(true);
    }//GEN-LAST:event_mnuCambiarPasswdActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        RptTardanzasFaltas tyf = new RptTardanzasFaltas();
        agregarAPanel(tyf, true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        agregarAPanel(new EjecutarSQL(),true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        agregarAPanel(new AsignarAutorizacion(), true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarPermiso;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnMarcaciones;
    private javax.swing.JButton btnRegistroAsistencia;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblJuvitec;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAsignarHorario;
    private javax.swing.JMenuItem mnuAsignarPermiso;
    private javax.swing.JMenuItem mnuAsignarVacaciones;
    private javax.swing.JMenuItem mnuCambiarPasswd;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenuItem mnuConfiguracionBD;
    private javax.swing.JMenuItem mnuControlUsuario;
    private javax.swing.JMenuItem mnuGruposHorario;
    private javax.swing.JMenu mnuHorario;
    private javax.swing.JMenuItem mnuHorarios;
    private javax.swing.JMenuItem mnuJornada;
    private javax.swing.JMenu mnuMarcaciones;
    private javax.swing.JMenuItem mnuMarcacionesSinProcesar;
    private javax.swing.JMenuItem mnuPeriodos;
    private javax.swing.JMenu mnuPermiso;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuTiposPermiso;
    private javax.swing.JMenuItem mnuVerEmpleados;
    private javax.swing.JPanel pnlBotnes;
    // End of variables declaration//GEN-END:variables

    private void agregarAPanel(JInternalFrame internal) {
        this.agregarAPanel(internal, false);
    }
    Dimension minimo = new Dimension(1024, 628);
    private void agregarAPanel(JInternalFrame internal, boolean maximizar) {
        if (!this.desktopPane.isAncestorOf(internal)) {
            this.desktopPane.add(internal);
            internal.setVisible(true);
            try {
                
                internal.setMinimumSize(minimo);
                internal.setPreferredSize(minimo);
//                internal.setMaximumSize(minimo);
                internal.setMaximum(maximizar);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void agregarAPanel(JInternalFrame internal, int ancho, int largo) {
        if (!this.desktopPane.isAncestorOf(internal)) {
            this.desktopPane.add(internal);
            internal.setSize(ancho, largo);
            internal.setVisible(true);
            Dimension desktopSize = desktopPane.getSize();
            Dimension jInternalFrameSize = internal.getSize();
            internal.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
        }
    }

    private void empleados() {
        VistaEmpleado ve = new VistaEmpleado();
        agregarAPanel(ve, true);
    }

    private void marcaciones() {
        VistaMarcaciones marcaciones = new VistaMarcaciones();
        agregarAPanel(marcaciones, true);
    }

    private void permiso() {
        AsignarPermiso asignar = new AsignarPermiso();
        agregarAPanel(asignar, true);
    }

    private void horarios() {
        CRUDHorario horarios = new CRUDHorario();
        agregarAPanel(horarios, true);
    }

    private void registroAsistencia() {
        VistaRegistroAsistencia registroAsistencia = new VistaRegistroAsistencia();
        agregarAPanel(registroAsistencia, true);
    }

    private final EmpleadoControlador ec = new EmpleadoControlador();
    private final DateFormat dfTimestamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private final UsuarioControlador uc = new UsuarioControlador();
    public void setUsuario(Usuario u) {
        if (u != null) {
            UsuarioActivo.setUsuario(u);
            Empleado e = u.getEmpleado();
            lblUsuario.setText("Empleado: "+e.getPaterno()+" "+e.getMaterno()+" "+e.getNombre()+" | Usuario: " + u.getLogin() + " | Rol: " + u.getRol().getNombre()+" | Ult. inicio de sesión: "+(u.getUltimoInicio() != null ? dfTimestamp.format(u.getUltimoInicio()) : dfTimestamp.format(new Date()))+" |");
            this.habilitarMenu();
            if(u.getUltimoInicio() == null){
                
            }else{
                u.setUltimoInicio(new Date());
            }
            
            uc.modificar(u);
        } else {
            System.out.println("USUARIO NULL =(");
        }
    }

    private void reporteAsistencia() {
        RptRegistroAsistencia asistencia = new RptRegistroAsistencia();
        agregarAPanel(asistencia, true);
    }

    private void reportePermiso() {
        RptPermisos permisos = new RptPermisos();
//        agregarAPanel(permisos, 1024, 864);
        agregarAPanel(permisos, true);
    }

    private void reporteVacaciones() {
        RptVacaciones vacaciones = new RptVacaciones();
        agregarAPanel(vacaciones, true);
    }
    
    private void habilitarMenu(){
        List<RolAcceso> accesos = UsuarioActivo.getUsuario().getRol().getRolAccesoList();
        
        boolean horario = false;
        boolean periodo = false;
        boolean permiso = false;
        boolean vacacion = false;
        boolean reportes = false;
        boolean configuracion = false;
        
        //Permiso para los botones
        boolean botonEmpleados = false;
        boolean botonMarcaciones = false;
        boolean botonAsignarPermiso = false;
        boolean botonHorarios = false;
        boolean botonRegistroAsistencia = false;
        
        for(RolAcceso acceso : accesos){
            if(acceso.getAcceso().getClase().equals("HORARIO")){
                horario = true;
                botonEmpleados = true;
                botonMarcaciones = true;
                botonHorarios = true;
              
            }
            else if(acceso.getAcceso().getClase().equals("PERIODO")){
                periodo = true;
                botonAsignarPermiso =true;
                
            }
            else if(acceso.getAcceso().getClase().equals("PERMISO")){
                permiso = true;
                botonAsignarPermiso =true;
            }
            else if(acceso.getAcceso().getClase().equals("VACACION")){
                vacacion = true;
            }
            else if(acceso.getAcceso().getClase().equals("REPORTES")){
                reportes = true;
            }else if(acceso.getAcceso().getClase().equals("CONFIGURACION")){
                configuracion = true;
                botonRegistroAsistencia = true;
            }
        }
        
        mnuHorario.setEnabled(horario);
        mnuPeriodos.setEnabled(periodo);
        mnuTiposPermiso.setEnabled(permiso);
        mnuAsignarPermiso.setEnabled(permiso);
        mnuAsignarVacaciones.setEnabled(vacacion);
        mnuReportes.setEnabled(reportes);
//        mnuUsuarios.setEnabled(configuracion);
        mnuConfiguracionBD.setEnabled(configuracion);
//        mnuRolUsuario.setEnabled(configuracion);
        mnuControlUsuario.setEnabled(configuracion);
        
        btnEmpleados.setEnabled(botonEmpleados);
        btnMarcaciones.setEnabled(botonMarcaciones);
        btnAsignarPermiso.setEnabled(botonAsignarPermiso);
        btnHorarios.setEnabled(botonHorarios);
        btnRegistroAsistencia.setEnabled(botonRegistroAsistencia);
    }
}
