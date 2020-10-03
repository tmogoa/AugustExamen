package august.examen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/newExam.fxml"));
        primaryStage.setTitle("August Examen");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("layouts/drawables/logo32.png")));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("utils/main.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
