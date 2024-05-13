/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import admin.*;
import config.Session;
import config.dbConnector;
import internalPages.adminPage;
import internalPages.userPage;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import myapp.loginForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author cedricjadee
 */
public class userReportForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form reportPage
     */
    public userReportForm() {
        initComponents();
        
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        displayData();
    }
    
    
    
        Color hover = new Color(0,0,0);
        Color button = new Color (0,51,51);
        public String action;

    
    public void displayData(){
        
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT b_id,b_fname,b_lname,b_price,b_status FROM tbl_booking");
            reporttable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        segregate = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporttable = new javax.swing.JTable();
        print = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        individual = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Current User");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 70, 30));

        cid.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cid.setText("ID");
        jPanel3.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 70, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REPORTS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        segregate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Booking", "Reservation" }));
        jPanel3.add(segregate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 50));

        jScrollPane1.setViewportView(reporttable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 590, 270));

        print.setBackground(new java.awt.Color(0, 51, 51));
        print.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRINT TO PDF");
        print.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 100, 20));

        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 100, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/g2.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/g1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 70, 80));

        individual.setBackground(new java.awt.Color(0, 51, 51));
        individual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        individual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                individualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                individualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                individualMouseExited(evt);
            }
        });
        individual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PRINT");
        individual.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 100, 20));

        jPanel1.add(individual, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Session sess = Session.getInstance();
        
        if(sess.getUid() == 0){
            JOptionPane.showMessageDialog(null,"Please Login First!");
            loginForm lf = new loginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
            
            cid.setText(""+sess.getUid());
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(button);
    }//GEN-LAST:event_printMouseExited

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(hover);
    }//GEN-LAST:event_printMouseEntered

    private void individualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualMouseClicked

        int rowindex = reporttable.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null,"Please Select an Item!");
        }else{

            JDesktopPane desktopPane = null;
            Container parent = this.getParent();
            while(parent!=null){
                if(parent instanceof userPage){
                    desktopPane = ((userPage)parent).userDesktop;
                    break;
                }
                parent = parent.getParent();
            }

            if(desktopPane != null){

                userIndividualPrinting aa = new userIndividualPrinting();
                desktopPane.removeAll();
                desktopPane.add(aa);
                try{
                    dbConnector dbc = new dbConnector();
                    TableModel model = reporttable.getModel();
                    ResultSet rs = dbc.getData("SELECT * FROM tbl_booking WHERE b_id = '"+model.getValueAt(rowindex, 0)+"'");

                    if(rs.next()){

                        aa.rid.setText(""+rs.getInt("b_id"));
                        aa.fname.setText(""+rs.getString("b_fname"));
                        aa.lname.setText(""+rs.getString("b_lname"));
                        aa.email.setText(""+rs.getString("b_email"));
                        aa.cn.setText(""+rs.getString("b_contact"));
                        aa.price.setText(""+rs.getString("b_price"));
                        aa.pt.setText(""+rs.getString("b_paytype"));
                        aa.status.setText(""+rs.getString("b_status"));

                        aa.setVisible(true);

                    }
                }catch(SQLException ex){
                    System.out.println(""+ex);
                }
            }

        }
    }//GEN-LAST:event_individualMouseClicked

    private void individualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualMouseEntered
        individual.setBackground(hover);
    }//GEN-LAST:event_individualMouseEntered

    private void individualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_individualMouseExited
        individual.setBackground(button);
    }//GEN-LAST:event_individualMouseExited

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        MessageFormat header = new MessageFormat("REPORTS");
        
        try{
            reporttable.print(JTable.PrintMode.NORMAL, header, null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_printMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cid;
    public javax.swing.JPanel individual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel print;
    public javax.swing.JTable reporttable;
    private javax.swing.JComboBox<String> segregate;
    // End of variables declaration//GEN-END:variables
}
