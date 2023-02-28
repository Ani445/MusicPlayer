import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import org.w3c.dom.events.Event;

public class Main extends Application{

    Stage window;
    Scene scene1,scene2;
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Say 'Hello World'");
        btn.setOnAction(e -> {
            System.out.println("Hello World!");
        });
        Region region = new Region();
        //region.setStyle("-fx-background-color: #0000ff88;");
        region.setMouseTransparent(true);//mouse pointer changes button

        StackPane root = new StackPane(btn, region);

        Scene scene = new Scene(root, 100, 100);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}