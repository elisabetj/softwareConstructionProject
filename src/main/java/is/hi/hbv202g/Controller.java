package is.hi.hbv202g;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import sun.jvm.hotspot.utilities.Observable;

import java.awt.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView tourListView;
    @FXML
    private ListView hotelListView ;
    @FXML
    private TextField customerTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private Button addButton;

    private Data data = new Data();
    private ObservableList<Tour> tour = FXCollections.observableArrayList();
    private ObservableList<Hotel> hotel = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tour = data.getTour();
        tourListView.setItems(tour);

        hotel = data.getHotel();
        hotelListView.setItems(hotel);
    }
}
