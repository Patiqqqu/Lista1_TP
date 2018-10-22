package main.java.testfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button plus1, minus, multi, div;
    @FXML
    private TextField text1, text2;
    @FXML
    private TextArea textresult;

    private void clearfields() {
        text1.clear();
        text2.clear();
    }


    void addition() {
        textresult.setText(String.valueOf((Double.parseDouble(text1.getText())) + (Double.parseDouble(text2.getText()))));
        clearfields();
    }

    @FXML
    void subtraction() {
        textresult.setText(String.valueOf((Double.parseDouble(text1.getText())) - (Double.parseDouble(text2.getText()))));
        clearfields();
    }

    @FXML
    final void multiplication() {
        textresult.setText(String.valueOf((Double.parseDouble(text1.getText())) * (Double.parseDouble(text2.getText()))));
        clearfields();
    }

    @FXML
    final void division() {
        if ((Double.parseDouble(text2.getText())) == 0) {
            textresult.setText("Nie wolno dzielić przez zero!!!!");
            clearfields();
        } else {
            textresult.setText(String.valueOf((Double.parseDouble(text1.getText())) / (Double.parseDouble(text2.getText()))));
            clearfields();
        }
    }
}
