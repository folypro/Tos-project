package com.example.assignment3_cis232;


/**
 * This program is written by Abdulbasit Adeniji for CIS 232 75 Assignment 3 on 2/14/2022.
 * The purpose of the code is to create a JavaFX application that simulates a coin being tossed.
 */




import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class HeadsorTails extends Application
{
    //declaring UI components

    private ImageView View;
    private Image headsImage, tailsImage;
    private Button btn;

    @Override
    public void start(Stage primaryStage)
    {
        //initializing ImageView,setting height and width of the coin image

        View = new ImageView();
        View.setFitHeight(320);
        View.setFitWidth(320);

        //load the head and tail image from the file
        headsImage = new Image("C:\\Users\\SLRCMOBILE26\\IdeaProjects\\Assignment3_cis232\\src\\main\\Heads1.png");
        tailsImage = new Image("C:\\Users\\SLRCMOBILE26\\IdeaProjects\\Assignment3_cis232\\src\\main\\Tails1.png");

        //Initializing the button, event listener using lambda expression.
        btn = new Button("TOSS");
        btn.setOnAction(e->{
            //Use math random to generate the toss landing point

            int num = (int) (Math.random()*2);
            //set the if statement

            if (num == 0){
                View.setImage(headsImage);
            }
            else {
                View.setImage(tailsImage);
            }
        });

        //Set the VBox
        VBox root = new VBox(View,btn);
        //aligning vbox to center and setting some spacing between components
        root.setAlignment(Pos.CENTER);

        //creating and displaying the scene
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        //Set the stage title
        primaryStage.setTitle("COIN TOSS");
        //Show window
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }

}





