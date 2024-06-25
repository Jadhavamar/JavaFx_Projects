package javafiles.home;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeWindow {

    Text txt = null;

    public void start(Stage prStage) throws Exception {
        prStage.setTitle("Stage Practical");
        prStage.setResizable(false);
        prStage.setX(0);
        prStage.setY(0);
        prStage.setWidth(800);
        prStage.setHeight(800);

        txt = new Text(10, 30, "Good Evening");
        txt.setFill(Color.WHITE);
        txt.setFont(new Font(30));

        Text gd = new Text(350, 30, "Have a Nice Day");
        gd.setFill(Color.YELLOW);
        gd.setFont(new Font(30));

        Text java = new Text("Java");
        java.setFont(new Font(30));

        Text python = new Text("Python");
        python.setFont(new Font(30));

        Text cpp = new Text("Cpp");
        cpp.setFont(new Font(30));

        Text web = new Text(10, 10, "Web");
        web.setFont(new Font(30));

        Text backend = new Text(10, 10, "Backend");
        backend.setFont(new Font(30));

        Text app = new Text(10, 10, "App");
        app.setFont(new Font(30));

        VBox vb1 = new VBox(20, java, python, cpp);
        vb1.setLayoutX(50);
        vb1.setLayoutY(100);

        VBox vb2 = new VBox(20, app, backend, web);
        vb2.setLayoutX(400);
        vb2.setLayoutY(100);

        HBox hb1 = new HBox(vb1, vb2);
        hb1.setLayoutX(350);
        hb1.setLayoutY(100);

        Group group = new Group(txt, gd, vb1, vb2);
        Scene scene = new Scene(group, 300, 300);
        scene.setFill(Color.MAROON);
        scene.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(scene);
        prStage.show();
    }

}
