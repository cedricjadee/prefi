/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import admin.adminApplicants;
import admin.roomForm;
import admin.reportPage;
import admin.userForm;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author cedricjadee
 */
public class adminPage extends javax.swing.JFrame {

    /**
     * Creates new form adminPage
     */
    public adminPage() {
        initComponents();
        
        mainPage mp = new mainPage();
        adminDesktop.add(mp).setVisible(true);
    }
    
    Color hover = new Color(0,0,0);
    Color defbutton = new Color(0,51,51);
    Color registerbutton = new Color (51,51,51);
    

    Border empty = BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
    }
    
    void buttonDefaultColor(JPanel panel){
        panel.setBackground(defbutton);
        panel.setBorder(empty);
    }
    
    void buttonDefaultColor2(JPanel panel){
        panel.setBackground(registerbutton);
        panel.setBorder(empty);
    }
    
    Color bodycolor = new Color(51,51,51);
    Color buttoncolor = new Color(153,153,255);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        reports = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        transaction = new javax.swing.JPanel();
        TRANSACTION = new javax.swing.JLabel();
        booking = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        adminDesktop = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin_account = new javax.swing.JLabel();
        admin_gmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ADMIN DASHBOARD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reports.setBackground(new java.awt.Color(51, 51, 51));
        reports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REPORTS");
        reports.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        jPanel3.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, 40));

        transaction.setBackground(new java.awt.Color(51, 51, 51));
        transaction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        transaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transactionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transactionMouseExited(evt);
            }
        });
        transaction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TRANSACTION.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        TRANSACTION.setForeground(new java.awt.Color(255, 255, 255));
        TRANSACTION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRANSACTION.setText("TRANSACTION");
        transaction.add(TRANSACTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        jPanel3.add(transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 40));

        booking.setBackground(new java.awt.Color(51, 51, 51));
        booking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookingMouseExited(evt);
            }
        });
        booking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BOOKINGS");
        booking.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        jPanel3.add(booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 140, 40));

        user.setBackground(new java.awt.Color(51, 51, 51));
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USER");
        user.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HOTEL RESERVATION");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, 20));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 10));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 480));

        adminDesktop.setMinimumSize(new java.awt.Dimension(610, 420));

        javax.swing.GroupLayout adminDesktopLayout = new javax.swing.GroupLayout(adminDesktop);
        adminDesktop.setLayout(adminDesktopLayout);
        adminDesktopLayout.setHorizontalGroup(
            adminDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        adminDesktopLayout.setVerticalGroup(
            adminDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel2.add(adminDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 610, 420));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-admin-50.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-circle-50.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 50));

        admin_account.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 10)); // NOI18N
        admin_account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_account.setText("ADMIN");
        jPanel2.add(admin_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 100, -1));

        admin_gmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 10)); // NOI18N
        admin_gmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_gmail.setText("EMAIL");
        jPanel2.add(admin_gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        reportPage bf = new reportPage();
        adminDesktop.add(bf).setVisible(true);
    }//GEN-LAST:event_reportsMouseClicked

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        reports.setBackground(buttoncolor);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(bodycolor);
    }//GEN-LAST:event_reportsMouseExited

    private void bookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseClicked
        roomForm bf = new roomForm();
        adminDesktop.add(bf).setVisible(true);
    }//GEN-LAST:event_bookingMouseClicked

    private void bookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseEntered
        booking.setBackground(buttoncolor);
    }//GEN-LAST:event_bookingMouseEntered

    private void bookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseExited
        booking.setBackground(bodycolor);
    }//GEN-LAST:event_bookingMouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        userForm uf = new userForm();
        adminDesktop.add(uf).setVisible(true);
    }//GEN-LAST:event_userMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setBackground(buttoncolor);
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setBackground(bodycolor);
    }//GEN-LAST:event_userMouseExited

    private void transactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseClicked
        
    }//GEN-LAST:event_transactionMouseClicked

    private void transactionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseEntered
        transaction.setBackground(buttoncolor);
    }//GEN-LAST:event_transactionMouseEntered

    private void transactionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseExited
        transaction.setBackground(bodycolor);
    }//GEN-LAST:event_transactionMouseExited

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
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TRANSACTION;
    public javax.swing.JDesktopPane adminDesktop;
    public javax.swing.JLabel admin_account;
    public javax.swing.JLabel admin_gmail;
    private javax.swing.JPanel booking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel transaction;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
