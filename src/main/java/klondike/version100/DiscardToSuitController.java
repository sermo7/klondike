package klondike.version100;

public class DiscardToSuitController extends MoveController {
	
	protected DiscardToSuitController(){

	}
	
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
