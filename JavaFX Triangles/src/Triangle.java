import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Triangle extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		// creating new group to place triangles
		Group triangleGroup = new Group();

		// creating red triangle
		Polygon redTriangle = new Polygon();
		// fixing the points
		Double[] redPoints = { 150d, 100d, 250d, 100d, 200d, 0d };
		// setting the color and points
		redTriangle.setFill(Color.RED);
		redTriangle.getPoints().addAll(redPoints);
		// adding to group
		triangleGroup.getChildren().add(redTriangle);

		// creating green triangle
		Polygon greenTriangle = new Polygon();
		// fixing the points
		Double[] greenPoints = { 100d, 200d, 200d, 200d, 150d, 100d };
		// setting the color and points
		greenTriangle.setFill(Color.GREEN);
		greenTriangle.getPoints().addAll(greenPoints);
		// adding to group
		triangleGroup.getChildren().add(greenTriangle);

		// creating peach triangle
		Polygon peachTriangle = new Polygon();
		// fixing the points
		Double[] peachPoints = { 150d, 100d, 250d, 100d, 200d, 200d };
		// setting the color and points
		peachTriangle.setFill(Color.PEACHPUFF);
		peachTriangle.getPoints().addAll(peachPoints);
		// adding to group
		triangleGroup.getChildren().add(peachTriangle);

		// creating blue triangle
		Polygon blueTriangle = new Polygon();
		// fixing the points
		Double[] bluePoints = { 200d, 200d, 300d, 200d, 250d, 100d };
		// setting the color and points
		blueTriangle.setFill(Color.BLUE);
		blueTriangle.getPoints().addAll(bluePoints);
		// adding to group
		triangleGroup.getChildren().add(blueTriangle);

		// setting the title
		stage.setTitle("Triangles");
		// make it not to resize
		stage.setResizable(false);
		// setting the size
		stage.setScene(new Scene(triangleGroup, 400, 200));
		// displaying the window
		stage.show();
	}

	// main method
	public static void main(String[] args) {
		launch();
	}

}
