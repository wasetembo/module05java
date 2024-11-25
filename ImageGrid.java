import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGrid extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // Set horizontal gap between images
        gridPane.setVgap(10); // Set vertical gap between images

        // Load images
        Image image1 = new Image("file:images/flag1.gif"); 
        Image image2 = new Image("file:images/flag2.gif");
        Image image3 = new Image("file:images/flag3.gif");
        Image image4 = new Image("file:images/flag4.gif");

        // Add ImageViews to the GridPane
        gridPane.add(new ImageView(image1), 0, 0); // Top-left
        gridPane.add(new ImageView(image2), 1, 0); // Top-right
        gridPane.add(new ImageView(image3), 0, 1); // Bottom-left
        gridPane.add(new ImageView(image4), 1, 1); // Bottom-right

        // Create a Scene
        Scene scene = new Scene(gridPane, 400, 400);

        // Set the Stage
        primaryStage.setTitle("Image Grid Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
