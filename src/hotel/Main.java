/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import static java.lang.System.exit;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String []args){
        Admin a=new Admin();
    Customer c=new Customer();
    Hotel h=new Hotel(a);
     Room R = new Room();
    Cook e = new Cook();
    Owner o=new Owner("ABC@gmail.com","Street:xyz",031234567,h);
    Admin m=new Manager("Adeel","123","sunset ave","adeel123@gmail.com");
    Admin r=new Receptionist("Qasim Ali","12","qasim88@gmail.com","03141714","qasi");
    
    while(a.Login()==1){
        a.afterlogin();
            int  i;
           
        i=Integer.parseInt(JOptionPane.showInputDialog(null,"Choice","Input",JOptionPane.QUESTION_MESSAGE));
        switch(i){
            case 1:
                o.showDetails();
                break;
            case 2:
                c.setDetails();
                break;
            case 3:
                R.Roominfo();
                break;
            case 4:
                e.Employeedetails();
                break;
            case 5:
                m.showDetails();
                break;
            case 6:
                r.showDetails();
                break;

            case 7:
                 exit(0); 
                 break;
                 
            default:
               JOptionPane.showMessageDialog(null,JOptionPane.ERROR_MESSAGE);
                
        }
  

    }}
}
