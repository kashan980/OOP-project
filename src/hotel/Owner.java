/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;


public class Owner 
{
    final String OwnerName = "Kashan , Siyab , Rayyan";
    String Emailid;
    String Address;
    int ContactNo;
    Hotel hotel;
    
    public Owner(String el,String ae,int co, Hotel hotel)
    {
        Emailid = el;
        Address = ae;
        ContactNo = co;
        this.hotel = hotel;
    }
    //setter
    public void setEmailid(String el)
    {
        this.Emailid = el;
    }
    public void setAddress(String ae)
    {
        this.Address = ae;
    }
    public void setContactNo(int co)
    {
        this.ContactNo = co;
    }
    public void sethotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    //getter
    public String getEmailid(){
        return Emailid;
    }
    public String getAddress()
    {
        return Address;
    }
    public int getContactNo()
    {
        return ContactNo;
    }
    public Hotel gethotel()
    {
        return hotel;
    }
    public void showDetails()
    {
        System.out.println("Name of Owner=" + OwnerName);
        System.out.println("Emailid of Owner=" + Emailid);
        System.out.println("Address of Owner=" + Address);
        System.out.println("ContactNo of Owner=" + ContactNo);
         System.out.println("Hotel.=" + hotel.HotelName);
        System.out.println("Hotel.=" + hotel.Location);
      
        
    }
    
}