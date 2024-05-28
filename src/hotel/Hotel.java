package hotel;


public class Hotel 
{
    final String HotelName = "Margalla Hotel And Restraunt";
    String Location = "Kashmir Highway Near Serena Hotel";
    String Rating = "5 Star"  ;
    Admin admin;
    
    public Hotel(Admin admin)
    {
        this.admin = admin;
    }
    //setter
    public void setLocation(String lo){
        this.Location = lo;
    }
    public void setadmin(Admin admin)
    {
        this.admin = admin;
      
    }
    public void setRating(String Rating){
      this.Rating = Rating;
    }
    //getter`
    public String getHotelName(){
        return HotelName;
    }
    public String getLocation(){
        return Location;
    }
    public String getRating(){
        return Rating;
    }
    public Admin getadmin()
    {
        return admin; 
    }
    
    public void showDetails()
    {
        System.out.println("Name of Hotel: " + HotelName);
        System.out.println("Location of Hotel: " + Location);
        System.out.println("Rating of Hotel: " + Rating);
        System.out.println(" ");
    }
    
}
