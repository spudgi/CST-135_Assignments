package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(25, 10, 25, 10));
		pane.setVgap(20);
		pane.setHgap(40);
		
		HBox display = new HBox();
		display.setStyle("-fx-background-color: black");
		display.setPrefSize(340, 150);
		display.setPadding(new Insets(50, 10, 50, 10));
		
		Label greeting = new Label("Welcome " + printTest());
		greeting.setStyle("-fx-text-fill: white");
		greeting.setPrefSize(330, 150);
		greeting.setFont(Font.font("MS Arial", FontWeight.EXTRA_BOLD, 16));
		display.getChildren().add(greeting);
				
		HBox row1 = new HBox(50);
		HBox row2 = new HBox(50);
		HBox row3 = new HBox(50);
		HBox row4 = new HBox(50);
		
		GridPane.setRowIndex(row1, 1);
		GridPane.setRowIndex(row2, 2);
		GridPane.setRowIndex(row3, 3);
		GridPane.setRowIndex(row4, 4);
		
		row1.getChildren().addAll(but("A"), but("D"), but("1"), but("4"), but("7"));
		row2.getChildren().addAll(but("B"), but("E"), but("2"), but("5"), but("8"));
		row3.getChildren().addAll(but("C"), but("F"), but("3"), but("6"), but("9"));
		
		pane.getChildren().addAll(display, row1, row2, row3, row4);
		
		Scene scene = new Scene(pane, 350, 350);
		scene.getStylesheets().add("/images/application.css");
		primaryStage.setScene(scene);
		primaryStage.setTitle("Vending Machine");
		primaryStage.show();
	}
	
	public String printTest() {
		return null;
	}

	public Button but(String label) {
		Button b = new Button(label);
		b.setMinSize(20, 20);
		b.setBackground(Background.EMPTY);
		b.setFont(Font.font("MS Arial", FontWeight.EXTRA_BOLD, 12));
		return b;
	}
	
	public static void printTest(Product prod) {
		System.out.print(prod.getClass().getName() + ":\n" + prod.toString() + "\n\n");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
