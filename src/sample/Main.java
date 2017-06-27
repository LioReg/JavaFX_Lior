
package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {


        Label label = new Label();
        Button btn = new Button();
        Button btn2 = new Button("2nd Button");
        btn.setText("Click ME");
        btn.setLayoutX(100);

        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                MouseButton button = event.getButton();
                if(button==MouseButton.PRIMARY){
                    label.setText("PRIMARY button clicked on button");
                }else if(button==MouseButton.SECONDARY ){
                    label.setText("SECONDARY button clicked on button");
                }else if(button==MouseButton.MIDDLE ){
                    label.setText("MIDDLE button clicked on button");
                }
            }
        });
        btn2.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                MouseButton button = event.getButton();
                if(button==MouseButton.PRIMARY){
                    label.setText("PRIMARY button clicked on 2nd button");
                }else if(button==MouseButton.SECONDARY ){
                    label.setText("SECONDARY button clicked on 2nd button");
                }else if(button==MouseButton.MIDDLE ){
                    label.setText("MIDDLE button clicked on 2nd button");
                }
            }
        });
        VBox vBox = new VBox();
        VBox vbButtons = new VBox();
        vBox.getChildren().addAll(btn, btn2, label);
        StackPane root = new StackPane();
        root.getChildren().add(vBox);

        root.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                MouseButton button = event.getButton();
                if(button==MouseButton.PRIMARY){
                    label.setText("PRIMARY button clicked on root zone");
                }else if(button==MouseButton.SECONDARY){
                    label.setText("SECONDARY button clicked on root zone");
                }else if(button==MouseButton.MIDDLE){
                    label.setText("MIDDLE button clicked on root zone");
                }
            }
        });

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("java-buddy.blogspot.com");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
