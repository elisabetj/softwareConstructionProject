package is.hi.hbv202g;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Trip implements Booking {

    @Override
    public void bookTrip(Tour tour, Customer customer) {
        book(tour, customer);
    }

    public void book(Tour tour, Customer customer){
        System.out.println("Trip " + tour.getTour() + " booked by "+ customer.getName()+" ("+customer.getEmail()+")");
    }
}

