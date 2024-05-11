/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author cedricjadee
 */
public class adminApplicants extends javax.swing.JInternalFrame {

    /**
     * Creates new form adminApplicants
     */
    public adminApplicants() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    public static String us, em;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + username.getText() + "' OR u_email = '" + email.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                
                em = resultSet.getString("u_email");
                System.out.println(""+em);
                if(em.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    email.setText("");
                }
                
                us = resultSet.getString("u_username");
                System.out.println(""+us);
                if(us.equals(username.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    username.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
            
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }
    }
    
        
        public void close(){
            
            this.dispose();
            userForm md = new userForm();
            md.setVisible(true);
            
        }
    
        Color hover = new Color(0,0,0);
        Color button = new Color (0,51,51);
        public String action;

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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        accounttype = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        accountstatus = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Admin Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 20));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 60, 10));

        fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 190, 50));

        lname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 190, 50));

        email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 400, 50));

        username.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 400, 50));

        password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 400, 50));

        accounttype.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        accounttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        accounttype.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Type"));
        jPanel1.add(accounttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 190, 50));

        label1.setBackground(new java.awt.Color(0, 51, 51));
        label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label1MouseExited(evt);
            }
        });
        label1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("LABEL");
        label1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 100, 20));

        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 100, 40));

        accountstatus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        accountstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        accountstatus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Status"));
        accountstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountstatusActionPerformed(evt);
            }
        });
        jPanel1.add(accountstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked

        if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(password.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 characters and above!");
            password.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");

        }else{

            if(action.equals("Add")){

                try{

                    String pass = passwordHasher.hashPassword(password.getText());
                    dbConnector dbc = new dbConnector();
                    boolean result = dbc.insertData("INSERT INTO tbl_user ("

                        + "u_fname,"
                        + "u_lname,"
                        + "u_email,"
                        + "u_username,"
                        + "u_password,"
                        + "u_type,"
                        + "u_status) VALUES ("
                        + "'"+fname.getText()+"',"
                        + "'"+lname.getText()+"',"
                        + "'"+email.getText()+"',"
                        + "'"+username.getText()+"',"
                        + "'"+pass+"',"
                        + "'"+accounttype.getSelectedItem()+"',"
                        + "'"+accountstatus.getSelectedItem()+"')");

                    if(true){
                        JOptionPane.showMessageDialog(null, "Successfully Save!");
                        close();
                    }else{
                        System.out.println("Saving Data Failed!");
                    }
                }catch(NoSuchAlgorithmException ex){
                    System.out.println(""+ex);
                }

            }
        }

    }//GEN-LAST:event_label1MouseClicked

    private void label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseEntered
        label1.setBackground(hover);
    }//GEN-LAST:event_label1MouseEntered

    private void label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseExited
        label1.setBackground(button);
    }//GEN-LAST:event_label1MouseExited

    private void accountstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountstatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> accountstatus;
    private javax.swing.JComboBox<String> accounttype;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel label;
    private javax.swing.JPanel label1;
    public javax.swing.JTextField lname;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
