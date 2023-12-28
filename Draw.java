
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.Group;

public class Draw extends Application{
	@Override
	public void start(Stage s)throws Exception{
		Group root=new Group();
		Scene scene=new Scene(root,300,200);
		Circle c=new Circle();
		c.setFill(Color.RED);
		root.getChildren().addAll(c);
		scene.setOnMouseClicked(e->{
		c.setRadius(10);
		c.setCenterX(e.getX());
		c.setCenterY(e.getY());
		
		});
		s.setScene(scene);
		
		s.show();
		
		
		
	}

	public static void main(String []args) {
		launch(args);
	}
}