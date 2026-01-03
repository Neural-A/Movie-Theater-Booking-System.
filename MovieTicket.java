public class MovieTicket {

    //For the types of seats
    public enum Seat_Type
    {
        standard,
        premium,
        recliner,
        luxury,
        couples
    };

    //My Variables
    String Movie_name;
    double Price;
    Seat_Type seatType;

    //My Actuall methods

    public double SelectSeat(Seat_Type myseat)
    {
        if (myseat  == Seat_Type.standard)
        {
            Price =  17.59;
        } else if(myseat == Seat_Type.premium)
        {
            Price =  17.59*1.5;
        }else if (myseat == Seat_Type.recliner)
        {
            Price =  17.59*2.5;
        }else if (myseat == Seat_Type.luxury) {
            Price =  17.59*3.5;
        }else if (myseat == Seat_Type.couples)
        {
            Price =  17.59*5.5;
        }
        return Price;
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
