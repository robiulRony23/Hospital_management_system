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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author J786N72
 */
public class Search_receptionist extends javax.swing.JFrame {

    /**
     * Creates new form Add_patient
     */
    public Search_receptionist() {
        initComponents();
        setSize(850,650);
        setLocation(100,50);
    }
    public void update(String idd)
    { 
        try{
            
        String host="jdbc:derby://localhost:1527/data_folder";
        String uName="rony";
        String uPass="rony";
        con = DriverManager.getConnection(host,uName,uPass);
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      
         String sql="SELECT * FROM RONY.RECEP_LOGIN WHERE ID='"+idd+"'";
         rs=stmt.executeQuery(sql);
         rs.next();
         
         rs.deleteRow();
         
         stmt.close();
         rs.close();
    }
        catch(Exception e)
    {
        System.out.println(e.getMessage()+"here");
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

        home = new javax.swing.JButton();
        view = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        firstnm = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        lastnm = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        bloodgrp = new javax.swing.JComboBox<>();
        marit = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        joinDate = new com.toedter.calendar.JDateChooser();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        home.setBackground(new java.awt.Color(153, 153, 153));
        home.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        home.setText("Search Receptionist");
        getContentPane().add(home);
        home.setBounds(289, 10, 260, 40);

        view.setBackground(new java.awt.Color(204, 204, 204));
        view.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        view.setText("View Receptionist");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(570, 10, 210, 40);

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        add.setText("Add Receptionist");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(30, 10, 240, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 60, 760, 0);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 204));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 62, 800, 10);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("SEARCH RECEPTIONIST");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 80, 400, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 230, 100, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("ID NO.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 70, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Blood group");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 410, 110, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("First Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 100, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Sex");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 290, 70, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Date Of Birth");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 290, 130, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Marital Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 350, 120, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 390, 110, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("e-mail");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 450, 110, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("LogOut");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(670, 80, 120, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("HOME");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(550, 80, 110, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital_Management/text.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 70, 800, 70);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("LogOut");
        getContentPane().add(jButton9);
        jButton9.setBounds(670, 80, 120, 40);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("LogOut");
        getContentPane().add(jButton10);
        jButton10.setBounds(670, 80, 120, 40);

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(640, 520, 170, 60);

        firstnm.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        firstnm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstnm);
        firstnm.setBounds(180, 230, 190, 30);

        id.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(id);
        id.setBounds(180, 180, 190, 30);

        lastnm.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lastnm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(lastnm);
        lastnm.setBounds(600, 230, 190, 30);

        contact.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(contact);
        contact.setBounds(180, 480, 190, 30);

        sex.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sex.setMaximumRowCount(3);
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        getContentPane().add(sex);
        sex.setBounds(180, 290, 190, 30);

        bloodgrp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bloodgrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A(+)ve", "A(-)ve", "B(+)ve", "B(-)ve", "AB(+)ve", "AB(-)ve", "O(+)ve", "O(-)ve" }));
        getContentPane().add(bloodgrp);
        bloodgrp.setBounds(180, 410, 190, 30);

        marit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        marit.setMaximumRowCount(3);
        marit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Unmarried" }));
        getContentPane().add(marit);
        marit.setBounds(180, 350, 190, 30);

        email.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(600, 450, 190, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Contact No.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 480, 100, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Joining date");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 550, 140, 40);

        address.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(address);
        address.setBounds(600, 400, 190, 30);

        search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(420, 170, 150, 40);

        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(430, 520, 180, 60);
        getContentPane().add(joinDate);
        joinDate.setBounds(180, 550, 190, 30);
        getContentPane().add(dob);
        dob.setBounds(600, 290, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Qualification");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(440, 340, 110, 40);

        qualification.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        qualification.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(qualification);
        qualification.setBounds(600, 350, 190, 30);

        refresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(0, 0, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh);
        refresh.setBounds(630, 160, 120, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Add_receptionist add_receptionist=new Add_receptionist();
        add_receptionist.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Admin_home admin_home=new Admin_home();
        admin_home.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Login_Home login_home=new Login_Home();
        login_home.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
            reception_table rtable=new reception_table();
        rtable.setVisible(true);
       // dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_viewActionPerformed
        Connection con;
        Statement stmt;
        ResultSet rs;
        boolean point=false;
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
        
        try{    
            
            if(point)
            {
         stmt.close();
        rs.close();
            }
        String host="jdbc:derby://localhost:1527/data_folder";
        String uName="rony";
        String uPass="rony";
        con = DriverManager.getConnection(host,uName,uPass);
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      
         
         String sql="SELECT * FROM RONY.RECEPTION_DETAILS WHERE ID='"+id.getText()+"'";
         rs=stmt.executeQuery(sql);
        
        if(rs.next())
        {
         firstnm.setText(rs.getString("FIRST_NAME"));
         lastnm.setText(rs.getString("LAST_NAME"));
         contact.setText(rs.getString("PHONE"));
         email.setText(rs.getString("EMAIL"));
         qualification.setText(rs.getString("QUALIFICATION"));
         address.setText(rs.getString("ADDRESS"));
         marit.setSelectedItem(rs.getString("MARITAL_STATUS"));
         bloodgrp.setSelectedItem(rs.getString("BLOOD_GRP"));
         sex.setSelectedItem(rs.getString("SEX"));
         
         Date sdf=new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("JOIN_DATE"));
         joinDate.setDate(sdf);
         Date sd=new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("DOB"));
         dob.setDate(sd);
         
         point=true;
         
        }
        else
        {
          JOptionPane.showMessageDialog(this,"Invalid ID!!!!!!!!!","ERROR",JOptionPane.ERROR_MESSAGE);  
        }
        
        
        
    }catch(Exception e)
    {
        System.out.println(e.getMessage()+"here broooo!!!!!!!!!!!!!");
    }
    }//GEN-LAST:event_searchActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
         id.setText("");
         firstnm.setText("");
         lastnm.setText("");
         contact.setText("");
         email.setText("");
         qualification.setText("");
         marit.setSelectedItem("Married");
         sex.setSelectedItem("Male");
         bloodgrp.setSelectedItem("A(+)ve");
         address.setText("");
         try
         {
        stmt.close();
        rs.close();
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
         
        
        
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(this,"Do you really want to delete??","DELETE",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            try
        {
            rs.deleteRow();
           
            id.setText("");
         firstnm.setText("");
         lastnm.setText("");
         contact.setText("");
         email.setText("");
         qualification.setText("");
         marit.setSelectedItem("Married");
         sex.setSelectedItem("Male");
         bloodgrp.setSelectedItem("A(+)ve");
         address.setText("");
         stmt.close();
        rs.close();
        update(rs.getString("ID"));
             
        }
        catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
        }
        
       
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(this,"Do you really want to update??","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
        try
        {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
         rs.updateString("ID",id.getText());
         rs.updateString("FIRST_NAME",firstnm.getText());
         rs.updateString("LAST_NAME",lastnm.getText());
         rs.updateString("SEX",(String)sex.getSelectedItem());
         rs.updateString("DOB",sdf.format(dob.getDate()));
         rs.updateString("MARITAL_STATUS",(String)marit.getSelectedItem());
         rs.updateString("BLOOD_GRP",(String)bloodgrp.getSelectedItem());
         rs.updateString("PHONE",contact.getText());
         rs.updateString("EMAIL",email.getText());
         rs.updateString("JOIN_DATE",sdf.format(joinDate.getDate()));
         rs.updateString("QUALIFICATION",qualification.getText());
         rs.updateString("ADDRESS",address.getText());
         
         rs.updateRow();
         
         stmt.close();
         rs.close();
        }
        catch(Exception e)
        {
             System.out.println(e.getMessage());
        }
        }
         
        
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Search_receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_receptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> bloodgrp;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstnm;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser joinDate;
    private javax.swing.JTextField lastnm;
    private javax.swing.JComboBox<String> marit;
    private javax.swing.JTextField qualification;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
