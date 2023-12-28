import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.input.*;
public class Key extends Application{
	@Override
	public void start(Stage s)throws Exception{
		TextField t1=new TextField();
		TextField t2=new TextField();
		
		HBox root=new HBox();
		root.getChildren().addAll(t1,t2);
		Scene scene=new Scene(root,400,300);
		
		scene.setOnMouseEntered(e->t1.setText("IN"));
		scene.setOnMouseExited(e->t1.setText("OUT"));
		scene.setOnMouseMoved(e->t2.setText("X="+e.getX()+"	Y="+e.getY()));
		
		s.setScene(scene);
		
		s.show();
	
		
	}

	public static void main(String []args) {
		launch(args);
	}

}
//--module-path "C:\Users\HP\Downloads\openjfx-21.0.1_windows-x64_bin-sdk\javafx-sdk-21.0.1\lib" --add-modules javafx.controls,javafx.fxml