package klondike.version100;

public class Klondike {

    private Card card;

    private Deck deck, discard;
    
    private Stair stair;

    private FinalSuit finalSuit;

    private StartController startController;

    private MoveControllerFactory colocateControllerFactory;

    private StartView startView;

    private GameView gameView;

    public Klondike() {
        deck = new Deck();
        discard = new Deck();
        stair = new Stair();
        finalSuit = new FinalSuit();
        colocateControllerFactory = new MoveControllerFactory(card, deck, discard, finalSuit, stair);
        gameView = new GameView(colocateControllerFactory);
        startController = new StartController(card, deck, discard, finalSuit, stair, colocateControllerFactory);
        startView = new StartView(startController);
    }

    public void play() {
        startView.render();
        gameView.render();
    }

    public static void main(String[] args) {
        new Klondike().play();
    }
}
