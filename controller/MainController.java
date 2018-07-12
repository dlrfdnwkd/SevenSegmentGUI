package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.And;
import model.NotGate;
import model.Or;
import model.Xor;

/**
 * @author user
 *
 */
public class MainController {
	private Stage primaryStage;
	@FXML private Button buttonA;
	@FXML private Button buttonB;
	@FXML private Button buttonC;
	@FXML private Button buttonD;
	@FXML private Button buttonE;
	@FXML private Button buttonF;
	@FXML private Button buttonG;
	@FXML private TextField txtA;
	@FXML private TextField txtB;
	@FXML private TextField txtC;
	@FXML private TextField txtD;
	@FXML private Label labelA;
	@FXML private Label labelB;
	@FXML private Label labelC;
	@FXML private Label labelD;
	@FXML private Label labelE;
	@FXML private Label labelF;
	@FXML private Label labelG;
	@FXML
	private void confirm() {
		int a1 = Integer.parseInt(txtA.getText());
		int b1 = Integer.parseInt(txtB.getText());
		int c1 = Integer.parseInt(txtC.getText());
		int d1 = Integer.parseInt(txtD.getText());
		NotGate notGate = new NotGate();
		Or orGate = new Or();
		And andGate = new And();
		Xor xorGate = new Xor();
		int a = orGate.or(andGate.and(c1, notGate.not(a1)),andGate.and( notGate.not(d1),notGate.not(c1), notGate.not(b1), a1));
		int b = andGate.and(c1, xorGate.xor(b1, a1));;
		int c = andGate.and(notGate.not(c1), b1,notGate.not(a1));
		int d = orGate.or(andGate.and(notGate.not(c1), notGate.not(b1), a1),andGate.and(c1, notGate.not(b1), notGate.not(a1)), andGate.and(c1, b1, a1));
		int e = orGate.or(a1, andGate.and(c1, notGate.not(b1)));
		int f = orGate.or(andGate.and(b1, a1), andGate.and(notGate.not(c1), b1), andGate.and(notGate.not(d1), notGate.not(c1), a1));
		int g = orGate.or(andGate.and(notGate.not(d1),notGate.not(c1), notGate.not(b1)), andGate.and(c1, b1, a1));
		if(a==1) {
			buttonA.setStyle("-fx-background-color : gray");
			labelA.setText("1");
		}else {
			buttonA.setStyle("-fx-background-color : red");
			labelA.setText("0");
		}
		if(b==1) {
			buttonB.setStyle("-fx-background-color : gray");
			labelB.setText("1");
		}else {
			buttonB.setStyle("-fx-background-color : red");
			labelB.setText("0");
		}
		if(c==1) {
			buttonC.setStyle("-fx-background-color : gray");
			labelC.setText("1");
		}else {
			buttonC.setStyle("-fx-background-color : red");
			labelC.setText("0");
		}
		if(d==1) {
			buttonD.setStyle("-fx-background-color : gray");
			labelD.setText("1");
		}else {
			buttonD.setStyle("-fx-background-color : red");
			labelD.setText("0");
		}
		if(e==1) {
			buttonE.setStyle("-fx-background-color : gray");
			labelE.setText("1");
		}else {
			buttonE.setStyle("-fx-background-color : red");
			labelE.setText("0");
		}
		if(f==1) {
			buttonF.setStyle("-fx-background-color : gray");
			labelF.setText("1");
		}else {
			buttonF.setStyle("-fx-background-color : red");
			labelF.setText("0");
		}
		if(g==1) {
			buttonG.setStyle("-fx-background-color : gray");
			labelG.setText("1");
		}else {
			buttonG.setStyle("-fx-background-color : red");
			labelG.setText("0");
		}
	}
	public void setMain(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
}
