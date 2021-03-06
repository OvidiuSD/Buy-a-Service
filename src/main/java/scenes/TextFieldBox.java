package scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class TextFieldBox
{
    static String ret;

    public static String display(String title, String message)
    {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        TextField textField = new TextField();
        Button okButton = new Button("Ok");

        okButton.setOnAction(e -> {
            ret = textField.getText();
            window.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,textField,okButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return ret;
    }


}
