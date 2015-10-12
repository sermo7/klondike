package klondike.version100;

public class StairToSuitController extends MoveController {
	
	protected StairToSuitController(){
	}
	

	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
