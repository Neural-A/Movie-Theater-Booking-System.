import java.util.*; 
import Utilities;

public class MovieTicket {
    //My Variables
    private String Movie_name;
    private double Price;
    private Utilities Seat_Type seatType;


    //Getters 
    public String getMovie_Name () 
    {
        try{
            return Movie_name; 
        }catch(IOException e) 
            {
                System.out.println("NAME NOT RETRIEVED"); 
        } 
    }; 

    public double getPrice() 
    {
        try{
            return Price; 
        }catch(IOException e) 
            {
               System.out.println("PRICE NOT RETRIEVED"); 
        } 
    }; 

    public static Utilities getSeatType()
    {
        try{
            return seatType; 
        }catch(IOException e) 
            {
                System.out.println("SEAT TYPE NOT RETRIEVED"); 
        } 
    };
    //Setters 
    public void setName(String Movie_name) 
    { 
       try{
           this.Movie_name =  Movie_name;
       }catch(IOException e)
           {
               System.out.println("NAME NOT SET");
           }
    }

    public void setPrice(double Price) 
    {
       try{
           this.Price =  Price;
       }catch(IOException e)
           {
               System.out.println("PRICE NOT SET");
           }
    }

    public void setSeatType(Utilities Seat_Type) 
    {
        try
        {this.Seat_Type = Type; }
        catch(IOException e) 
            {
                System.out.println("SEAT NOT RETRIEVED"); 
            }
    }
    //My Actuall methods

    public double SelectSeat()
    {
        if (getSeatType()  == getSeatType().standard)
        {
            Price =  17.59;
        } else if(getSeatType() == getSeatType()I.premium)
        {
            getPrice() =  17.59*1.5;
        }else if (getSeatType() == getSeatType().recliner)
        {
            getPrice() =  17.59*2.5;
        }else if (getSeatType() == getSeatType().luxury) {
            getPrice() =  17.59*3.5;
        }else if (getSeatType() == getSeatType().couples)
        {
            getPrice() =  17.59*5.5;
        }
        return getPrice();
    }

    public void PrintT()
    {
        System.out.println(
                "MOVIE NAME: "+Movie_name+ "\n"
                +"SEAT TYPE: "+ seatType+ "\n"
                +"TOTAL PRICE: "+ SelectSeat(seatType)
        );
    }

}
