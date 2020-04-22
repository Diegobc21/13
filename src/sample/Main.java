package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        System.out.println("Twin prime numbers less than 100: \n");
        for (int i = 2; i < 100; i++){
            if (Finder.isPrime(i) && Finder.isPrime(i+2)){
                System.out.printf("(%d, %d)\n", i, i+2);
            }
        }
        return;
    }
}
