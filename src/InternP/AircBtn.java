/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ds2400
 */
public class AircBtn extends javax.swing.JFrame {

   public Connection conn;
   public Statement st;
    /**
     * Creates new form AircBtn
     */
    public AircBtn() {
        initComponents();
        
        try{  
        Class.forName("com.mysql.jdbc.Driver");
       conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Shank","root","");
       st=conn.createStatement();
       }
       catch(Exception ex)
               {
               System.out.println(ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        estimation = new javax.swing.JLabel();
        coupon = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        estimation1 = new javax.swing.JLabel();
        amt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel2.setText("Product Details:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 139, 140, 30));

        estimation.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        estimation.setText(" Coupon  Code:");
        jPanel1.add(estimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 110, -1));

        coupon.setText("Enter Here");
        coupon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                couponMouseClicked(evt);
            }
        });
        coupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponActionPerformed(evt);
            }
        });
        jPanel1.add(coupon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel1.setText("Estimation Details:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        jButton2.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 343, 100, 30));

        estimation1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        estimation1.setText("Estimation Cost:");
        jPanel1.add(estimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        amt1.setText("Enter Amt");
        amt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amt1MouseClicked(evt);
            }
        });
        amt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amt1ActionPerformed(evt);
            }
        });
        jPanel1.add(amt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                            
         this.setVisible(false);
        new Aircondition().setVisible(true);              
                     
                    
                    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
           String s1 =  coupon.getText();
           String s2 = coupon.getText();
           
           
              
          
          
           try{
               
               if(s1.trim().isEmpty()||s2.trim().isEmpty())
                       {
                        JOptionPane.showMessageDialog(null,"Fields are not Selected\nPlease Select All Field");
                       }
               
                   String j="Select * from register where Cost='0' ";
                   String updatej="Update register set Cost='"+s1+"' where Cost='0'";
                   st.addBatch(updatej);
                   st.executeBatch();
                   ResultSet rs=st.executeQuery(j);
                   
                   String c="Select * from register where Code='0' ";
                   String updatec="Update register set Code='"+s2+"' where Code='0'";
                   st.addBatch(updatec);
                   st.executeBatch();
                   rs=st.executeQuery(c);
                          
                   JOptionPane.showMessageDialog(null,"  Press OK to Enter your Address  ");
                          
                      
                      this.setVisible(false);
                      new Adress().setVisible(true);
                       
                       
                       }
                       
                   
                
          catch (Exception ex) 
                {
                    System.out.println(ex);
                    JOptionPane.showMessageDialog(null," Something Went Wrong.");
                }
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void couponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couponActionPerformed

    private void couponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_couponMouseClicked
       coupon.setText("");
    }//GEN-LAST:event_couponMouseClicked

    private void amt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amt1MouseClicked
       amt1.setText("");
    }//GEN-LAST:event_amt1MouseClicked

    private void amt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amt1ActionPerformed

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
            java.util.logging.Logger.getLogger(AircBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AircBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AircBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AircBtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AircBtn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amt1;
    private javax.swing.JTextField coupon;
    private javax.swing.JLabel estimation;
    private javax.swing.JLabel estimation1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
