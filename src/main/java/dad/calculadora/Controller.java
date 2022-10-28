package dad.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	private Calculadora calculadora;

	public Controller() throws IOException {
		calculadora = new Calculadora();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	@FXML
	private GridPane calculadoraPane;
	@FXML
	private Button sieteButton;
	@FXML
	private Button ochoButton;
	@FXML
	private Button nueveButton;
	@FXML
	private Button ceButton;
	@FXML
	private Button cuatroButton;
	@FXML
	private Button cincoButton;
	@FXML
	private Button seisButton;
	@FXML
	private Button multiButton;
	@FXML
	private Button unoButton;
	@FXML
	private Button dosButton;
	@FXML
	private Button tresButton;
	@FXML
	private Button restaButton;
	@FXML
	private Button cButton;
	@FXML
	private Button divisionButton;
	@FXML
	private Button puntoButton;
	@FXML
	private Button sumaButton;
	@FXML
	private TextField numeroText;
	@FXML
	private Button ceroButton;
	@FXML
	private Button igualButton;

	// los números
	@FXML
	public void onceroButtonAction(ActionEvent event) {
		calculadora.insertar('0');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void onunoButtonAction(ActionEvent event) {
		calculadora.insertar('1');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void ondosButtonAction(ActionEvent event) {
		calculadora.insertar('2');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void ontresButtonAction(ActionEvent event) {
		calculadora.insertar('3');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void oncuatroButtonAction(ActionEvent event) {
		calculadora.insertar('4');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void oncincoButtonAction(ActionEvent event) {
		calculadora.insertar('5');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void onseisButtonAction(ActionEvent event) {
		calculadora.insertar('6');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void onsieteButtonAction(ActionEvent event) {
		calculadora.insertar('7');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void onochoButtonAction(ActionEvent event) {
		calculadora.insertar('8');
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void onnueveButtonAction(ActionEvent event) {
		calculadora.insertar('9');
		numeroText.setText(calculadora.getPantalla());
	}

	// los borradores
	@FXML
	public void oncButtonAction(ActionEvent event) {
		calculadora.borrar();
		numeroText.setText(calculadora.getPantalla());
	}

	@FXML
	public void onceButtonAction(ActionEvent event) {
		calculadora.borrarTodo();
		numeroText.setText("");
	}

	// los operadores
	@FXML
	public void onsumaButtonAction(ActionEvent event) {
		calculadora.operar('+');
	}

	@FXML
	public void onrestaButtonAction(ActionEvent event) {
		calculadora.operar('-');
	}

	@FXML
	public void onmultiButtonAction(ActionEvent event) {
		calculadora.operar('*');
	}

	@FXML
	public void ondivisionButtonAction(ActionEvent event) {
		calculadora.operar('/');
	}

	@FXML
	public void onigualButtonAction(ActionEvent event) {
		calculadora.operar('=');
		numeroText.setText(calculadora.getPantalla());
	}

	// la coma
	@FXML
	public void onpuntoButtonAction(ActionEvent event) {
		calculadora.insertarComa();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public GridPane getCalculadoraPane() {
		return calculadoraPane;
	}

}