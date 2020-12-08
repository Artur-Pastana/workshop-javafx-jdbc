package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {

	@FXML
	private TableView<Department> tableViewDepartment;
	
	@FXML
	private TableColumn<Department, Integer> tableColumId;
	
	@FXML
	private TableColumn<Department, String> tableColumName;
	
	@FXML
	private Button btNew;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("butão acionado");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		this.tableColumId.setCellValueFactory(new PropertyValueFactory<>("id"));
		this.tableColumName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		
		Stage stage = ((Stage) Main.getMainScene().getWindow());
		this.tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
	}

}
