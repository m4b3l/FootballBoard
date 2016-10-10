/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafootballboard.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafootballboard.Controller.ArchivoController;
import javafootballboard.Model.Equipo;
import javafootballboard.Model.Jugador;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Mabel
 */
public class EquipoRegistro extends javax.swing.JFrame {
    
    private ArrayList<JTextField> names;
    private ArrayList<JTextField> lastnames;
    private ArrayList<JTextField> positions;
    private Equipos equipoActual;

    /**
     * Creates new form EquipoRegistro
     */
    public EquipoRegistro() {
        CargarAmbiente();
    }
    
    public EquipoRegistro(Equipos equipoActual){
        CargarAmbiente();
        this.equipoActual = equipoActual;
    }
    
    public void CargarAmbiente(){
        initComponents();
        names = new ArrayList<>();
        lastnames = new ArrayList<>();
        positions = new ArrayList<>();
        
        /**Getting name boxes*/
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);
        
        /**Getting lastname boxes*/
        lastnames.add(lastname1);
        lastnames.add(lastname2);
        lastnames.add(lastname3);
        lastnames.add(lastname4);
        lastnames.add(lastname5);
        
        /**Getting position boxes*/
        positions.add(position1);
        positions.add(position2);
        positions.add(position3);
        positions.add(position4);
        positions.add(position5);
        
        mensajeError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreEquipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        lastname1 = new javax.swing.JTextField();
        position1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name2 = new javax.swing.JTextField();
        lastname2 = new javax.swing.JTextField();
        position2 = new javax.swing.JTextField();
        name3 = new javax.swing.JTextField();
        lastname3 = new javax.swing.JTextField();
        position3 = new javax.swing.JTextField();
        name4 = new javax.swing.JTextField();
        lastname4 = new javax.swing.JTextField();
        position4 = new javax.swing.JTextField();
        name5 = new javax.swing.JTextField();
        lastname5 = new javax.swing.JTextField();
        position5 = new javax.swing.JTextField();
        mensajeError = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Registre su equipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 30, -1, -1));

        jLabel2.setText("Nombre de equipo: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 83, -1, -1));
        getContentPane().add(nombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 80, 160, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 152, -1, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 152, -1, -1));

        jLabel5.setText("Posición");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 152, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Agregue sus jugadores");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 126, -1, -1));
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 172, 103, -1));
        getContentPane().add(lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 172, 129, -1));
        getContentPane().add(position1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 172, 118, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 322, -1, -1));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 322, -1, -1));
        getContentPane().add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 198, 103, -1));
        getContentPane().add(lastname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 198, 129, -1));
        getContentPane().add(position2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 198, 118, -1));
        getContentPane().add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 224, 103, -1));
        getContentPane().add(lastname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 224, 129, -1));
        getContentPane().add(position3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 224, 118, -1));
        getContentPane().add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 250, 103, -1));
        getContentPane().add(lastname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 250, 129, -1));
        getContentPane().add(position4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 118, -1));
        getContentPane().add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 276, 103, -1));
        getContentPane().add(lastname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 276, 129, -1));
        getContentPane().add(position5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 276, 118, -1));

        mensajeError.setForeground(new java.awt.Color(255, 0, 0));
        mensajeError.setText("Error");
        getContentPane().add(mensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 60, 364, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javafootballboard/Assets/WhatsApp Image 2016-10-01 at 23.51.22.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mensajeError.setVisible(false);
        if(nombreEquipo.getText().length() == 0 ){
            mensajeError.setText("El nombre del equipo no puede estar vacío");
            mensajeError.setVisible(true);
            return;
        }
        Boolean alert = true;
        for(int i=0; i<5; i++){
            if( names.get(i).getText().length() == 0 || 
                    lastnames.get(i).getText().length() == 0 || 
                    positions.get(i).getText().length() == 0){
            }else{
                alert = false;
            }
        }
        if(alert){
            mensajeError.setText("Debe completar las 3 casillas si quiere guardar el jugador.");
            mensajeError.setVisible(true);
            return;
        }
        Equipo equipo = new Equipo(nombreEquipo.getText());
        for(int i=0; i<5; i++){
            if( names.get(i).getText().length() != 0 && 
                    lastnames.get(i).getText().length() != 0 && 
                    positions.get(i).getText().length() != 0){
                Jugador jugador = new Jugador(names.get(i).getText(), 
                        lastnames.get(i).getText(), positions.get(i).getText());
                equipo.agregarJugador(jugador);
                ArchivoController.ac.jugadores.put(names.get(i).getText()+" "+lastnames.get(i).getText(), jugador);
            }
        }
        ArchivoController.ac.equipos.put(nombreEquipo.getText(), equipo);
        equipoActual.setManualText("El equipo fue cargado exitosamente!", true);
        equipoActual.desactivarManual();
        equipoActual.cargarEquipos();
        equipoActual.setEnabled(true);
        try {
            ArchivoController.ac.actEquipos();
        } catch (IOException ex) {
            Logger.getLogger(EquipoRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        equipoActual.setManualText("Ningun equipo fue cargado manualmente", false);
        equipoActual.desactivarManual();
        equipoActual.setEnabled(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EquipoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquipoRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastname1;
    private javax.swing.JTextField lastname2;
    private javax.swing.JTextField lastname3;
    private javax.swing.JTextField lastname4;
    private javax.swing.JTextField lastname5;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField name4;
    private javax.swing.JTextField name5;
    private javax.swing.JTextField nombreEquipo;
    private javax.swing.JTextField position1;
    private javax.swing.JTextField position2;
    private javax.swing.JTextField position3;
    private javax.swing.JTextField position4;
    private javax.swing.JTextField position5;
    // End of variables declaration//GEN-END:variables
}
