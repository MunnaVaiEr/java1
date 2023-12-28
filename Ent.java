import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class Ent extends Application{
	@Override
	public void start(Stage s)throws Exception{
		Button red=new Button("red");
		Button blue=new Button("blue");
		HBox root=new HBox();
		root.getChildren().addAll(red,blue);
		Scene scene=new Scene(root,400,300);
		s.setScene(scene);
		s.show();
	
		red.setOnAction(e->root.setStyle("-fx-background-color: red"));
		blue.setOnAction(e->root.setStyle("-fx-background-color: blue"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
