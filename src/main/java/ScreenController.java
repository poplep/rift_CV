package main.java;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.MalformedURLException;

public final class ScreenController
{
    @FXML
    private HBox row1Box;
    @FXML
    private HBox row2Box;
    @FXML
    private HBox row3Box;
    @FXML
    private Button screen1Button;
    @FXML
    private Button screen2Button;
    @FXML
    private Button screen3Button;
    @FXML
    private Button screen4Button;
    @FXML
    private Button screen5Button;
    @FXML
    private Button screen6Button;
    @FXML
    private Button screen7Button;
    @FXML
    private Button screen8Button;
    @FXML
    private Button screen9Button;
    
    @FXML
    private MediaView screen1;
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
    
    
    public ScreenController()
    {
        Platform.runLater(() -> {
            MediaPlayer mediaPlayer = new MediaPlayer( new Media("http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv"));
            mediaPlayer.setAutoPlay(true);
            screen1.setMediaPlayer(mediaPlayer);
            mediaPlayer.setOnReady(new Runnable()
            {
                @Override
                public void run()
                {
            
                }
            });
        });
    }
    
}
