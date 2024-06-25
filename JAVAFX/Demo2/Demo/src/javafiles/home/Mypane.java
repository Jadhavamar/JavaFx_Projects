package javafiles.home;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Mypane extends Application {

    public void start(Stage prStage) {

        BorderPane borderPane = new BorderPane();

        Label top = new Label("Top");
        top.setFont(new Font(40));

        Label bottom = new Label("Bottom");
        bottom.setFont(new Font(40));

        Label left = new Label("Left");
        left.setFont(new Font(40));

        Label right = new Label("Right");
        right.setFont(new Font(40));

        Label centre = new Label("Centre");
        centre.setFont(new Font(40));

        StackPane toPane = new StackPane(top);
        toPane.setAlignment(Pos.CENTER);

        borderPane.setTop(top);
        borderPane.setBottom(bottom);
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setCenter(centre);

        Scene scene = new Scene(borderPane, 400, 450);
        scene.setFill(Color.ORANGE);
        scene.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(scene);
        prStage.setTitle("BorderPane Example");
        prStage.show();

    }
}
