package is.hi.hbv202g;

/**
 * @author Ester Jenný (ejb7)
 **/
public interface Booking {
    void bookTour(Tour trip, Customer customer);
    void bookHotel(Hotel hotel, Customer customer);

}

