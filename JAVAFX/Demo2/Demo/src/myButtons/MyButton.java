package myButtons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyButton extends Application {

    public void start(Stage prstage) {

        Label username = new Label("USERNAME");
        username.setFont(new Font(30));
        TextField txt = new TextField();
        txt.setMaxWidth(150);

        Label password = new Label("PASSWORD");
        password.setFont(new Font(30));
        PasswordField ps = new PasswordField();
        ps.setMaxWidth(150);

        Image ig = new Image("Assests/Images/Road.jpeg");
        ImageView iv = new ImageView(ig);

        Button show = new Button("Show");

        show.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                System.out.println(txt.getText());
                System.out.println(ps.getText());

                Label lb1 = new Label("Enter UserName" + txt.getText());
                Label lb2 = new Label("Enter Password" + ps.getText());

            }
        });

        VBox vb = new VBox(20, username, txt, password, ps, show);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: AQUA;");
        Scene scene = new Scene(vb, 400, 300);

        prstage.setScene(scene);
        prstage.show();

    }

}
