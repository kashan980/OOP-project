/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

public class Cook extends Employee
{
    private String Name = "Xavier";
    private int id = 123;
    private String Address = "Street:abc";


    //setter
    private void setName(String n){
        this.Name = n;
    }
    private void setid(int i){
            this.id = i;
    }
    private void setAddress(String a){
        this.Address = a;
    }
    //getter
    private String getName(){
        return Name;
    }
    private int getid(){
        return id;
    }
    private String getAddress(){
        return Address;
    }
    public void Employeedetails()
    {
        System.out.println("Name of Cook=" + getName());
        System.out.println("id of Cook=" + getid());
        System.out.println("Address of Cook=" + getAddress());
    }
    
}