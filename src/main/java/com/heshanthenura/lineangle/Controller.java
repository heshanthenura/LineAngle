package com.heshanthenura.lineangle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;
import com.heshanthenura.lineangle.Coordinates.*;

public class Controller implements Initializable {
    double degree = 0;

    @FXML
    private Line MajorLine;

    @FXML
    private Line MinorLine;


    @FXML
    private Text deglable;

    @FXML
    private Slider degslider;

    @FXML
    private Button test;

    @FXML
    void test(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //angle slider input method
        degslider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                //Retrive angle from Slider
                degree = (int) degslider.getValue();

                //Change Lable To Value of Angle
                deglable.setText(Double.toString(degree)+"deg");

                //Change X coordinate
                MinorLine.setEndX(Coordinates.Xcord(degree));

                //Change Y coordinate
                MinorLine.setEndY(Coordinates.Ycord(-degree));

                System.out.println("X:"+MinorLine.getEndX()+", Y:"+MinorLine.getEndY());
                System.out.println("Degree:"+(degree));
            }
        });

    }
}