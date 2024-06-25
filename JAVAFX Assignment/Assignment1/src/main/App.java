package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override

    public void start(Stage prstage) {

        prstage.setTitle("Stage Practical");
        prstage.setWidth(1000);
        prstage.setHeight(800);

        Label lb = new Label("JAVA");
        lb.setFont(new Font(40));
        lb.setPrefWidth(300);
        lb.setPrefHeight(150);
        lb.setAlignment(Pos.CENTER);
        lb.setStyle("-fx-background-color:AQUA;");

        Label lb1 = new Label("PYTHON");
        lb1.setFont(new Font(40));
        lb1.setPrefWidth(300);
        lb1.setPrefHeight(150);
        lb1.setAlignment(Pos.CENTER);
        lb1.setStyle("-fx-background-color:ORANGE;");

        Label lb2 = new Label("C");
        lb2.setFont(new Font(40));
        lb2.setPrefWidth(300);
        lb2.setPrefHeight(150);
        lb2.setAlignment(Pos.CENTER);
        lb2.setStyle("-fx-background-color:GREEN;");

        Label lb3 = new Label("C++");
        lb3.setFont(new Font(40));
        lb3.setPrefWidth(300);
        lb3.setPrefHeight(150);
        lb3.setAlignment(Pos.CENTER);
        lb3.setStyle("-fx-background-color:SANDYBROWN;");

        Label lb4 = new Label("SPRING");
        lb4.setFont(new Font(40));
        lb4.setPrefWidth(300);
        lb4.setPrefHeight(150);
        lb4.setAlignment(Pos.CENTER);
        lb4.setStyle("-fx-background-color:AQUA;");

        Label lb5 = new Label("REACT JS");
        lb5.setFont(new Font(40));
        lb5.setPrefWidth(300);
        lb5.setPrefHeight(150);
        lb5.setAlignment(Pos.CENTER);
        lb5.setStyle("-fx-background-color:ORANGE;");

        Label lb6 = new Label("FLUTTER");
        lb6.setFont(new Font(40));
        lb6.setPrefWidth(300);
        lb6.setPrefHeight(150);
        lb6.setAlignment(Pos.CENTER);
        lb6.setStyle("-fx-background-color:GREEN;");

        Label lb7 = new Label("NODE JS");
        lb7.setFont(new Font(40));
        lb7.setPrefWidth(300);
        lb7.setPrefHeight(150);
        lb7.setAlignment(Pos.CENTER);
        lb7.setStyle("-fx-background-color:SANDYBROWN;");

        Image ig1 = new Image("Assests/Images/java.png");
        ImageView jaimaage = new ImageView(ig1);
        jaimaage.setFitHeight(150);
        jaimaage.setFitWidth(300);
        jaimaage.setPreserveRatio(true);

        Image ig2 = new Image("Assests/Images/python.jpeg");
        ImageView pyimage = new ImageView(ig2);
        pyimage.setFitHeight(150);
        pyimage.setFitWidth(300);
        pyimage.setPreserveRatio(true);

        Image ig3 = new Image("Assests/Images/c.png");
        ImageView cimage = new ImageView(ig3);
        cimage.setFitHeight(150);
        cimage.setFitWidth(300);
        cimage.setPreserveRatio(true);

        Image ig4 = new Image("Assests/Images/cpp.png");
        ImageView cppimage = new ImageView(ig4);
        cppimage.setFitHeight(150);
        cppimage.setFitWidth(300);
        cppimage.setPreserveRatio(true);

        Image ig5 = new Image("Assests/Images/spring.png");
        ImageView simage = new ImageView(ig5);
        simage.setFitHeight(150);
        simage.setFitWidth(150);
        // simage.setPreserveRatio(true);

        Image ig6 = new Image("Assests/Images/react.png");
        ImageView rimage = new ImageView(ig6);
        rimage.setFitHeight(150);
        rimage.setFitWidth(300);
        rimage.setPreserveRatio(true);

        Image ig7 = new Image("Assests/Images/flutter.jpeg");
        ImageView flimage = new ImageView(ig7);
        flimage.setFitHeight(150);
        flimage.setFitWidth(300);
        flimage.setPreserveRatio(true);

        Image ig8 = new Image("Assests/Images/node.png");
        ImageView noimage = new ImageView(ig8);
        noimage.setFitHeight(150);
        noimage.setFitWidth(300);
        noimage.setPreserveRatio(true);

        VBox vb1 = new VBox(20, jaimaage, pyimage, cimage, cppimage);

        VBox vb2 = new VBox(20, lb, lb1, lb2, lb3);

        VBox vb3 = new VBox(20, simage, rimage, flimage, noimage);

        VBox vb4 = new VBox(20, lb4, lb5, lb6, lb7);

        HBox hb1 = new HBox(vb1, vb2);
        HBox hb2 = new HBox(vb3, vb4);

        HBox hb3 = new HBox(30, hb1, hb2);

        Scene sc = new Scene(hb3, 1000, 880);
        sc.setFill(Color.WHITE);
        sc.setCursor(Cursor.OPEN_HAND);

        prstage.setScene(sc);
        prstage.show();

    }

}
