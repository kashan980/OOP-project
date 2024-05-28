/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.io.File;
import java.util.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Riphah
 */
public class Fooditem extends DefaultTableModel implements IMenu
{
    Scanner cin = new Scanner(System.in);
    Scanner cin1 = new Scanner(System.in);
    int ID; 
    public int bill;

   
    
    //setter
    public void setID(int iD){
        this.ID = iD;
    }
    
 
    //getter
    public int getID(){
        return ID;
    }
    
    
    public void Fooditemdetails(){
//        try {
//        FileWriter myWriter = new FileWriter("Fooditem.txt");
//        
//        myWriter.write(
//                "S.no: Item: Price:"+"\n"+
//                "1.  Karahi  1200"+"\n"+
//                "2.  Karahi  1000"+"\n"+
//                "3. Nehari 500"+"\n"+
//                "4. Fish 800"+"\n"+
//                "5.  Pulao 300"+"\n"+
//                "6. Biryani 350"+"\n"+
//                "7.  Burger 250"+"\n"+
//                "8.  Pizza 1350"+"\n"+
//                "9.  Tikka 550"+"\n"+
//                "10.  Fries 150");
//        
//    myWriter.close();
//        
//      } 
//      catch (IOException e) 
//     {
//          
//        System.out.println("An error occurred.");
//       e.printStackTrace();
//      }
        try {
        File read = new File("Fooditem.txt");  
            Scanner myReader = new Scanner(read);
            while (myReader.hasNext()) {
                String n= myReader.next();
                String I=myReader.next();
                String d=myReader.next();
                ArrayList sis=new ArrayList();
                sis.add(n);
                sis.add(I);
                sis.add(d);
               System.out.println(sis);
               
        
        }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred."+e);
        }
         

                System.out.println("******************************"+"\n"+"11.Press 11 to complete your Order"+"\n"+
                "12.Press 12 to Remove something from your order your Order");    
    }
    
    
    public void Bill()
     
     {
         do{
         System.out.println("Enter Corresponding Serial Number");
         ID = cin.nextInt();
         
         if(ID<=11&&ID>0){
        switch (ID){
            case 1:
             bill=bill+1200;
             break;
            case 2:
             bill=bill+1000;
         break;
            case 3:
            bill=bill+500;
         break;
            case 4:
             bill=bill+800; 
         break;
            case 5:
             bill=bill+300;
         break;
            case 6:
           bill=bill+350;
         break;
            case 7:
           bill=bill+250; 
         break;
            case 8:
             bill=bill+1350; 
        break;
            case 9:
             bill=bill+550; 
         break;
            case 10:
             bill=bill+150; 
         break;
         
         
                 } 
         }
         if(ID==12){
             
             System.out.println("Enter Number you want to Remove from Order");
             int nID=cin1.nextInt();
         switch (nID){
            case 1:
             bill=bill-1200;
             break;
            case 2:
             bill=bill-1000;
         break;
            case 3:
            bill=bill-500;
         break;
            case 4:
             bill=bill-800; 
         break;
            case 5:
             bill=bill-300;
         break;
            case 6:
           bill=bill-350;
         break;
            case 7:
           bill=bill-250; 
         break;
            case 8:
             bill=bill-1350; 
        break;
            case 9:
             bill=bill-550; 
         break;
            case 10:
             bill=bill-150; 
         break;
         
     }
     }}while(ID!=11);
         if (ID>12){
             System.out.println("Wrong Input");
         }
         System.out.println("Your Bill: "+bill);
         bill=0;
    
}}
