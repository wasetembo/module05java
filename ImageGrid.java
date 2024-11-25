import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ImageGrid extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // Set horizontal gap between images
        gridPane.setVgap(10); // Set vertical gap between images
        gridPane.setPadding(new Insets(10, 10, 10, 10)); // Add padding around the grid

        // Load images
        Image image1 = new Image("file:images/flag1.gif"); 
        Image image2 = new Image("file:images/flag2.gif");
        Image image3 = new Image("file:images/flag3.gif");
        Image image4 = new Image("file:images/flag4.gif");

        // Create ImageViews with fixed size
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(150);
        imageView1.setFitHeight(100);

        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(150);
        imageView2.setFitHeight(100);

        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(150);
        imageView3.setFitHeight(100);

        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitWidth(150);
        imageView4.setFitHeight(100);

        // Add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0); // Top-left
        gridPane.add(imageView2, 1, 0); // Top-right
        gridPane.add(imageView3, 0, 1); // Bottom-left
        gridPane.add(imageView4, 1, 1); // Bottom-right

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
