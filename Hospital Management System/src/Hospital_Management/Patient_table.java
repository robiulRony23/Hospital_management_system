/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Patient_table extends javax.swing.JFrame {

    /**
     * Creates new form Patient_table
     */
    public Patient_table() {
        initComponents();
        show_data();
        setSize(850,650);
        setLocation(100,50);
    }
    void show_data()
    {
        Connection con;
        Statement stmt;
        ResultSet rs;
        try{
        String host="jdbc:derby://localhost:1527/data_folder";
        String uName="rony";
        String uPass="rony";
        con = DriverManager.getConnection(host,uName,uPass);
        stmt=con.createStatement();
      
         String sql="SELECT * FROM RONY.PATIENT_DETAILS";
         rs=stmt.executeQuery(sql);
         DefaultTableModel model1=(DefaultTableModel)pTable.getModel();
         while(rs.next())
         {
             model1.addRow(new Object[]{rs.getString("ID"),rs.getString("FIRST_NAME")+" "+rs.getString("LAST_NAME"),rs.getString("SEX"),rs.getString("AGE"),rs.getString("MARITAL_STATUS"),rs.getString("BLOOD_GRP"),rs.getString("ADMIT_DATE"),rs.getString("WARD_NO"),rs.getString("BED_NUM"),rs.getString("CONTACT_NUM"),rs.getString("ADDRESS")});
         }
        
        
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Sex", "Age", "Merital Status", "Blood Group", "Admit Date", "Ward No.", "Bed No.", "Contact No.", "Address"
            }
        ));
        jScrollPane1.setViewportView(pTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 830, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Patient_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pTable;
    // End of variables declaration//GEN-END:variables
}
