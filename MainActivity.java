/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

/**
 *
 * @author USER
 */
public class MainActivity extends javax.swing.JFrame {
    int a[][];
     int count=0;    
    public MainActivity() {
        initComponents();
        a = new int[3][3];    
        PlayerTurn();
        for(int i=0; i<3;i++)
            for(int j=0; j<3; j++)
             a[i][j]=0;
    }
  public void PlayerTurn()
  {
   if(count<=9)
      if(count%2==0)
      jLabel2.setText("Player 1 Turn");
   else
      jLabel2.setText("Player 2 Turn");
  }
  public void Calculate()
  {
 if(((a[0][0] == 1) && (a[0][1] == 1) && (a[0][2] == 1)) || ((a[1][0] == 1) && (a[1][1] == 1) && (a[1][2] == 1))
 || ((a[2][0] == 1) && (a[2][1] == 1) && (a[2][2] == 1)) || ((a[0][0] == 1) && (a[1][0] == 1) && (a[2][0] == 1))
 || ((a[0][1] == 1) && (a[1][1] == 1) && (a[2][1] == 1)) || ((a[0][2] == 1) && (a[1][2] == 1) && (a[2][2] == 1))  
 || ((a[0][0] == 1) && (a[1][1] == 1) && (a[2][2] == 1)) || ((a[0][2] == 1) && (a[1][1] == 1) && (a[2][0] == 1)))    
 {
    jLabel3.setText("Player 1 wins!");
    jButton1.setEnabled(true);
    jButton3.setEnabled(true);
    jButton4.setEnabled(true);
    jButton5.setEnabled(true);
    jButton6.setEnabled(true);
    jButton7.setEnabled(true);
    jButton8.setEnabled(true);
    jButton9.setEnabled(true);
    jButton10.setEnabled(true);
    
    jButton1.setText("");
    jButton3.setText("");
    jButton4.setText("");
    jButton5.setText("");
    jButton6.setText("");
    jButton7.setText("");
    jButton8.setText("");
    jButton9.setText("");
    jButton10.setText("");
    count=0;
    for(int i=0; i<3;i++)
            for(int j=0; j<3; j++)
             a[i][j]=0;
 }
 else if(((a[0][0] == 2) && (a[0][1] == 2) && (a[0][2] == 2)) || ((a[1][0] == 2) && (a[1][1] == 2) && (a[1][2] == 2))
 || ((a[2][0] == 2) && (a[2][1] == 2) && (a[2][2] == 2)) || ((a[0][0] == 2) && (a[1][0] == 2) && (a[2][0] == 2))
 || ((a[0][1] == 2) && (a[1][1] == 2) && (a[2][1] == 2)) || ((a[0][2] == 2) && (a[1][2] == 2) && (a[2][2] == 2))  
 || ((a[0][0] == 2) && (a[1][1] == 2) && (a[2][2] == 2)) || ((a[0][2] == 2) && (a[1][1] == 2) && (a[2][0] == 2)))    
 {
    jLabel3.setText("Player 2 wins!");
    jButton1.setEnabled(true);
    jButton3.setEnabled(true);
    jButton4.setEnabled(true);
    jButton5.setEnabled(true);
    jButton6.setEnabled(true);
    jButton7.setEnabled(true);
    jButton8.setEnabled(true);
    jButton9.setEnabled(true);
    jButton10.setEnabled(true);
    
    jButton1.setText("");
    jButton3.setText("");
    jButton4.setText("");
    jButton5.setText("");
    jButton6.setText("");
    jButton7.setText("");
    jButton8.setText("");
    jButton9.setText("");
    jButton10.setText("");
    count=0;
    for(int i=0; i<3;i++)
            for(int j=0; j<3; j++)
             a[i][j]=0;
 }
  }
   public void Draw(){
       if(count>=9)
       {
           jLabel3.setText("It's a Draw!");
       jButton1.setEnabled(true);
    jButton3.setEnabled(true);
    jButton4.setEnabled(true);
    jButton5.setEnabled(true);
    jButton6.setEnabled(true);
    jButton7.setEnabled(true);
    jButton8.setEnabled(true);
    jButton9.setEnabled(true);
    jButton10.setEnabled(true);
    
    jButton1.setText("");
    jButton3.setText("");
    jButton4.setText("");
    jButton5.setText("");
    jButton6.setText("");
    jButton7.setText("");
    jButton8.setText("");
    jButton9.setText("");
    jButton10.setText("");
    count=0;
    for(int i=0; i<3;i++)
            for(int j=0; j<3; j++)
             a[i][j]=0;
       }
   }
  
  
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jButton1.getText().equals(""))
        {
            if(count%2==0)
                jButton1.setText("X");
            else  
                jButton1.setText("O");
        count++;
        PlayerTurn();
        jButton1.setEnabled(false);
        }
        else jButton1.setEnabled(false);
        if(jButton1.getText().equals("X"))
            a[0][0]=1;
        else
            a[0][0]=2;
        Calculate();
        Draw();
    }//GEN-LAST:event_jButton1ActionPerformed
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jButton3.getText().equals(""))
        {
            if(count%2==0)
                jButton3.setText("X");
            else  
                jButton3.setText("O");
        count++;
        PlayerTurn();
        jButton3.setEnabled(false);
        }
        else jButton3.setEnabled(false);
         if(jButton3.getText().equals("X"))
            a[0][1]=1;
        else
            a[0][1]=2;
         Calculate();
         Draw();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jButton4.getText().equals(""))
        {
            if(count%2==0)
                jButton4.setText("X");
            else  
                jButton4.setText("O");
        count++;
        PlayerTurn();
        jButton4.setEnabled(false);
        }
        else jButton4.setEnabled(false);
         if(jButton4.getText().equals("X"))
            a[0][2]=1;
        else
            a[0][2]=2;
         Calculate();
         Draw();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jButton5.getText().equals(""))
        {
            if(count%2==0)
                jButton5.setText("X");
            else  
                jButton5.setText("O");
        count++;
        PlayerTurn();
        jButton5.setEnabled(false);
        }
        else jButton5.setEnabled(false);
 if(jButton5.getText().equals("X"))
            a[1][0]=1;
        else
            a[1][0]=2;
 Calculate();
 Draw();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jButton6.getText().equals(""))
        {
            if(count%2==0)
                jButton6.setText("X");
            else  
                jButton6.setText("O");
        count++;
        PlayerTurn();
        jButton6.setEnabled(false);
        }
        else jButton6.setEnabled(false);// TODO add your handling code here:
         if(jButton6.getText().equals("X"))
            a[1][1]=1;
        else
            a[1][1]=2;
         Calculate();
         Draw();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(jButton7.getText().equals(""))
        {
            if(count%2==0)
                jButton7.setText("X");
            else  
                jButton7.setText("O");
        count++;
        PlayerTurn();
        jButton7.setEnabled(false);
        }
        else jButton7.setEnabled(false);
 if(jButton7.getText().equals("X"))
            a[1][2]=1;
        else
            a[1][2]=2;
Calculate();
Draw();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jButton8.getText().equals(""))
        {
            if(count%2==0)
                jButton8.setText("X");
            else  
                jButton8.setText("O");
        count++;
        PlayerTurn();
        jButton8.setEnabled(false);
        }
        else jButton8.setEnabled(false);
 if(jButton8.getText().equals("X"))
            a[2][0]=1;
        else
            a[2][0]=2;
Calculate();
Draw();// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jButton9.getText().equals(""))
        {
            if(count%2==0)
                jButton9.setText("X");
            else  
                jButton9.setText("O");
        count++;
        PlayerTurn();
        jButton9.setEnabled(false);
        }
        else jButton9.setEnabled(false);
 if(jButton9.getText().equals("X"))
            a[2][1]=1;
        else
            a[2][1]=2;
Calculate();
Draw();// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(jButton10.getText().equals(""))
        {
            if(count%2==0)
                jButton10.setText("X");
            else  
                jButton10.setText("O");
        count++;
        PlayerTurn();
        jButton10.setEnabled(false);
        }
        else jButton10.setEnabled(false);
 if(jButton10.getText().equals("X"))
            a[2][2]=1;
        else
            a[2][2]=2;
Calculate();
Draw();// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
