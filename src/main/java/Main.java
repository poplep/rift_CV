package main.java;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    private HBox row1Box;
    @FXML
    private HBox row2Box;
    @FXML
    private HBox row3Box;

    @FXML
    private MediaView screen1;
    
//    @FXML
//    private MediaView screen1;
//    @FXML
//    private MediaView screen2;
//    @FXML
//    private MediaView screen3;
//    @FXML
//    private MediaView screen4;
//    @FXML
//    private MediaView screen5;
//    @FXML
//    private MediaView screen6;
//    @FXML
//    private MediaView screen7;
//    @FXML
//    private MediaView screen8;
//    @FXML
//    private MediaView screen9;
//
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MultipleScreens.fxml"));
        primaryStage.setTitle("Human Detector");
        primaryStage.setScene(new Scene(root, 300, 275));
        new ScreenController();
        primaryStage.show();
//        final MediaPlayer oracleVid = new MediaPlayer(
//                new Media("http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv")
//        );
//        stage.setScene(new Scene(new Group(new MediaView(oracleVid)), 540, 208));
//        stage.show();
//
//        oracleVid.setMute(true);
//        oracleVid.setRate(20);
//
//        oracleVid.setCycleCount(MediaPlayer.INDEFINITE);
//
//        oracleVid.play();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
