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
        String hotelName = "hotel";


        Customer customer = new Customer(name, email);
        Tour tour = new Tour(tourName);
        Hotel hotel = new Hotel(hotelName);
        Booking booking = new Trip();
        Booking accomodation = new Trip();

        booking.bookTour(tour, customer);

        accomodation.bookHotel(hotel, customer);


       }
    }



