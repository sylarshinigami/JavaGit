/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagit;

/**
 *
 * @author pirata
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    
    double res=0;
    
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Suma = new javax.swing.JButton();
        Numero1 = new javax.swing.JButton();
        Numero2 = new javax.swing.JButton();
        Numero3 = new javax.swing.JButton();
        Numero4 = new javax.swing.JButton();
        Numero5 = new javax.swing.JButton();
        Numero6 = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Numero7 = new javax.swing.JButton();
        Numero8 = new javax.swing.JButton();
        Numero9 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        Numero0 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        Resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Suma.setText("+");
        Suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumaMouseClicked(evt);
            }
        });
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        getContentPane().add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 80, 50));

        Numero1.setText("1");
        Numero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero1MouseClicked(evt);
            }
        });
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 50));

        Numero2.setText("2");
        Numero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero2MouseClicked(evt);
            }
        });
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 80, 50));

        Numero3.setText("3");
        Numero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero3MouseClicked(evt);
            }
        });
        Numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero3ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, 50));

        Numero4.setText("4");
        Numero4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero4MouseClicked(evt);
            }
        });
        Numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero4ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 50));

        Numero5.setText("5");
        Numero5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero5MouseClicked(evt);
            }
        });
        Numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero5ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 80, 50));

        Numero6.setText("6");
        Numero6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero6MouseClicked(evt);
            }
        });
        Numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero6ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 80, 50));

        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        getContentPane().add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, 50));

        Numero7.setText("7");
        Numero7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero7MouseClicked(evt);
            }
        });
        Numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero7ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 50));

        Numero8.setText("8");
        Numero8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero8MouseClicked(evt);
            }
        });
        Numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero8ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 80, 50));

        Numero9.setText("9");
        Numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero9ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 50));

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        getContentPane().add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 80, 50));

        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        getContentPane().add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, 50));

        Numero0.setText("0");
        Numero0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Numero0MouseClicked(evt);
            }
        });
        Numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero0ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 80, 50));

        reset.setText("R");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 80, 50));

        multiplicacion.setText("*");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 80, 50));

        Resultado.setEditable(false);
        Resultado.setBackground(new java.awt.Color(255, 255, 255));
        Resultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Resultado.setText("0");
        getContentPane().add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaActionPerformed

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero1ActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero2ActionPerformed

    private void Numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero3ActionPerformed

    private void Numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero4ActionPerformed

    private void Numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero5ActionPerformed

    private void Numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero6ActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestaActionPerformed

    private void Numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero7ActionPerformed

    private void Numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero8ActionPerformed

    private void Numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero9ActionPerformed
agregar(Numero9.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero9ActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_igualActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puntoActionPerformed

    private void Numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero0ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void Numero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero1MouseClicked
        agregar(Numero1.getText());
    }//GEN-LAST:event_Numero1MouseClicked

    private void Numero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero2MouseClicked
agregar(Numero2.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero2MouseClicked

    private void Numero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero3MouseClicked
agregar(Numero3.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero3MouseClicked

    private void Numero4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero4MouseClicked
agregar(Numero4.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero4MouseClicked

    private void Numero5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero5MouseClicked
agregar(Numero5.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero5MouseClicked

    private void Numero6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero6MouseClicked
agregar(Numero6.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero6MouseClicked

    private void Numero7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero7MouseClicked
agregar(Numero7.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero7MouseClicked

    private void Numero8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero8MouseClicked
agregar(Numero8.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero8MouseClicked

    private void Numero0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Numero0MouseClicked
agregar(Numero0.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_Numero0MouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       System.out.println(evt.getKeyChar());
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
       System.out.println(evt.getKeyChar());
    }//GEN-LAST:event_formKeyTyped

    private void SumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumaMouseClicked
        // TODO add your handling code here:
        res = res + Double.parseDouble(Resultado.getText().trim());
        Resultado.setText(""+res);
    }//GEN-LAST:event_SumaMouseClicked

    private void agregar(String text){
        if("0".equals(Resultado.getText()))
        Resultado.setText(text);
        else Resultado.setText(Resultado.getText()+text);
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Numero0;
    private javax.swing.JButton Numero1;
    private javax.swing.JButton Numero2;
    private javax.swing.JButton Numero3;
    private javax.swing.JButton Numero4;
    private javax.swing.JButton Numero5;
    private javax.swing.JButton Numero6;
    private javax.swing.JButton Numero7;
    private javax.swing.JButton Numero8;
    private javax.swing.JButton Numero9;
    private javax.swing.JButton Resta;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton Suma;
    private javax.swing.JButton igual;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton punto;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
