package com.programandofodacci.terranovaindustrialist;

import com.programandofodacci.terranovaindustrialist.utils.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import fr.brouillard.oss.cssfx.CSSFX;
/**
 * JavaFX App <br>
 * 
 * <p style="color: lime; font-weight: bold">Criador: <a href="https://github.com/ultraluminatio">link</a></p>
 */
public class App extends Application {

    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        
        CSSFX.start(scene);
        
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();

        
    }
    
}