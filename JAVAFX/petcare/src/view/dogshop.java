package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class dogshop extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label lb = new Label("Trending Products");
        lb.setTextFill(Color.BLACK);
        lb.setStyle("-fx-font-weight: bold;");
        lb.setFont(new Font(35));
        // lb.setAlignment(Pos.TOP_CENTER);
        // lb.setPadding(new Insets(50, 0, 0, 0));
        lb.setLayoutX(800);
        lb.setLayoutY(50);

        // ----------------------------------
        Label lb1 = new Label("Dog");
        lb1.setTextFill(Color.BLACK);
        lb1.setStyle("-fx-font-weight: bold;");
        lb1.setFont(new Font(35));
        lb1.setAlignment(Pos.TOP_CENTER);
        lb1.setPadding(new Insets(200, 0, 0, 100));

        // ------------------------------------------------------------------products--------------------------------------------

        


        

        Image image = new Image("assets/Image/Dogfood/dogg1.png");
        ImageView imageview = new ImageView(image);

        imageview.setFitWidth(300);
        imageview.setFitHeight(300);
        imageview.setPreserveRatio(true);
       // imageview.setStyle("-fx-background-color: Transparent");
        

        VBox box3 = new VBox();
        box3.getChildren().add(imageview);
        box3.setPadding(new Insets(20, 20, 0, 20));
        box3.setPrefHeight(380);
        box3.setPrefWidth(300);
        box3.setStyle("-fx-background-color: linear-gradient(to bottom,rgba(251,247,230,1),rgba(215,176,177,1))");
        box3.setPadding(new Insets(0, 0, 0, 0));
        box3.setAlignment(Pos.CENTER);

        Label lbbo3 = new Label("Food Royal");
        lbbo3.setTextFill(Color.BLACK);
        lbbo3.setStyle("-fx-font-weight: bold;");
        lbbo3.setFont(new Font(20));
        lbbo3.setPadding(new Insets(15, 0, 00, 0));

        Button boxButton3 = new Button("Add to Cart");
        boxButton3.setStyle(
                "-fx-background-color: linear-gradient(to right,yellow,orange); -fx-text-fill: black;-fx-background-radius:10;-fx-font-weight: bold;");

        boxButton3.setFont(new Font(15));

        VBox vb3 = new VBox(10, box3, lbbo3, boxButton3);
        vb3.setPadding(new Insets(100, 100, 100, 100));
        vb3.setPrefHeight(300);
        vb3.setPrefWidth(400);
        vb3.setStyle("-fx-background-color:white;");
        vb3.setPadding(new Insets(20, 20, 0, 20));

        // -----------------------------------------------------------------------box3
        // complete------------------------------------------

        VBox box4 = new VBox();
        box4.setPadding(new Insets(20, 20, 0, 20));
        box4.setPrefHeight(380);
        box4.setPrefWidth(300);
        box4.setStyle("-fx-background-color: linear-gradient(to bottom,rgba(251,247,230,1),rgba(215,176,177,1))");
        box4.setPadding(new Insets(0, 0, 0, 0));

        VBox box5 = new VBox();
        box5.setPadding(new Insets(20, 20, 0, 20));
        box5.setPrefHeight(380);
        box5.setPrefWidth(300);
        box5.setStyle("-fx-background-color: linear-gradient(to bottom,rgba(251,247,230,1),rgba(215,176,177,1))");
        box5.setPadding(new Insets(0, 0, 0, 0));

        VBox box6 = new VBox();
        box6.setPadding(new Insets(20, 20, 0, 20));
        box6.setPrefHeight(380);
        box6.setPrefWidth(300);
        box6.setStyle("-fx-background-color: linear-gradient(to bottom,rgba(251,247,230,1),rgba(215,176,177,1))");
        box6.setPadding(new Insets(0, 0, 0, 0));

        VBox vb4 = new VBox(box4);
        vb4.setPadding(new Insets(100, 100, 100, 100));
        vb3.setPrefHeight(300);
        vb4.setPrefWidth(400);
        vb4.setStyle("-fx-background-color:white;");
        vb4.setPadding(new Insets(20, 20, 0, 20));

        VBox vb5 = new VBox(box5);
        vb5.setPadding(new Insets(100, 100, 100, 100));
        vb5.setPrefHeight(300);
        vb5.setPrefWidth(400);
        vb5.setStyle("-fx-background-color:white;");
        vb5.setPadding(new Insets(20, 20, 0, 20));

        VBox vb6 = new VBox(box6);
        vb6.setPadding(new Insets(100, 100, 100, 100));
        vb6.setPrefHeight(300);
        vb6.setPrefWidth(400);
        vb6.setStyle("-fx-background-color:white;");
        vb6.setPadding(new Insets(20, 20, 0, 20));

        HBox hb = new HBox(50, vb3, vb4, vb5, vb6);
        // hb.setStyle("-fx-background-color: pink;");
        hb.setPrefHeight(600);
        hb.setPrefWidth(1900);
        hb.setLayoutY(300);
        hb.setPadding(new Insets(40, 0, 50, 70));

        Group gr = new Group(lb, lb1, hb);

        StackPane root = new StackPane(gr);
        root.setStyle("-fx-background-color: rgba(251,247,230,1);");

        Scene scene = new Scene(root, 1910, 1000);
        primaryStage.setTitle("Pet Shop UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
