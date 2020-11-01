/**
 * 
 */
package dad.javafx.buscareemplaza;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author Ayoze Amaro
 *
 */
public class SearchFX extends Application {

	Controller controller = new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(controller.getView(), 530, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.getIcons().add(new Image("images/eclipse-icon-32px.png"));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
