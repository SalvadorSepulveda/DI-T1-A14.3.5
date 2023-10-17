package es.ieslosmontecillos.expresionlambakeyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExpresionLambaKeyEvent extends Application {
    private int posX = 20;
    private int posY = 20;
    private String textContent = "A";
    private Text text;
    private String keyEventText = "";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 100);
        primaryStage.setScene(scene);
        text = new Text(posX, posY, textContent);
        root.getChildren().add(text);

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case DOWN:
                    posY += 10;
                    text.setY(posY);
                    break;

                case UP:
                    posY -= 10;
                    text.setY(posY);
                    break;

                case RIGHT:
                    posX += 10;
                    text.setX(posX);
                    break;

                case LEFT:
                    posX -= 10;
                    text.setX(posX);
                    break;

                default:
                    keyEventText = event.getCode().toString();
                    textContent += keyEventText;
                    text.setText(textContent);
            }
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

