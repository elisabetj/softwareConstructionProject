package is.hi.hbv202g;

import javafx.fxml.FXML;

import javax.swing.text.html.ListView;
import java.awt.*;
import java.util.ResourceBundle;

public class Controller {

    // name
    @FXML
    private TextField ;

    // email
    @FXML
    private TextField ;

    // reservation
    @FXML
    private ListView hotelList;


    // hotel eda trip

    @FXML
    private ListView tourList;

    private Data data = new Data();
    // private ObserbleList a eftir ad setja inn Customer

    @Override
    public void initialse(URL locaton, ResourceBundle resources) {
        customer = data.getCustomer();

    }









}
