import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment2 extends Application {

    public void start(Stage prStage) {

        prStage.setTitle("JButton Demo");
        prStage.setWidth(400);
        prStage.setHeight(400);

        Button java = new Button("Core2Web-Java");
        java.setPrefWidth(150);
        java.setStyle("-fx-background-color: GREEN;");
        java.setStyle("-fx-font-weight: bold;");
        java.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                java.setStyle("-fx-background-color: GREEN;");
                System.out.println(java.getText());

            }
        });

        Button dsa = new Button("DSA");
        dsa.setPrefWidth(180);
        dsa.setStyle("-fx-font-weight: bold;");
        dsa.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                dsa.setStyle("-fx-background-color: GREEN;");
                System.out.println(dsa.getText());

            }
        });

        Button python = new Button("Python");
        python.setPrefWidth(180);
        python.setStyle("-fx-font-weight: bold;");
        python.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                python.setStyle("-fx-background-color: GREEN;");
                System.out.println(python.getText());

            }
        });

        Button os = new Button("OS");
        os.setPrefWidth(180);
        os.setStyle("-fx-font-weight: bold;");
        os.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                os.setStyle("-fx-background-color: GREEN;");
                System.out.println(os.getText());

            }
        });

        Button c = new Button("C");
        c.setPrefWidth(180);
        c.setStyle("-fx-font-weight: bold;");
        c.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                c.setStyle("-fx-background-color: GREEN;");
                System.out.println(c.getText());

            }
        });

        Button cpp = new Button("CPP");
        cpp.setPrefWidth(180);
        cpp.setStyle("-fx-font-weight: bold;");
        cpp.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                cpp.setStyle("-fx-background-color: GREEN;");
                System.out.println(cpp.getText());

            }
        });

        VBox vb1 = new VBox(20, java, os, c, cpp);
        vb1.setAlignment(Pos.CENTER);
        vb1.setStyle("-fx-background-color: YELLOW;");

        Scene scene = new Scene(vb1);
        prStage.setScene(scene);

        prStage.show();

    }

}
