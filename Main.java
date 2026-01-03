import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        MovieTicket myT = new MovieTicket();
       Scanner myscanner =  new Scanner(System.in);
        System.out.println("WELCOME TO ATHEATER!!");
        System.out.println("Enter Movie Name: ");
        myT.Movie_name = myscanner.nextLine();
        System.out.println(
                "Enter SEAT TYPE: \n"+
                "1. Standard\n"+
                "2. Premium\n"+
                "3. Recliner\n"+
                "4. Luxury\n"+
                "5. Couples"
        );
        String temp_string =  myscanner.nextLine();
        myT.seatType = myT.seatType.valueOf(temp_string.toLowerCase());
        myT.SelectSeat(myT.seatType);
        myT.PrintT();
       myscanner.close();
    }
}
