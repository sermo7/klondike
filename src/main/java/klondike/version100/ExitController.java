package klondike.version100;

public class ExitController extends MoveController {
	
	protected ExitController(){

	}
	

	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
