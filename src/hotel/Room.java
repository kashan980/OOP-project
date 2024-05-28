
package hotel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Room
{
     int TotalRooms = 10;
     int AvailableRooms = 5;
     int BookedRooms = 5;
    private Object room;
    
    //setter
    public void setTotalRooms(int tr){
        this.TotalRooms = tr;
    }
     public void setAvailableRooms(int ar){
        this.AvailableRooms = ar;
    }
     public void setBookedRooms(int br){
        this.BookedRooms = br;
    }
    //getter
    public int getTotalRooms(){
        return TotalRooms;
    }
    public int getAvailableRooms(){
        return AvailableRooms;
    }
    public int getBookedRooms(){
        return BookedRooms;
    }
    
    public void Roominfo(){
        try {
        FileWriter myWriter = new FileWriter("room.txt");
        
        myWriter.write(
                "Room.no: detail: "+"\n"+
                "1.  free "+"\n"+
                "2.  free "+"\n"+
                "3.  free "+"\n"+
                "4.  occupied "+"\n"+
                "5.  free "+"\n"+
                "6.  free "+"\n"+
                "7.  free "+"\n"+
                "8.  free "+"\n"+
                "9.  Occupied "+"\n"+
                "10. free ");
         myWriter.close();
        
      } 
      catch (IOException e) 
     {
          
        System.out.println("An error occurred.");
       e.printStackTrace();
      }
        int i=0;
        try {
        File read = new File("room.txt");  
            try (Scanner myReader = new Scanner(read)) {
                while (myReader.hasNext()) {
                    String n= myReader.next();
                    String I=myReader.next();
                   if(i!=0){
                    roomavail(n,I);
                   }    
                   if(i==0){
                System.out.println(n+"  "+I+"    ");}
                     i++;
                }  }
        } catch (Exception e) {
            System.out.println("An error occurred."+e);
        }
        
}
public void roomavail(String n,String I){
    if(I.compareTo("free")==0){
        System.out.println(n+"is Available");
    }
    if(I.compareTo("free")!=0){
        System.out.println(n+"is Not Available");
    }
}
}     