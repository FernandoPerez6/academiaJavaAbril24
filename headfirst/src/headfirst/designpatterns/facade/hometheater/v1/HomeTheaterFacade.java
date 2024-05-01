package headfirst.designpatterns.facade.hometheater.v1;

public class HomeTheaterFacade {
	
	Amplifier amp = new Amplifier("Amplifier");
	Tuner tuner = new Tuner("AM/FM Tuner", amp);
	StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
	CdPlayer cd = new CdPlayer("CD Player", amp);
	Projector projector = new Projector("Projector", player);
	TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
	Screen screen = new Screen("Theater Screen");
	PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setStreamingPlayer(player);
		amp.setSurroundSound();
		amp.setVolume(5);
		player.on();
		player.play(movie);
	}
 
 
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		player.stop();
		player.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		tuner.on();
		tuner.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		tuner.off();
		amp.off();
	}
}
