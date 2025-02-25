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
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MUGKESHANANTH
 */
public class Transaction extends javax.swing.JFrame {
    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    

    /**
     * Creates new form Transaction
     */
    public Transaction() {
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
                    Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                    }
                    }
                    catch(ClassNotFoundException ex){
                    Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE,null, ex);
                    JOptionPane.showMessageDialog(this,ex.getMessage());

                    }
             
    }

    private void populateCustomerNames() {
    // Initialize the list to store customer names
}
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CustomerNameSelector = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        totalTransaction = new javax.swing.JTextField();
        detailsbutton = new javax.swing.JButton();
        F = new javax.swing.JButton();
        BackHomebutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        RButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204,80));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Transaction");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name :");

        CustomerNameSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNameSelectorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel6.setText("Total Amount :");

        totalTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTransactionActionPerformed(evt);
            }
        });

        detailsbutton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        detailsbutton.setText("Show Details");
        detailsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsbuttonActionPerformed(evt);
            }
        });

        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        BackHomebutton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        BackHomebutton.setText("Back");
        BackHomebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHomebuttonActionPerformed(evt);
            }
        });

        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine_name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(MedicineTable);

        RButton.setText("jButton1");
        RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackHomebutton)
                .addGap(80, 80, 80)
                .addComponent(detailsbutton)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(totalTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(F)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerNameSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CustomerNameSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RButton)
                    .addComponent(F))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsbutton)
                    .addComponent(BackHomebutton))
                .addGap(52, 52, 52))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 490, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/sales bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsbuttonActionPerformed
         // TODO add your handling code here:
        
           String selectedCustomerName = (String) CustomerNameSelector.getSelectedItem();

    // Dispose the current window
    this.dispose();

    // Open the Customer_details window with the selected customer name
//    java.awt.EventQueue.invokeLater(new Runnable() {
//        public void run() {
//            new Customer_details(selectedCustomerName).setVisible(true);
//        }
//    });
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_details(selectedCustomerName).setVisible(true);
            }
        });
    }//GEN-LAST:event_detailsbuttonActionPerformed

    private void CustomerNameSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNameSelectorActionPerformed
        // TODO add your handling code here:
       // Initialize the list to store customer names

    }//GEN-LAST:event_CustomerNameSelectorActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
