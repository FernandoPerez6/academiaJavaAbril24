package headfirst.designpatterns.facade.hometheater.v2;

public abstract class HomeTheaterFacade {
	
	Amplifier amp = new Amplifier("Amplifier");
	Tuner tuner = new Tuner("AM/FM Tuner", amp);
	StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
	CdPlayer cd = new CdPlayer("CD Player", amp);
	Projector projector = new Projector("Projector", player);
	TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
	Screen screen = new Screen("Theater Screen");
	PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
	public abstract void watchMovie(String movie) ;
 
 
	public abstract void endMovie() ;

	public abstract void listenToRadio(double frequency);

	abstract public void endRadio();
}
