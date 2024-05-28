/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import static java.lang.System.exit;
import java.util.*;
import javax.swing.JOptionPane;

public class Admin 
{
    Scanner cin = new Scanner(System.in);
    Scanner cin1 = new Scanner(System.in);
    Scanner cin2 = new Scanner(System.in);
    final private String AdminID = "1234";
    final private String AdminPass = "1234";
      
    
    private String getAdminID()
    {
        return AdminID;
    }
    private String getAdminPass()
    {
        return AdminPass;
    }
            
    
    public int Login()
    {
       int logi=0;
        String id = Integer.toString(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Admin ID","Input",JOptionPane.QUESTION_MESSAGE)));;
        if(id.compareTo(AdminID)==0)
        {
            String pass = Integer.toString(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Admin Password","Input",JOptionPane.QUESTION_MESSAGE)));;
        
            if(pass.compareTo(AdminPass)==0)
            {
               
                logi=1;
            }    
            else
            {
                System.out.println("Wrong Passwrd");
                
            }
        }
        else
        {
            System.out.println("Wrong ID");
        }
        return logi;
    }
    void afterlogin(){
         showDetails();
    }
    
    public void showDetails()
    {
        System.out.println("1. Show Hotel Details");
        System.out.println("2. Enter Customer Details");
        System.out.println("3. Check Rooms Availability" );
        System.out.println("4. Employee Details" );
        System.out.println("5. Manager Details" );
        System.out.println("6. Receptionist Details" );
        System.out.println("7. Exit");
        
    }
    
}
