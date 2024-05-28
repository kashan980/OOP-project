/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Riphah
 */
public class Manager extends Admin{
    String ManagerName;
    String ManagerID;
    String ManagerAddress;
    String ManagerEmailid;

    public Manager(String mn,String mi,String ma,String me){
        ManagerName = mn;
        ManagerID = mi;
        ManagerAddress = ma;
        ManagerEmailid = me;
    }
    
    //setter
    public void setManagerName(String mn){
        this.ManagerName = mn;
    }
    public void setManagerID(String mi){
        this.ManagerID = mi;
    }
    public void setManagerAddress(String ma){
        this.ManagerAddress = ma;
    }
    public void setManagerEmailid(String me){
        this.ManagerEmailid = me;
    }
    //getter
    public String getManagerName(){
        return ManagerName;
    }
    public String getManagerID(){
        return ManagerID;
    }
    public String getManagerAddress(){
        return ManagerAddress;
    }
    public String getManagerEmailid(){
        return ManagerEmailid;   
    }
    public void purchaseInventory(){
        System.out.println("Manager purchases a Inventory");
    }
    public void Recordcomplaints(){
        System.out.println("Manager record complaints of Custoemers");
    }
    public void Managestaff(){
        System.out.println("Manager manages the staff");
    }
    @Override
    public void showDetails(){
        System.out.println("Name of Manager:" + ManagerName);
        System.out.println("ID of Manager: " + ManagerID);
        System.out.println("Address of Manager: " + ManagerAddress);
        
    }
    
    
}
