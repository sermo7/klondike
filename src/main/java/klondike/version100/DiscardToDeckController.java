package klondike.version100;

public class DiscardToDeckController extends MoveController {
	
	protected DiscardToDeckController(){

	}
	
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
