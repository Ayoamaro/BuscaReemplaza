package dad.javafx.buscareemplaza;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * @author Ayoze Amaro
 *
 */
public class View extends GridPane {

	private TextField searchText, replaceText;
	private Button searchButton, replaceButton, replaceAllButton, closeButton, helpButton;
	private CheckBox first, second, third, fourth;
	private Label searchLabel, replaceLabel, firstLabel, secondLabel, thirdLabel, fourthLabel, tabCheckBox;
	private VBox sideRight;
	private GridPane groupCheckBox;
	
	public View() {
		
		// Buttons - Side Right
		searchButton = new Button("Buscar");
		searchButton.setMinWidth(120);
						
		replaceButton = new Button("Reemplazar");
		replaceButton.setMinWidth(120);
						
		replaceAllButton = new Button("Reemplazar Todo");
		replaceAllButton.setMinWidth(120);
						
		closeButton = new Button("Cerrar");
		closeButton.setMinWidth(120);
						
		helpButton = new Button("Ayuda");
		helpButton.setMinWidth(120);

		sideRight = new VBox();
		sideRight.setSpacing(5);
		sideRight.setAlignment(Pos.TOP_RIGHT);
		sideRight.getChildren().addAll(searchButton, replaceButton, replaceAllButton, closeButton, helpButton);
		
		// TextField, Label, CheckBox - Side Left
		searchLabel = new Label("Buscar:");
		replaceLabel = new Label("Reemplazar con:");
		
		searchText = new TextField();
		replaceText = new TextField();
		
		firstLabel = new Label("Mayúsculas y minúsculas");
		secondLabel = new Label("Buscar hacia atrás");
		thirdLabel = new Label("Expresión regular");
		fourthLabel = new Label("Resaltar resultados");
		
		first = new CheckBox();
		second = new CheckBox();
		third = new CheckBox();
		fourth = new CheckBox();

		tabCheckBox = new Label("");
		
		groupCheckBox = new GridPane();
		groupCheckBox.setHgap(5);
		groupCheckBox.setVgap(5);
		groupCheckBox.addRow(0, first, firstLabel, second, secondLabel);
		groupCheckBox.addRow(1, third, thirdLabel, fourth, fourthLabel);
		
		// Rows for content
		this.setPadding(new Insets(5));
		this.setHgap(5);
		this.setVgap(5);
		this.setAlignment(Pos.TOP_LEFT);
		this.addRow(0, searchLabel, searchText, sideRight);
		this.addRow(1, replaceLabel, replaceText);
		this.addRow(2, tabCheckBox, groupCheckBox);
		
		GridPane.setRowSpan(sideRight, 3);
		this.addColumn(2);
		
		// Columns for content
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),
				new ColumnConstraints()
			};
		
		this.getColumnConstraints().setAll(cols);
		
		cols[0].setHalignment(HPos.RIGHT);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
	}
}
