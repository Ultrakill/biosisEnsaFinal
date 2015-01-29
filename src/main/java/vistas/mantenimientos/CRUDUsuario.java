/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.mantenimientos;

import controladores.Controlador;
import controladores.EmpleadoControlador;
import controladores.UsuarioControlador;
import entidades.Empleado;
import entidades.Rol;
import entidades.Usuario;
import vistas.dialogos.DlgEmpleado;
import vistas.dialogos.DlgRol;
import vistas.modelos.MTJornada;
import com.personal.utiles.FormularioUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.text.DateFormatter;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import utiles.Encriptador;

/**
 *
 * @author fesquivelc
 */
public class CRUDUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CRUDJornada
     */
    private int accion;
    private final UsuarioControlador usuarioControlador;
    private final EmpleadoControlador empleadoControlador;
    private List<Usuario> usuarioList;
    private Empleado empleadoSeleccionado;
    private Rol rolSeleccionado;

    public CRUDUsuario() {
        initComponents();
        usuarioControlador = new UsuarioControlador();
        empleadoControlador = new EmpleadoControlador();
        bindeoSalvaje();
        accion = 0;
        this.controles(accion);
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

        pnlDatosJornada = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chkCambiarContraseña = new javax.swing.JCheckBox();
        txtRol = new javax.swing.JTextField();
        txtEmpleado = new javax.swing.JTextField();
        btnRol = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        btnEmpleado = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlListado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new org.jdesktop.swingx.JXTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Mantenimiento usuarios");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlDatosJornada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de usuario"));
        pnlDatosJornada.setLayout(new java.awt.GridBagLayout());

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setText("Rol:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel3.setText("Empleado:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel9.setText("Nombre de usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtLogin, gridBagConstraints);

        jLabel11.setText("¿Cambiar contraseña al iniciar?:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel11, gridBagConstraints);

        chkCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCambiarContraseñaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(chkCambiarContraseña, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtRol, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtEmpleado, gridBagConstraints);

        btnRol.setText("...");
        btnRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(btnRol, gridBagConstraints);

        jLabel2.setText("¿Activo?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(chkActivo, gridBagConstraints);

        btnEmpleado.setText("...");
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(btnEmpleado, gridBagConstraints);

        txtPassword.setText("jPasswordField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtPassword, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlDatosJornada.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 0.1;
        pnlDatosJornada.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.ipady = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlDatosJornada, gridBagConstraints);

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
        java.awt.GridBagLayout pnlListadoLayout = new java.awt.GridBagLayout();
        pnlListadoLayout.columnWidths = new int[] {0};
        pnlListadoLayout.rowHeights = new int[] {0, 5, 0};
        pnlListado.setLayout(pnlListadoLayout);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevo);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pnlListado.add(jPanel4, gridBagConstraints);

        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlListado.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 310;
        gridBagConstraints.ipady = 395;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlListado, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.accion = Controlador.NUEVO;
        usuarioControlador.prepararCrear();
        this.controles(accion);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int fila = this.tblUsuarios.getSelectedRow();
        if (fila != -1) {
            this.accion = Controlador.MODIFICAR;
            this.usuarioControlador.setSeleccionado(this.usuarioList.get(fila));
            this.mostrar(usuarioControlador.getSeleccionado());
            this.controles(accion);
            FormularioUtil.activarComponente(txtLogin, false);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.accion = Controlador.ELIMINAR;
        int fila = tblUsuarios.getSelectedRow();
        if (fila != -1 && FormularioUtil.dialogoConfirmar(this, accion)) {
            if (usuarioControlador.accion(accion)) {
                FormularioUtil.mensajeExito(this, accion);
                this.accion = 0;
                this.actualizarTabla();
            } else {
                FormularioUtil.mensajeError(this, accion);
            }

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseReleased
        // TODO add your handling code here:
        int fila = tblUsuarios.getSelectedRow();
        if (fila != -1) {
            mostrar(usuarioList.get(fila));
        }

    }//GEN-LAST:event_tblUsuariosMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.accion = 0;
        this.controles(accion);
        FormularioUtil.limpiarComponente(this.pnlDatosJornada);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (FormularioUtil.dialogoConfirmar(this, accion)) {
            Usuario seleccionado = usuarioControlador.getSeleccionado();

            FormularioUtil.convertirMayusculas(this.pnlDatosJornada);

            if (accion == Controlador.NUEVO) {
                seleccionado.setLogin(txtLogin.getText());
            }
            String password = new String(txtPassword.getPassword());
            seleccionado.setPassword(Encriptador.encrypt(password));
            seleccionado.setActivo(chkActivo.isSelected());
            seleccionado.setCambiarPassword(chkCambiarContraseña.isSelected());
            seleccionado.setEmpleado(empleadoSeleccionado.getNroDocumento());
            seleccionado.setRol(rolSeleccionado);
            
            

            if (usuarioControlador.accion(accion)) {
                FormularioUtil.mensajeExito(this, accion);
                this.accion = 0;
                this.controles(accion);
                this.actualizarTabla();
            } else {
                FormularioUtil.mensajeError(this, accion);
            }

        } else {
            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void chkCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCambiarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCambiarContraseñaActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        // TODO add your handling code here:
        DlgEmpleado dlg = new DlgEmpleado(this);        
        empleadoSeleccionado = dlg.getSeleccionado();
        if(empleadoSeleccionado != null){
            txtEmpleado.setText(empleadoSeleccionado.getApellidoPaterno() + " " + empleadoSeleccionado.getApellidoMaterno() + " " +empleadoSeleccionado.getNombre());
        }
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolActionPerformed
        // TODO add your handling code here:
        DlgRol roles = new DlgRol(this);
        rolSeleccionado = roles.getRolSeleccionado();
        if(rolSeleccionado != null){
            txtRol.setText(rolSeleccionado.getNombre());
        }
    }//GEN-LAST:event_btnRolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRol;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JCheckBox chkCambiarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatosJornada;
    private javax.swing.JPanel pnlListado;
    private org.jdesktop.swingx.JXTable tblUsuarios;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables

    private void modeloHoraSpinner(JSpinner spinner) {
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "HH:mm");
        DateFormatter formatter = (DateFormatter) editor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false); // this makes what you want
        formatter.setOverwriteMode(true);
        spinner.setEditor(editor);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.AM_PM, Calendar.AM);
        spinner.setValue(cal.getTime());
    }

    private void modeloFechaSpinner(JSpinner spinner) {
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yyyy");
        DateFormatter formatter = (DateFormatter) editor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false); // this makes what you want
        formatter.setOverwriteMode(true);
        spinner.setEditor(editor);
    }

    private void controles(int accion) {
        boolean bandera = accion == Controlador.NUEVO || accion == Controlador.MODIFICAR;

        FormularioUtil.activarComponente(this.pnlListado, !bandera);
        FormularioUtil.activarComponente(this.pnlDatosJornada, bandera);
        this.txtEmpleado.setEditable(false);
        this.txtRol.setEditable(false);

        if (accion != Controlador.MODIFICAR) {
            FormularioUtil.limpiarComponente(this.pnlDatosJornada);
        }

    }

    private void bindeoSalvaje() {
        usuarioList = new ArrayList<>();
        usuarioList = ObservableCollections.observableList(usuarioList);
        
        JTableBinding tablaBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ, usuarioList, tblUsuarios);

        BeanProperty pLogin = BeanProperty.create("login");
        BeanProperty pRol = BeanProperty.create("rol.nombre");
        BeanProperty pActivo = BeanProperty.create("activo");
        BeanProperty pEmpleado = BeanProperty.create("empleado");
        
        tablaBinding.addColumnBinding(pEmpleado).setColumnName("Nro de documento").setEditable(false).setColumnClass(String.class);
        tablaBinding.addColumnBinding(pLogin).setColumnName("Nombre de usuario").setEditable(false).setColumnClass(String.class);
        tablaBinding.addColumnBinding(pRol).setColumnName("Rol").setEditable(false).setColumnClass(String.class);
        tablaBinding.addColumnBinding(pActivo).setColumnName("Rol").setEditable(false).setColumnClass(Boolean.class);
        
        tablaBinding.bind();
        this.actualizarTabla();
    }

    private void mostrar(Usuario seleccionado) {
        txtLogin.setText(seleccionado.getLogin());
//        txtPassword.setText(Encriptador.decrypt(seleccionado.getPassword()));
        chkActivo.setSelected(seleccionado.isActivo());
        
        chkCambiarContraseña.setSelected(seleccionado.isCambiarPassword());
        empleadoSeleccionado = empleadoControlador.buscarPorId(seleccionado.getEmpleado());
        if(empleadoSeleccionado != null){
            txtEmpleado.setText(empleadoSeleccionado.getApellidoPaterno() + " " + empleadoSeleccionado.getApellidoMaterno() + " "+empleadoSeleccionado.getNombre());
        }
        txtRol.setText(seleccionado.getRol().getNombre());
        
    }

    private void actualizarTabla() {
        usuarioList.clear();
        usuarioList.addAll(usuarioControlador.buscarTodos());
        tblUsuarios.packAll();
    }

}
