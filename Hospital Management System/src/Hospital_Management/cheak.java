/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Management;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author ASUS
 */
public class cheak {
    public static void main(String[] args) {
        String us="rony";
        String usp="rony";
        try
        {
            FileReader file=new FileReader("loginreception.txt");
            BufferedReader fin=new BufferedReader(file);
            String str,usernm,userpass;
            while((str=fin.readLine())!=null)
            {
                   StringTokenizer st=new StringTokenizer(str,"#");
                   usernm=st.nextToken();
                   userpass=st.nextToken();
                   if(usernm.equals(us) && userpass.equals(usp))
                   {
                       str="not null bro :)";
                       System.out.println("yes");
                       break;
                       //dispose();
                   }
            }
            if(str==null)
            {
                System.out.println("no");
                //error.setVisible(true);
            }
        }catch(Exception e)
        {
            System.out.println("Exception found : "+ e);
        }
    }
    
}
