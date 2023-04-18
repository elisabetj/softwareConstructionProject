package is.hi.hbv202g;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        String tourName = "tour";

        String name = "Name";
        String email = "email";


        Customer customer = new Customer(name, email);
        Tour tour = new Tour(tourName);
        Booking booking = new Trip();

        booking.bookTrip(tour, customer);


       }
    }



