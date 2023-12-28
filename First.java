import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
public class First extends Application{
	@Override
	public void start(Stage s)throws Exception{
		Button btn1=new Button("Btn 1");
		Button btn2=new Button("Btn 2");
		VBox root=new VBox();
		root.getChildren().addAll(btn1,btn2);
		Scene scene=new Scene(root,400,300);
		s.setScene(scene);
		s.setTitle("JAVAFX");
		s.show();
	
		
	}

	public static void main(String []args) {
		launch(args);
	}

}
