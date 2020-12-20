/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Management;

/**
 *
 * @author J786N72
 */
public class Appointment_search extends javax.swing.JFrame {

    /**
     * Creates new form Appointment
     */
    public Appointment_search() {
        initComponents();
        setSize(850,650);
        setLocation(100,50);
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
        seach = new javax.swing.JButton();
        special = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        searchName = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital_Management/Receptionist_home_image.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        seach.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        seach.setForeground(new java.awt.Color(0, 0, 255));
        seach.setText("Search");
        seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachActionPerformed(evt);
            }
        });
        getContentPane().add(seach);
        seach.setBounds(450, 180, 220, 50);

        special.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        special.setForeground(new java.awt.Color(0, 0, 255));
        special.setMaximumRowCount(17);
        special.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Medicine", "Cardiologist", "neurologist", "Gynecologist", "Dermatologist", "Ophthalmologist", "Nephrologist", "Pediatrician", "Psychologist", "Urologist", "Pathologist", "Obstetrician", "Orthopaedic Surgeon", "Hematologist", "Anesthesiologist" }));
        getContentPane().add(special);
        special.setBounds(140, 180, 230, 50);

        back.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(310, 420, 210, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search By Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(141, 260, 230, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search By Specialist");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 116, 220, 40);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(name);
        name.setBounds(140, 310, 230, 50);

        searchName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchName.setForeground(new java.awt.Color(0, 0, 255));
        searchName.setText("Search");
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });
        getContentPane().add(searchName);
        searchName.setBounds(449, 310, 220, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital_Management/Receptionist_home_image.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachActionPerformed
        // TODO add your handling code here:
        Doctor_show dshow=new Doctor_show((String)special.getSelectedItem());
        dshow.setVisible(true);
        logInInfo.search="1";
    }//GEN-LAST:event_seachActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Receptionist_home rechom=new Receptionist_home();
        rechom.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
        // TODO add your handling code here:
        Doctor_show dshow=new Doctor_show(name.getText());
        dshow.setVisible(true);
        logInInfo.search="2";
    }//GEN-LAST:event_searchNameActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JButton seach;
    private javax.swing.JButton searchName;
    private javax.swing.JComboBox<String> special;
    // End of variables declaration//GEN-END:variables
}
