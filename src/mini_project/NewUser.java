/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini_project;
import javax.swing.*;
import java.sql.*;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
/**
 *
 * @author MUGKESHANANTH
 */
public class NewUser extends javax.swing.JFrame {
    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Creates new form NewUser
     */
    public NewUser() {
        initComponents();
              try{
                    Class.forName("oracle.jdbc.OracleDriver");
                    //JOptionPane.showMessageDialog(this,"Driver Loaded!");
                    try {                  
                    con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-NQMMIOER:1522:orcl",
                            "scott","tiger");                    
                    //JOptionPane.showMessageDialog(this,"Connected to Oracle database!");
                }
                catch (SQLException ex) {
                    Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                    }
                    }
                    catch(ClassNotFoundException ex){
                    Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE,null, ex);
                    JOptionPane.showMessageDialog(this,ex.getMessage());

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        employee_name = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        employee_email = new javax.swing.JLabel();
        employee_phone = new javax.swing.JLabel();
        DOBField = new javax.swing.JLabel();
        PositionField = new javax.swing.JLabel();
        AddressField = new javax.swing.JLabel();
        PincodeField = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        phonenofield = new javax.swing.JTextField();
        dobfield = new javax.swing.JTextField();
        positionfield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        pincodefield = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,180));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel2.setText("Newuser Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 21, -1, -1));

        employee_name.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        employee_name.setText("User Name :");
        jPanel2.add(employee_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 69, -1, 26));

        password.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        password.setText("Password :");
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 113, -1, 26));

        employee_email.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        employee_email.setText("E-mail :");
        jPanel2.add(employee_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 157, -1, 26));

        employee_phone.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        employee_phone.setText(" Phone_no :");
        jPanel2.add(employee_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 195, -1, 26));

        DOBField.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        DOBField.setText("DOB :");
        jPanel2.add(DOBField, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 235, -1, -1));

        PositionField.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        PositionField.setText("Position :");
        jPanel2.add(PositionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 275, -1, -1));

        AddressField.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        AddressField.setText("Address :");
        jPanel2.add(AddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 315, -1, -1));

        PincodeField.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        PincodeField.setText("Pincode :");
        jPanel2.add(PincodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 355, -1, -1));
        jPanel2.add(userfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 72, 169, -1));
        jPanel2.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 113, 169, -1));
        jPanel2.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 160, 169, -1));
        jPanel2.add(phonenofield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 198, 169, -1));
        jPanel2.add(dobfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 233, 169, -1));
        jPanel2.add(positionfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 273, 169, -1));
        jPanel2.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 313, 169, -1));
        jPanel2.add(pincodefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 353, 169, -1));

        LoginButton.setBackground(new java.awt.Color(204, 255, 204));
        LoginButton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 393, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 340, 430));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/newuserbb.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 505));

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

  private boolean insertEmployees(String username, String password, String email, String phone, String dob, String position, String address, String pincode) {
        try {
            String query = "INSERT INTO Employees(employee_name, position, employee_email, employee_phone, password, DOB, address, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, position);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, password);
            ps.setDate(6, java.sql.Date.valueOf(dob)); // Ensure the date is in YYYY-MM-DD format
            ps.setString(7, address);
            ps.setInt(8, Integer.parseInt(pincode));
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    
  }
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String username = userfield.getText().trim();
        String password = passwordfield.getText().trim();
        String email = emailfield.getText().trim();
        String phone = phonenofield.getText().trim();
        String dob = dobfield.getText().trim();
        String position = positionfield.getText().trim();
        String address = addressfield.getText().trim();
        String pincode = pincodefield.getText().trim();

        if (insertEmployees(username, password, email, phone, dob, position, address, pincode)) {
            JOptionPane.showMessageDialog(this, "Employee registered successfully!");
            this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Homepage().setVisible(true);
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Error in registration. Please try again.");
        }

         
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressField;
    private javax.swing.JLabel DOBField;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PincodeField;
    private javax.swing.JLabel PositionField;
    private javax.swing.JTextField addressfield;
    private javax.swing.JTextField dobfield;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel employee_email;
    private javax.swing.JLabel employee_name;
    private javax.swing.JLabel employee_phone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordfield;
    private javax.swing.JTextField phonenofield;
    private javax.swing.JTextField pincodefield;
    private javax.swing.JTextField positionfield;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables

   
}
