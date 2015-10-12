package klondike.version100;

public class DeckToDiscardController extends MoveController {

	protected DeckToDiscardController(){
	    
	}

	
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
