package javafiles;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ImagePage extends Application {

    public void start(Stage prstage) throws Exception {

        prstage.setTitle("Car");
        prstage.setWidth(400);
        prstage.setHeight(600);

        Image ig = new Image("Assests/Images/Road.jpeg");
        ImageView iv = new ImageView(ig);
        iv.setFitWidth(470);
        iv.setFitHeight(400);
        // iv.preserveRatioProperty();

        Label lb = new Label("Mountains");
        lb.setFont(new Font(40));

        VBox vb1 = new VBox(iv);
        vb1.setPrefWidth(470);
        vb1.setPrefHeight(400);

        VBox vb2 = new VBox(lb);
        vb2.setPrefHeight(570);
        vb2.setPrefWidth(400);
        vb2.setAlignment(Pos.CENTER);

        HBox hb = new HBox(vb1, vb2);
        hb.setPrefWidth(800);
        hb.setPrefHeight(300);
        hb.setStyle("-fx-background-color: AQUA;");

        Group gr = new Group(hb);
        Scene sc = new Scene(gr, 1140, 800);
        sc.setFill(Color.INDIANRED);
        sc.setCursor(Cursor.OPEN_HAND);

        prstage.setScene(sc);
        prstage.show();

    }

}
