/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;


public class Receptionist extends Admin{
    String Name;
    String ID;
    String Emailid;
    String ContactNo;
    String Address;
    
    public Receptionist(String ne,String iD,String Ed,String Cn,String as){
        Name = ne;
        ID = iD;
        Emailid = Ed;
        ContactNo = Cn;
        Address = as;
    }
    //setter
    public void setName(String ne){
        this.Name = ne;
    }
    public void setID(String iD){
        this.ID = iD;
    }
    public void setEmailid(String Ed){
        this.Emailid = Ed;
    }
    public void setContactNo(String Cn){
        this.ContactNo = Cn;
    }
    public void setAddress(String as){
        this.Address = as;
    }
    //getter
    public String getName(){
        return Name;
    }
    public String getID(){
        return ID;
    }
    public String getEmailid(){
        return Emailid;
    }
    public String getContactNo(){
        return ContactNo;
    }
    public String getAddress(){
        return Address;
    }
    public void Checkroomavailability(){
        System.out.println("Receptionist checks whether the room is available or not");
    }
    public void BookRoom(){
        System.out.println("Receptionsit books a room");
    }
    public void GenerateBill(){
        System.out.println("Receptionist generate a bill");
    }
    @Override
    public void showDetails(){
        System.out.println("Name of Receptionist: " + Name);
        System.out.println("ID of Receptionist: " + ID);
        System.out.println("Emailid of Receptionist:" + Emailid);
        System.out.println("ContactNo of Receptionist: " + ContactNo);
        System.out.println("Address of Receptionist: " + Address);
    }
    
}
