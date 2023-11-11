package homework;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private URL location;
    @FXML
    private ResourceBundle resources;

    @FXML
    private ChoiceBox<String> choices;

    @FXML
    private Label gram;

    @FXML
    private TextField textField;

    @FXML
    private Label killogram;

    @FXML
    private Label ton;

    @FXML
    void initialize() {
        Choice();
        choices.setOnAction(actionEvent -> Start());
    }

    void Choice() {
        ObservableList<String> lab = FXCollections.observableArrayList("Тонны", "Килограммы", "Граммы");
        choices.setItems(lab);
    }

    void Text() {
        textField.textProperty().addListener(
                (observable, oldValue, newValue) -> ton.setText(newValue));
    }

    void Start() {
        if (choices.getValue().equals("Тонны")) {
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> ton.setText(newValue));
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> killogram.setText(Integer.toString(Integer.parseInt(newValue)*1000)));
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> gram.setText(Integer.toString(Integer.parseInt(newValue)*1000000)));
        } else if (choices.getValue().equals("Килограммы")) {
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> ton.setText(Double.toString(Double.parseDouble(newValue)*0.001)));
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> killogram.setText(newValue));
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> gram.setText(Integer.toString(Integer.parseInt(newValue)*1000)));
        } else if (choices.getValue().equals("Граммы")) {
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> ton.setText(Double.toString(Double.parseDouble(newValue)*0.001)));
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> killogram.setText(newValue));
            textField.textProperty().addListener(
                    (observable, oldValue, newValue) -> gram.setText(Double.toString(Double.parseDouble(newValue)*0.000001)));
        }

    }
}

