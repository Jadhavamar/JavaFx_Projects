import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment1 extends Application {

    public void start(Stage prStage) {

        prStage.setTitle("JButton Demo");
        prStage.setWidth(400);
        prStage.setHeight(400);

        Button java = new Button("Core2Web-Java");
        java.setPrefWidth(180);
        java.setStyle("-fx-background-color: GREEN;");
        java.setStyle("-fx-font-weight: bold;");
        java.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                java.setStyle("-fx-background-color: GREEN;");
                System.out.println(java.getText());

            }
        });

        Button superx = new Button("Core2web-SuperX");
        superx.setPrefWidth(180);
        superx.setStyle("-fx-font-weight: bold;");
        superx.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                superx.setStyle("-fx-background-color: GREEN;");
                System.out.println(superx.getText());

            }
        });

        Button dsa = new Button("Core2Web-DSA");
        dsa.setPrefWidth(180);
        dsa.setStyle("-fx-font-weight: bold;");
        dsa.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                dsa.setStyle("-fx-background-color: GREEN;");
                System.out.println(dsa.getText());

            }
        });

        VBox vb1 = new VBox(20, java, superx, dsa);
        vb1.setAlignment(Pos.CENTER);
        vb1.setStyle("-fx-background-color: YELLOW;");

        Scene scene = new Scene(vb1);
        prStage.setScene(scene);

        prStage.show();

    }

}
