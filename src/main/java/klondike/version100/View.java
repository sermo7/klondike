package klondike.version100;

public interface View {

	void render();

	void atender(DeckToDiscardController deckToDiscardController);
	
	void atender(DiscardToDeckController discardToDeckController);
	
	void atender(DiscardToSuitController discardToSuitController);
	
	void atender (DiscardToStairController discardToStairController);
	
	void atender (StairToSuitController stairToSuitController);
	
	void atender (StairToStairController stairToStairController);
	
	void atender (TurnOverInStairController turnOverInStair);
	
	void atender(ExitController exitController);


}