//         List<String> customerNames = new ArrayList<>();
//            Connection con = null;
//            PreparedStatement ps = null;
//            ResultSet rs = null;
//
//    try {
//        // Establish the database connection
//        System.out.println("Establishing database connection...");
//        con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-NQMMIOER:1522:orcl", "scott", "tiger");
//        System.out.println("Database connection established.");
//
//        // Create the SQL query to retrieve customer names
//        String query = "SELECT customer_name FROM Customer";
//
//        // Prepare the statement
//        System.out.println("Preparing SQL statement...");
//        ps = con.prepareStatement(query);
//
//        // Execute the query
//        System.out.println("Executing query to retrieve customer names...");
//        rs = ps.executeQuery();
//
//        // Iterate over the result set and append customer names to the list
//        System.out.println("Processing result set...");
//        while (rs.next()) {
//            customerNames.add(rs.getString("customer_name"));
//        }
//        System.out.println("Customer names retrieved: " + customerNames);
//
//        // Remove all existing items in the combo box
//        System.out.println("Clearing existing items in the combo box...");
//        ////CustomerNameSelector.removeAllItems();
//
//        // Add the retrieved customer names to the combo box
//        System.out.println("Adding customer names to the combo box...");
//        for (String name : customerNames) {
//            CustomerNameSelector.addItem(name);
//        }
//        //System.out.println(customerNames.get(0));
//       
//
//    } catch (SQLException ex) {
//        System.out.println("SQLException: " + ex.getMessage());
//        ex.printStackTrace();
//    } finally {
//        // Close resources
//        try {
//            if (rs != null) rs.close();
//            if (ps != null) ps.close();
//            System.out.println("Resources closed after first query.");
//        } catch (SQLException ex) {
//            System.out.println("SQLException during resource cleanup: " + ex.getMessage());
//            ex.printStackTrace();
//        }
//    }
    // TODO add your handling code here:
     List<String> customerNames = new ArrayList<>();
        Connection con = null;
        PreparedStatement psCustomer = null;
        ResultSet rsCustomer = null;

        try {
            // Establish the database connection
            System.out.println("Establishing database connection...");
            con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-NQMMIOER:1522:orcl", "scott", "tiger");
            System.out.println("Database connection established.");

            // Create the SQL query to retrieve customer names
            String queryCustomer = "SELECT customer_name FROM Customer";

            // Prepare the statement
            System.out.println("Preparing SQL statement for customer names...");
            psCustomer = con.prepareStatement(queryCustomer);

            // Execute the query
            System.out.println("Executing query to retrieve customer names...");
            rsCustomer = psCustomer.executeQuery();

            // Iterate over the result set and append customer names to the list
            System.out.println("Processing result set...");
            while (rsCustomer.next()) {
                customerNames.add(rsCustomer.getString("customer_name"));
            }
            System.out.println("Customer names retrieved: " + customerNames);

            // Remove all existing items in the combo box
            System.out.println("Clearing existing items in the combo box...");
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(customerNames.toArray(new String[0]));
           CustomerNameSelector.setModel(model);

            // Fetch and display medicine details for the currently selected customer
            String selectedCustomerName = (String) CustomerNameSelector.getSelectedItem();
            if (selectedCustomerName != null) {
                fetchAndDisplayMedicineDetails(selectedCustomerName);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rsCustomer != null) rsCustomer.close();
                if (psCustomer != null) psCustomer.close();
                System.out.println("Resources closed after query.");
            } catch (SQLException ex) {
                System.out.println("SQLException during resource cleanup: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    
    }//GEN-LAST:event_FActionPerformed

    private void BackHomebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHomebuttonActionPerformed
        // TODO add your handling code here:
           this.dispose();

            // Open the homepage
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Homepage().setVisible(true);
                }
            });
    }//GEN-LAST:event_BackHomebuttonActionPerformed

    private void RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButtonActionPerformed
        // TODO add your handling code here:
        String selectedCustomerName = (String) CustomerNameSelector.getSelectedItem();

        if (selectedCustomerName != null) {
            fetchAndDisplayMedicineDetails(selectedCustomerName);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a customer.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_RButtonActionPerformed

    private void totalTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTransactionActionPerformed
    
    private DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    private void fetchAndDisplayMedicineDetails(String customerName) {
//    Connection con = null;
//    PreparedStatement psMedicine = null;
//    ResultSet rsMedicine = null;
//
//    try {
//        // Establish the database connection
//        con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-NQMMIOER:1522:orcl", "scott", "tiger");
//
//        // Create the SQL query to retrieve medicine details for the selected customer
//        String queryMedicine = 
//            "SELECT m.name, s.sale_quantity " +
//            "FROM Sales s " +
//            "JOIN Customer c ON s.customer_id = c.customer_id " +
//            "JOIN Medicine m ON s.medicine_id = m.medicine_id " +
//            "WHERE c.customer_name = ?";
//
//        psMedicine = con.prepareStatement(queryMedicine);
//        psMedicine.setString(1, customerName);
//
//        System.out.println("Executing query to retrieve medicine details...");
//        rsMedicine = psMedicine.executeQuery();
//
//        DefaultTableModel tblModel = (DefaultTableModel) MedicineTable.getModel();
//        tblModel.setRowCount(0);
//
//        while (rsMedicine.next()) {
//            String medicineName = rsMedicine.getString("name");
//            int saleQuantity = rsMedicine.getInt("sale_quantity");
//
//            String tbData[] = {medicineName, String.valueOf(saleQuantity)};
//            tblModel.addRow(tbData);
//        }
//
//    } catch (SQLException ex) {
//        System.out.println("SQLException: " + ex.getMessage());
//        ex.printStackTrace();
//    } finally {
//        // Close resources
//        try {
//            if (rsMedicine != null) rsMedicine.close();
//            if (psMedicine != null) psMedicine.close();
//            System.out.println("Resources closed after medicine query.");
//        } catch (SQLException ex) {
//            System.out.println("SQLException during resource cleanup: " + ex.getMessage());
//            ex.printStackTrace();
//        }
//    }

        Connection con = null;
        PreparedStatement psMedicine = null;
        ResultSet rsMedicine = null;

        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-NQMMIOER:1522:orcl", "scott", "tiger");

            String queryMedicine =
                "SELECT m.name, s.sale_quantity, m.price " +
                "FROM Sales s " +
                "JOIN Customer c ON s.customer_id = c.customer_id " +
                "JOIN Medicine m ON s.medicine_id = m.medicine_id " +
                "WHERE c.customer_name = ?";

            psMedicine = con.prepareStatement(queryMedicine);
            psMedicine.setString(1, customerName);

            System.out.println("Executing query to retrieve medicine details...");
            rsMedicine = psMedicine.executeQuery();

            DefaultTableModel tblModel = (DefaultTableModel) MedicineTable.getModel();
            tblModel.setRowCount(0);

            double totalTransactionData = 0.0;

            while (rsMedicine.next()) {
                String medicineName = rsMedicine.getString("name");
                int saleQuantity = rsMedicine.getInt("sale_quantity");
                double unitPrice = rsMedicine.getDouble("price");

                // Calculate total amount for this item
                double totalAmount = unitPrice * saleQuantity;
                totalTransactionData += totalAmount;

                String tbData[] = {medicineName, String.valueOf(saleQuantity)};
                tblModel.addRow(tbData);
            }
            
            
            // Display total transaction amount in TotalTransactionTextField
//            totalTransaction.setText(String.valueOf(totalTransactionData));
totalTransaction.setText(decimalFormat.format(totalTransactionData));
            

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (rsMedicine != null) rsMedicine.close();
                if (psMedicine != null) psMedicine.close();
                System.out.println("Resources closed after medicine query.");
            } catch (SQLException ex) {
                System.out.println("SQLException during resource cleanup: " + ex.getMessage());
                ex.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHomebutton;
    private javax.swing.JComboBox<String> CustomerNameSelector;
    private javax.swing.JButton F;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton RButton;
    private javax.swing.JButton detailsbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField totalTransaction;
    // End of variables declaration//GEN-END:variables
}
