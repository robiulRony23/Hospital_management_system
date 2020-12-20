/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Management;

//import static Hospital_Management.logInInfo.serialDoctor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author J786N72
 */
public class Appointment_add extends javax.swing.JFrame {

    /**
     * Creates new form Appointment_add
     */
    String ID;
    public Appointment_add(String valu) {
        ID=valu;
       // doctorId.setText(ID);
        initComponents();
        setSize(850,650);
        setLocation(100,50);
        findId();
        
    }
    public Appointment_add()
    {
        
    }
       
     String idd="50001";
     String num="1";
     //=serialDoctor;
     
     public void findNum()
     {
        int i;
        try
        {
        //ID=doctorId.getText();  
        Connection con;
        Statement stmt;
        ResultSet rs;
        String host="jdbc:derby://localhost:1527/data_folder";
        String uName="rony";
        String uPass="rony";
        con = DriverManager.getConnection(host,uName,uPass);
            
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sql="SELECT * FROM RONY.APPIONTMENT WHERE DOCTOR_ID='"+ID+"' AND DATE='"+sdf.format(date.getDate())+"'";
         
         rs=stmt.executeQuery(sql);
         
         if(rs.last())
         {
             num=rs.getString("SERIAL_NO");
             i=Integer.parseInt(num);
             i++;
             num=Integer.toString(i); 
         }
         
         stmt.close();
         rs.close();
         
         serial.setText(num);
         
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     }
    public void findId()
    {
        
        int i;
        try
        {
        Connection con;
        Statement stmt;
        ResultSet rs; 
        String host="jdbc:derby://localhost:1527/data_folder";
        String uName="rony";
        String uPass="rony";
        con = DriverManager.getConnection(host,uName,uPass);
            
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
         String sql="SELECT * FROM RONY.APPIONTMENT";
         rs=stmt.executeQuery(sql);
         
         if(rs.last())
         {
             idd=rs.getString("PATIENT_ID");
             i=Integer.parseInt(idd);
             i++;
             idd=Integer.toString(i); 
         }
         
         stmt.close();
         rs.close();
         doctorId.setText(ID);      
         patientId.setText(idd);
         
         
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
    public void Add()
    {   
       
        
        try{
             Connection con;
        Statement stmt;
        ResultSet rs; 
            
        String host="jdbc:derby://localhost:1527/data_folder";
        String uName="rony";
        String uPass="rony";
        con = DriverManager.getConnection(host,uName,uPass);
        
         
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      
         String sql="SELECT * FROM RONY.APPIONTMENT";
         rs=stmt.executeQuery(sql);
         rs.moveToInsertRow();
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

         
         
       //  doctorId.setText(ID);
         
         findNum();
         rs.updateString("DOCTOR_ID",doctorId.getText());
         rs.updateString("PATIENT_ID",idd);
         rs.updateString("SERIAL_NO",num);
         rs.updateString("FIRST_NAME",firstnm.getText());
         rs.updateString("LAST_NAME",lastnm.getText());
         rs.updateString("SEX",(String)sex.getSelectedItem());
         rs.updateString("ADDRESS",address.getText());
         rs.updateString("AGE",age.getText());
         rs.updateString("CONTACT",contact.getText());
         rs.updateString("DATE",sdf.format(date.getDate()));
         
        
         
         rs.insertRow();
         
         stmt.close();
         rs.close();
        // JOptionPane.showMessageDialog(this,"Successfully added...","message",-1);
         findId();
         //doctorId.setText("");
         firstnm.setText("");
         lastnm.setText("");
         contact.setText("");
         age.setText("");
         address.setText("");
         
       
        // dob.setDate();
         
        
         
        JOptionPane.showMessageDialog(this,"Record has been added","ADD",-1);
        
        
        
    }catch(Exception e)
    {
        System.out.println(e.getMessage()+"why???????");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastnm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        doctorId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        firstnm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        patientId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        serial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("APPOINTMENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 270, 70);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 300, 120, 30);

        lastnm.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lastnm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(lastnm);
        lastnm.setBounds(600, 300, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 410, 120, 30);

        doctorId.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        doctorId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(doctorId);
        doctorId.setBounds(220, 170, 150, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Doctor's ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 170, 120, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Sex");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 320, 120, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Contact No.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 410, 120, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("First Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 270, 120, 30);

        address.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address);
        address.setBounds(600, 410, 160, 30);

        age.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(age);
        age.setBounds(220, 370, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Age");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 360, 120, 30);

        sex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sex.setForeground(new java.awt.Color(0, 51, 204));
        sex.setMaximumRowCount(2);
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        sex.setSelectedIndex(1);
        getContentPane().add(sex);
        sex.setBounds(220, 320, 150, 30);

        contact.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(contact);
        contact.setBounds(220, 420, 150, 30);

        firstnm.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        firstnm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstnm);
        firstnm.setBounds(220, 270, 150, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("LogOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 80, 100, 40);

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(510, 160, 210, 40);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("HOME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(530, 80, 100, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital_Management/text.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 60, 820, 80);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Appointment Date");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 350, 160, 30);
        getContentPane().add(date);
        date.setBounds(600, 350, 160, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Patient's ID");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 222, 110, 30);

        patientId.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(patientId);
        patientId.setBounds(220, 222, 150, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Serial No.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(440, 240, 110, 30);

        serial.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(serial);
        serial.setBounds(600, 242, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login_Home login_home=new Login_Home();
        login_home.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Receptionist_home receptionist_home=new Receptionist_home();
        receptionist_home.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        Add();
    }//GEN-LAST:event_addActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField contact;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField doctorId;
    private javax.swing.JTextField firstnm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnm;
    private javax.swing.JTextField patientId;
    private javax.swing.JTextField serial;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
