package dashboard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class MainApp extends Application {

    Button button;

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sensor Dashboard");

        button = new Button();
        button.setText("Click Me");
        button.setOnAction(e -> System.out.println("Button Clicked!"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.setResizable(false);
        
        stage.show();
    }
}