package controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		    FXMLLoader loader = new FXMLLoader();
		    loader.setLocation(Main.class.getResource("../view/Main.fxml"));
		    AnchorPane main = (AnchorPane) loader.load();
		    MainController controller = loader.getController();
			Scene scene = new Scene(main);
			primaryStage.setTitle("7-Segment");
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	public static void main(String[] args) {
		//콘솔창에서 띄우기
		/*Scanner sc = new Scanner(System.in);
		NotGate notGate = new NotGate();
		Or orGate = new Or();
		And andGate = new And();
		Xor xorGate = new Xor();
		try {
		System.out.println("D부터 A까지 순서대로 입력해주세요.");
		int d1 = sc.nextInt();
		int c1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a1 = sc.nextInt();
		int a = orGate.or(andGate.and(c1, notGate.not(a1)),andGate.and( notGate.not(d1),notGate.not(c1), notGate.not(b1), a1));
		int b = andGate.and(c1, xorGate.xor(b1, a1));;
		int c = andGate.and(notGate.not(c1), b1,notGate.not(a1));
		int d = orGate.or(andGate.and(notGate.not(c1), notGate.not(b1), a1),andGate.and(c1, notGate.not(b1), notGate.not(a1)), andGate.and(c1, b1, a1));
		int e = orGate.or(a1, andGate.and(c1, notGate.not(b1)));
		int f = orGate.or(andGate.and(b1, a1), andGate.and(notGate.not(c1), b1), andGate.and(notGate.not(d1), notGate.not(c1), a1));
		int g = orGate.or(andGate.and(notGate.not(d1),notGate.not(c1), notGate.not(b1)), andGate.and(c1, b1, a1));
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력했숩니다.0또는 1를 입력해주세요.");
		}*/
		launch(args);
	}

}
