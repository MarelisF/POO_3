//Ejercicio 18:
package com.mycompany.poopunto18;
/**
 *
 * @author USUARIO
 */
public class Formularios extends javax.swing.JFrame {

    /**
     * Creates new form Formularios
     */
    public Formularios() {
        initComponents();
    }
private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtCodigo.setText("");
        txtNombre.setText("");
        txtHorasTrabajadasMes.setText("");
        txtValorPorHora.setText("");
        txtRetencion.setText("");
        txtSalarioBruto.setText("");
        txtSalarioNeto.setText("");
        
    }   
private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
       double salariobruto,salarioneto,valorretencion,retencion;
       int codigoempleado;
       String nombres;
       double horastrabajadasalmes;
       double valorhora;
       double porcentajeretencion;
       
       horastrabajadasalmes = Double.parseDouble(txtHorasTrabajadasMes.getText());
       valorhora = Double.parseDouble(txtValorPorHora.getText());
       
       retencion = Double.parseDouble(txtRetencion.getText());
       
       porcentajeretencion = retencion/100;
       
       salariobruto = horastrabajadasalmes * valorhora;
       valorretencion = salariobruto * porcentajeretencion;
       salarioneto = salariobruto - valorretencion;
       
       txtSalarioBruto.setText(String.valueOf(salariobruto));
       txtSalarioNeto.setText(String.valueOf(salarioneto));
        
    }  
private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         System.exit(0);
    } 
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
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formularios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtHorasTrabajadasMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRetencion;
    private javax.swing.JTextField txtSalarioBruto;
    private javax.swing.JTextField txtSalarioNeto;
    private javax.swing.JTextField txtValorPorHora;
    // End of variables declaration                   
}
