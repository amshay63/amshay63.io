import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application{

	boolean xTurn = true;
	int[] xScore = new int[9];
	int[] yScore = new int[9];
	boolean win = false;
	String winner = "";
	int counter = 0;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage boardStage) {

		/** Create Images **/
		Image xImage = new Image("file:X.png");
		Image oImage = new Image("file:O.png");
		Image blankImage = new Image("file:Blank.png");

		/** Create ImageViews **/
		ImageView[] blankIView = new ImageView[9];

		for (int i = 0; i < 9; i++) {
			blankIView[i] = new ImageView(blankImage);
			blankIView[i].setFitWidth(200);
			blankIView[i].setPreserveRatio(true);
		}

		/** Create GridPane **/
		GridPane grid = new GridPane();

		/** Add Blank Spots **/
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid.add(blankIView[count], i, j);
				count++;
			}
		}

		/** Set Grid Options **/
		grid.setStyle("-fx-background-color:black");
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new Insets(5));
		grid.setAlignment(Pos.CENTER);

		/** Button **/
		Button newGame = new Button("New Game");

		/** GUI **/
		Label winLabel = new Label();
		winLabel.setStyle("-fx-font: 24 ariel; -fx-font-weight: bold;");
		HBox hbox = new HBox(winLabel);

		/** New Game **/
		newGame.setOnAction(event -> {
			for (int i = 0; i < 8; i++) {
				xScore[i] = 0;
				yScore[i] = 0;
			}
			counter = 0;
			win = false;
			winner = "";
			xTurn = true;
			start(boardStage);
		});
		/** Picture Change On Click **/
		grid.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			double x = e.getX();
			double y = e.getY();
			System.out.println("X-Coord: " + x);
			System.out.println("Y-Coord: " + y);

			/** When Game is Won, Code is Unreachable **/
			if (!win) {
				if (xTurn) { /** Player X's Turn **/
					if (((x >= 5) && (x <= 205)) && ((y >= 5) && (y <= 205))) {
						if (blankIView[0].getImage() == blankImage) {
							blankIView[0].setImage(xImage);
							xScore[0]++;
							xScore[4]++;
							xScore[7]++;
							xTurn = false;
						}
					}
					if (((x >= 215) && (x <= 415)) && ((y >= 5) && (y <= 205))) {
						if (blankIView[3].getImage() == blankImage) {
							blankIView[3].setImage(xImage);
							xScore[1]++;
							xScore[4]++;
							xTurn = false;
						}
					}
					if (((x >= 425) && (x <= 625)) && ((y >= 5) && (y <= 205))) {
						if (blankIView[6].getImage() == blankImage) {
							blankIView[6].setImage(xImage);
							xScore[2]++;
							xScore[4]++;
							xScore[3]++;
							xTurn = false;
						}
					}
					if (((x >= 5) && (x <= 205)) && ((y >= 215) && (y <= 415))) {
						if (blankIView[1].getImage() == blankImage) {
							blankIView[1].setImage(xImage);
							xScore[0]++;
							xScore[5]++;
							xTurn = false;
						}
					}
					if (((x >= 215) && (x <= 415)) && ((y >= 215) && (y <= 415))) {
						if (blankIView[4].getImage() == blankImage) {
							blankIView[4].setImage(xImage);
							xScore[1]++;
							xScore[5]++;
							xScore[3]++;
							xScore[7]++;
							xTurn = false;
						}
					}
					if (((x >= 425) && (x <= 625)) && ((y >= 215) && (y <= 415))) {
						if (blankIView[7].getImage() == blankImage) {
							blankIView[7].setImage(xImage);
							xScore[2]++;
							xScore[5]++;
							xTurn = false;
						}
					}
					if (((x >= 5) && (x <= 205)) && ((y >= 425) && (y <= 625))) {
						if (blankIView[2].getImage() == blankImage) {
							blankIView[2].setImage(xImage);
							xScore[0]++;
							xScore[6]++;
							xScore[3]++;
							xTurn = false;
						}
					}
					if (((x >= 215) && (x <= 415)) && ((y >= 425) && (y <= 625))) {
						if (blankIView[5].getImage() == blankImage) {
							blankIView[5].setImage(xImage);
							xScore[1]++;
							xScore[6]++;
							xTurn = false;
						}
					}
					if (((x >= 425) && (x <= 625)) && ((y >= 425) && (y <= 625))) {
						if (blankIView[8].getImage() == blankImage) {
							blankIView[8].setImage(xImage);
							xScore[2]++;
							xScore[6]++;
							xScore[7]++;
							xTurn = false;
						}
					}
					/** Win Condition **/
					if (xScore[0] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
					if (xScore[1] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
					if (xScore[2] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
					if (xScore[3] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
					if (xScore[4] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
					if (xScore[5] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
					if (xScore[6] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
					if (xScore[7] == 3) {
						win = true;
						winner = "X";
						winLabel.setText(winner + " Wins!");
					}
				} else {/** Player O's Turn **/
					if (((x >= 5) && (x <= 205)) && ((y >= 5) && (y <= 205))) {
						if (blankIView[0].getImage() == blankImage) {
							blankIView[0].setImage(oImage);
							yScore[0]++;
							yScore[4]++;
							yScore[7]++;
							xTurn = true;
						}
					}
					if (((x >= 215) && (x <= 415)) && ((y >= 5) && (y <= 205))) {
						if (blankIView[3].getImage() == blankImage) {
							blankIView[3].setImage(oImage);
							yScore[1]++;
							yScore[4]++;
							xTurn = true;
						}
					}
					if (((x >= 425) && (x <= 625)) && ((y >= 5) && (y <= 205))) {
						if (blankIView[6].getImage() == blankImage) {
							blankIView[6].setImage(oImage);
							yScore[2]++;
							yScore[4]++;
							yScore[3]++;
							xTurn = true;
						}
					}
					if (((x >= 5) && (x <= 205)) && ((y >= 215) && (y <= 415))) {
						if (blankIView[1].getImage() == blankImage) {
							blankIView[1].setImage(oImage);
							yScore[0]++;
							yScore[5]++;
							xTurn = true;
						}
					}
					if (((x >= 215) && (x <= 415)) && ((y >= 215) && (y <= 415))) {
						if (blankIView[4].getImage() == blankImage) {
							blankIView[4].setImage(oImage);
							yScore[1]++;
							yScore[5]++;
							yScore[3]++;
							yScore[7]++;
							xTurn = true;
						}
					}
					if (((x >= 425) && (x <= 625)) && ((y >= 215) && (y <= 415))) {
						if (blankIView[7].getImage() == blankImage) {
							blankIView[7].setImage(oImage);
							yScore[2]++;
							yScore[5]++;
							xTurn = true;
						}
					}
					if (((x >= 5) && (x <= 205)) && ((y >= 425) && (y <= 625))) {
						if (blankIView[2].getImage() == blankImage) {
							blankIView[2].setImage(oImage);
							yScore[0]++;
							yScore[6]++;
							yScore[3]++;
							xTurn = true;
						}
					}
					if (((x >= 215) && (x <= 415)) && ((y >= 425) && (y <= 625))) {
						if (blankIView[5].getImage() == blankImage) {
							blankIView[5].setImage(oImage);
							yScore[1]++;
							yScore[6]++;
							xTurn = true;
						}
					}
					if (((x >= 425) && (x <= 625)) && ((y >= 425) && (y <= 625))) {
						if (blankIView[8].getImage() == blankImage) {
							blankIView[8].setImage(oImage);
							yScore[2]++;
							yScore[6]++;
							yScore[7]++;
							xTurn = true;
						}
					}
					/** Win Condition **/
					if (yScore[0] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
					if (yScore[1] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
					if (yScore[2] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
					if (yScore[3] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
					if (yScore[4] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
					if (yScore[5] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
					if (yScore[6] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
					if (yScore[7] == 3) {
						win = true;
						winner = "O";
						winLabel.setText(winner + " Wins!");
					}
				}
			}
		});
		/** Scene Option **/
		VBox vbox = new VBox(10, grid, winLabel, newGame);

		vbox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vbox);

		boardStage.setScene(scene);
		boardStage.setWidth(635);

		boardStage.setResizable(false);

		boardStage.setTitle("Tic-Tac-Toe");

		/** Show Window **/
		boardStage.show();
	}
}
