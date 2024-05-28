/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import static java.lang.System.exit;
import java.util.Scanner;

public class Customer 
{
    Scanner cin = new Scanner(System.in);
    Scanner cin1 = new Scanner(System.in);
    Scanner cin2 = new Scanner(System.in);
    Scanner cin3 = new Scanner(System.in);
    Scanner cin4 = new Scanner(System.in);
    Scanner cin5 = new Scanner(System.in);
   private String CustomerName;
    private String CustomerEmailid;
    private String CustomerId;
    private String ContactNo;
    Fooditem fooditem = new Fooditem();
    private int[] v = new int[11];
    
    private void setCustomerName(String cn){
        this.CustomerName = cn;
    }
    private void setCustomerEmailid(String cid ){
        this.CustomerEmailid = cid;
    }
    private void setCustomerId(String id){
        this.CustomerId = id;
    }
    private void setContactNo(String ct){
        this.ContactNo = ct;
    }
    private void setv(int[]v)
    {
        this.v = v;
    } 
    
    //getter
    private String getCustomerName(){
        return CustomerName;
    }
    private String getCustomerEmailid(){
        return CustomerEmailid;
    }
    private String getCustomerId(){
        return CustomerId;
    }
    private String getContactNo(){
        return ContactNo;
    }
    private int[] getv()
    {
        return v;
    }
  
    public void setDetails()
    {
        int i ;
        System.out.println("Please Enter Your Name = " );
        CustomerName = cin.next();
        System.out.println("Enter Your Email ID = "  );
        CustomerEmailid = cin1.nextLine();
        System.out.println("Id of Customer=" );
        CustomerId = cin2.next();
        System.out.println("ContactNo of Customer=");
        ContactNo = cin4.next();
        System.out.println("1. Order Food");
        System.out.println("2. exit");
        i = cin5.nextInt();
        if(i == 1)
        {
            fooditem.Fooditemdetails();
           fooditem.Bill();
            System.out.println("Your Order Will Arrive Soon");
            System.out.println("Thank you! Mr."+CustomerName);
        }
        else if(i == 2)
        {
           exit(0);
        }
    }
   
    }
