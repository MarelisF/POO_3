//Ejercicio 19:
package com.mycompany.poopunto22;

/**
 *
 * @author USUARIO
 */
public class POOpunto22 {

    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setVisible(true);
    }
}
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void tbnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtSalarioHora.setText("");
        txtNombre.setText("");
        txtNumeroHorasTrabajadas.setText("");
        txtResultado.setText("");
    }                                         

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        double salariohora,numerohoras,resultado;
        String nombre;
        nombre = (txtNombre.getText());
        salariohora = Double.parseDouble(txtSalarioHora.getText());
        numerohoras = Double.parseDouble(txtNumeroHorasTrabajadas.getText());
        
        resultado = salariohora * numerohoras;
        
        if (resultado>450000){
            txtResultado.setText(String.valueOf(nombre));
        }
        else {
            txtResultado.setText(String.valueOf(nombre+ resultado));
        }
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton tbnBorrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroHorasTrabajadas;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSalarioHora;
    // End of variables declaration                   
}
