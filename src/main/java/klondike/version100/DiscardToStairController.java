package klondike.version100;

public class DiscardToStairController extends MoveController {
	
	protected DiscardToStairController(){

	}
	
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
