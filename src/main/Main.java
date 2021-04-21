package main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("English Myanmar Dictionary - Version 1.0");
        Scene scene = new Scene(root, 1000, 500);
        scene.getStylesheets().add("assets/style.css");
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/images/logo.png")));
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        Controller controller = loader.getController();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()){
                    case W:
                        controller.moveUp();
                        break;
                    case DOWN:
                        controller.moveDown();
                        break;
                    default:
                        break;
                }
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
