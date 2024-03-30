public class HomeTheaterFacade {

  private PopcornPopper popcornPopper;
  private TheaterLights theaterLights;
  private Projector projector;
  private Screen screen;
  private Amplifier amplifier;
  private DvdPlayer dvdPlayer;

  public HomeTheaterFacade(PopcornPopper popcornPopper, TheaterLights theaterLights,
      Projector projector, Screen screen, Amplifier amplifier, DvdPlayer dvdPlayer) {
    this.popcornPopper = popcornPopper;
    this.theaterLights = theaterLights;
    this.projector = projector;
    this.screen = screen;
    this.amplifier = amplifier;
    this.dvdPlayer = dvdPlayer;
  }

  public void watchMovie() {
    System.out.println("Get ready to watch a movie...");
    popcornPopper.on();
    popcornPopper.pop();

    theaterLights.dim(10);

    screen.down();

    projector.on();
    projector.wideScreenMode();

    amplifier.on();
    amplifier.setDvd(dvdPlayer);
    amplifier.setSurroundSound();
    amplifier.setVolume(5);

    dvdPlayer.on();
    dvdPlayer.play("Indiana Jones y el templo maldito");
  }

  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    popcornPopper.off();
    theaterLights.off();
    projector.off();
    amplifier.off();
    dvdPlayer.off();
    screen.up();
    dvdPlayer.stop();
    dvdPlayer.eject();
    dvdPlayer.off();
  }
}
