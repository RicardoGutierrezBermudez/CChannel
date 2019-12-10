package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private AnchorPane rootLayout;	

	public Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("AID School");
			this.primaryStage.setX(screenSize.getWidth()/7);   
			this.primaryStage.setY(screenSize.getHeight()/7);

			initRootLayout();
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Layouts.fxml"));
			rootLayout = (AnchorPane) loader.load();
            Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");

            primaryStage.setScene(scene);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
