EJERCICIO 10:
package com.mycompany.poopunto10;

/**
 *
 * @author USUARIO
 */
public class POOpunto10 {

    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setVisible(true);
    }
}
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtNumeroInscripcion.setText("");
        txtNombres.setText("");
        txtPatrimonio.setText("");
        txtEstratoSocial.setText("");
        txtPagoMatricula.setText("");
    }                                         

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        double patrimonio,estrato,nombre,numero,pago,pagoadi;
        estrato = Double.parseDouble(txtEstratoSocial.getText());
        patrimonio = Double.parseDouble(txtPatrimonio.getText());
        pago = 50000;
        pagoadi = pago+0.03*patrimonio;
        if (patrimonio>2000000){
            if (estrato>3){
                txtPagoMatricula.setText(String.valueOf(pagoadi));
            }
        }
        else{
            txtPagoMatricula.setText(String.valueOf(pago));
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
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEstratoSocial;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroInscripcion;
    private javax.swing.JTextField txtPagoMatricula;
    private javax.swing.JTextField txtPatrimonio;
    // End of variables declaration                   
}
