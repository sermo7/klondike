package klondike.version100;

public class ExitView {

	private ExitController exitController;
	
	public ExitView(Controller controller){
		this.exitController = (ExitController) controller;
	}
	
	public void render() {
		IO io = new IO();
		io.writeln("Se acabó el juego");
	}
}

