/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author cedricjadee
 */
public class roomPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form addRoom
     */
    public roomPage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
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
        floor = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        capacity = new javax.swing.JComboBox<>();
        bs = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(659, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(659, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Rooms");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 20));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 30, 10));

        floor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        floor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        floor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Floor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(floor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 190, 50));

        price.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 190, 50));

        capacity.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        capacity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 persons", "3 persons", "4 persons", "5 persons" }));
        capacity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Capacity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 50));

        bs.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        bs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Double", "Full Double", "Queen", "King" }));
        bs.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Bed Size", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.add(bs, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 190, 50));

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

        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 100, 40));

        status.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));
        status.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Status"));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 190, 50));

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

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked

        if(floor.getText().isEmpty() || price.getText().isEmpty() || price.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");

        }else{

            if(action.equals("Add")){

                try{

                    dbConnector dbc = new dbConnector();
                    boolean result = dbc.insertData("INSERT INTO tbl_room ("

                        + "r_floor,"
                        + "r_price,"
                        + "r_capacity,"
                        + "r_bedsize,"
                        + "r_status) VALUES ("
                        + "'"+floor.getText()+"',"
                        + "'"+price.getText()+"',"
                        + "'"+capacity.getSelectedItem()+"',"
                        + "'"+bs.getSelectedItem()+"',"
                        + "'"+status.getSelectedItem()+"')");

                    if(true){
                        JOptionPane.showMessageDialog(null, "Successfully Save!");
                        close();
                    }else{
                        System.out.println("Saving Data Failed!");
                    }
                }catch(Exception ex){
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

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> bs;
    public javax.swing.JComboBox<String> capacity;
    public javax.swing.JTextField floor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel label;
    private javax.swing.JPanel label1;
    public javax.swing.JTextField price;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
