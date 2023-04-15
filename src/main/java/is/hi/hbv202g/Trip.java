package is.hi.hbv202g;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Trip implements Booking {
    private String tour;

    public Trip(String tour) {
        this.tour = tour;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    @Override
    public void bookTrip(String trip, Customer customer) {
        book(trip, customer);
    }

    public void book(String trip, Customer customer){
        System.out.println("Trip " + trip + " booked by "+ customer.getName()+" ("+customer.getEmail()+")");
    }
}
