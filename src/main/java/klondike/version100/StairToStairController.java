package klondike.version100;

public class StairToStairController extends MoveController {
	
	protected StairToStairController(){

	}
	

	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
