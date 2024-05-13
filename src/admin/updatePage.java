/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author cedricjadee
 */
public class updatePage extends javax.swing.JInternalFrame {

    /**
     * Creates new form updatePage
     */
    public updatePage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
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
        idnumber = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Admin");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 20, 10));

        fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 50));

        lname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, 50));

        email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 50));

        username.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 50));

        password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        password.setEnabled(false);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 330, 50));

        accounttype.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        accounttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        accounttype.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Type"));
        jPanel1.add(accounttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 50));

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

        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 100, 40));

        accountstatus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        accountstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        accountstatus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Status"));
        accountstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountstatusActionPerformed(evt);
            }
        });
        jPanel1.add(accountstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 160, 50));

        idnumber.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idnumber.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        idnumber.setCaretColor(new java.awt.Color(255, 255, 255));
        idnumber.setEnabled(false);
        idnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnumberActionPerformed(evt);
            }
        });
        jPanel1.add(idnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 90, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setText("NO IMAGE FOUND");
        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 240, 200));

        upload.setText("UPLOAD");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel1.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 90, -1));

        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountstatusActionPerformed

    private void label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseExited
        label1.setBackground(button);
    }//GEN-LAST:event_label1MouseExited

    private void label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseEntered
        label1.setBackground(hover);
    }//GEN-LAST:event_label1MouseEntered

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
            if(action.equals("Update")){
            
            if(duplicateCheck()){
                System.out.println("Duplicate Exist");
                
                }else{
            
                dbConnector dbc = new dbConnector();
                dbc.updateData("UPDATE tbl_user SET "
                    + " u_fname =   '"+fname.getText()+"',"
                    + " u_lname =   '"+lname.getText()+"',"
                    + " u_email =   '"+email.getText()+"',"
                    + " u_status = '"+accountstatus.getSelectedItem()+"',"
                    + " u_image = '"+destination+"'"
                    + " WHERE u_id = '"+idnumber.getText()+"'");
                
                
                if(destination.isEmpty()){
                    File existingFile = new File(oldpath);
                    if(existingFile.exists()){
                        existingFile.delete();
                    }
                }else{
                    if(!(oldpath.equals(path))){
                        imageUpdater(oldpath,path);
                    }
                }
                close();
                }
            }
    }//GEN-LAST:event_label1MouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void idnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnumberActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(false);
        upload.setEnabled(true);
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
      JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            upload.setEnabled(false);
                            remove.setVisible(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }

    }//GEN-LAST:event_uploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> accountstatus;
    public javax.swing.JComboBox<String> accounttype;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField idnumber;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel label;
    private javax.swing.JPanel label1;
    public javax.swing.JTextField lname;
    public javax.swing.JPasswordField password;
    public javax.swing.JButton remove;
    public javax.swing.JButton upload;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
