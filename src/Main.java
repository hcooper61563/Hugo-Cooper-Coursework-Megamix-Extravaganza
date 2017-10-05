import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();

        Scene scene = new Scene(root, 1024, 768);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();


        Button myButton = new Button("Click me!");
        myButton.setPrefSize(100, 35);
        myButton.setOnAction((ActionEvent ae) -> doSomething(ae));
        root.getChildren().add(myButton);
    }

    public static void doSomething(ActionEvent ae) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Wow, you clicked the button with style!");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}