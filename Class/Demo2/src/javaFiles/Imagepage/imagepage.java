package javaFiles.Imagepage;

import javafx.scene.Group;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class imagepage extends Application {
    public void start(Stage newStage) {

        Image ig = new Image("Assets/images/java.jpg");
        ImageView iv = new ImageView(ig);
        iv.setFitHeight(200);
        iv.setFitWidth(300);
       //  iv.setPreserveRatio(true);

        

        Label AA = new Label("JavaFX");
        
        AA.setFont(new Font(20));

        VBox vb  = new VBox(AA);
        vb.setPrefHeight(200);
        vb.setPrefWidth(300);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-Color:aqua");

        HBox hBox = new HBox(0);
       
        hBox.getChildren().addAll(iv, vb);

        Group gr = new Group(hBox);

        Scene sc = new Scene(gr);
        newStage.setTitle("Imagepage");

        sc.setFill(Color.YELLOW);
        

        newStage.setScene(sc);


        newStage.setHeight(1050);
        newStage.setWidth(1930);

        newStage.show();
    }

}
