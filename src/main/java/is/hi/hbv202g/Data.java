package is.hi.hbv202g;

import java.util.ArrayList;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Data {
    public Data(){}

    public ArrayList<Tour> getTours() {
        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour("Sightseeing"));
        tours.add(new Tour("Horse riding"));
        return tours;
    }

    public ArrayList<Hotel> getHotel(){
        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Hotel 1"));
        hotels.add(new Hotel("Hotel 2"));

        return hotels;
    }


}
