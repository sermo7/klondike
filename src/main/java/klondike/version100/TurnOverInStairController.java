package klondike.version100;

public class TurnOverInStairController extends MoveController {
	
	protected TurnOverInStairController(){

	}
	

	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
