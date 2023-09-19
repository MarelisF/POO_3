EJERCICIO 23:
package com.mycompany.poopunto23;

/**
 *
 * @author USUARIO
 */
public class POOpunto23 {

    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setVisible(true);
    }
}
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        txtResultado.setText("");
        txtNumC.setText("");
        txtNumB.setText("");
        txtNumA.setText("");
    }                                         

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        double a,b,c,d,r1,r2,r3,r4,r5,real,imag;
        a = Double.parseDouble(txtNumA.getText());
        b = Double.parseDouble(txtNumB.getText());
        c = Double.parseDouble(txtNumC.getText());
        //Discriminante
        d = (Math.pow(b,2)) - 4*a*c;
        if (d==0){
            r1 = -b/2*a;
            txtResultado.setText(String.valueOf(r1));
        }
        else if (d>0){
            r2 = (-b+(Math.sqrt(d)))/(2*a);
            r3 = (-b-(Math.sqrt(d)))/(2*a);
            txtResultado.setText(String.valueOf(r2+ ", "+r3));
            
        }
        else{
            real = -b/2*a;
            imag = Math.sqrt(-d)/2*a;
            txtResultado.setText(String.valueOf(real+ "+"+ imag+ "i"+ ", "+ real+ "-"+ imag+ "i"));
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
    private javax.swing.JTextField txtNumA;
    private javax.swing.JTextField txtNumB;
    private javax.swing.JTextField txtNumC;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration                   
}

