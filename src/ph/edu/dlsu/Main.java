package ph.edu.dlsu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static int DISPLAY_WIDTH = 640;
    private static int DISPLAY_HEIGHT= 480;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane myPane = new StackPane();

        ImageView imageView = Utils.loadImage2View("res/skyrim.jpg", DISPLAY_WIDTH, DISPLAY_HEIGHT);

        imageView.setPreserveRatio(true);
        imageView.fitWidthProperty().bind(myPane.widthProperty());
        imageView.fitHeightProperty().bind(myPane.heightProperty());

        myPane.getChildren().add(imageView);
        Scene myScene = new Scene(myPane);

        primaryStage.setScene(myScene);
        primaryStage.setTitle("Image Viewer");
        primaryStage.setWidth(DISPLAY_WIDTH);
        primaryStage.setHeight(DISPLAY_HEIGHT);
        primaryStage.show();
    }
}
