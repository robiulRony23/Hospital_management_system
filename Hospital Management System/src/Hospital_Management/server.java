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

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class server {

    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(3222);
        Socket s = ss.accept();

        DataInputStream in = new DataInputStream((s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1,user,pass="";
       
        while (true) {
             user=in.readUTF();
             pass=in.readUTF();
             //out.writeUTF("OK");
             
             
        Connection con;
        Statement stmt;
        ResultSet rs;        
        
        try{
        String host="jdbc:derby://localhost:1527/data_folder";
        String uName="rony";
        String uPass="rony";
        con = DriverManager.getConnection(host,uName,uPass);
        stmt=con.createStatement();
    //  String pass="";
         String sql="SELECT * FROM RONY.ADMIN_LOGIN WHERE USERNAME='"+user+"' AND PASSWORD='"+pass+"'";
         rs=stmt.executeQuery(sql);
         
         if(rs.next())
         {
//             logInInfo logininfo=new logInInfo();
//             logininfo.adminId=usrnm;
//             logininfo.adminPass=usrpass;
             //adminId=usrnm;
             //setAdminId(usrnm);
             
             out.writeUTF("OK");
             
         }
         else
         {
             out.writeUTF("NO");
         }
        
        
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
          
        }
    }
}


