package ph.edu.dlsu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by cobalt on 3/11/16.
 */
public class Utils {

    public static ImageView loadImage2View(String path, double width, double height){
        ImageView img = null;
        try (InputStream is = Files.newInputStream(Paths.get(path))) {
            img = new ImageView(new Image(is));
            img.setFitWidth(width);
            img.setFitHeight(height);

        } catch (IOException e) {
            System.out.println("Failed to load image!");
        }
        return img;
    }
}
