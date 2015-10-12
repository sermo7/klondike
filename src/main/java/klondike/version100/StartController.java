package klondike.version100;

public class StartController extends Controller {

	MoveControllerFactory colocateControllerFactory;
	
	protected StartController(Card card, Deck deck, Deck discard, FinalSuit finalSuit, Stair stair, MoveControllerFactory colocateControllerFactory) {

		this.colocateControllerFactory = colocateControllerFactory;
	}



}
