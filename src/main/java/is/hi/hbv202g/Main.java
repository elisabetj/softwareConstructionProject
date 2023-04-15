package is.hi.hbv202g;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        String tour = "tour";

        String name = "Name";
        String email = "email";

        Booking booking = new Trip(tour);
        Customer customer = new Customer(name, email);

        booking.bookTrip(tour, customer);


       }
    }



