/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Management;

/**
 *
 * @author ASUS
 */
import javax.swing.*;

public class error_msg {
    //JFrame frame=new JFrame();
    error_msg() {
        JOptionPane.showMessageDialog(null,"username or password is invalid!!!!","Message",JOptionPane.ERROR_MESSAGE);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

