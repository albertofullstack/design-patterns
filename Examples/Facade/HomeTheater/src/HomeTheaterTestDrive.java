public class HomeTheaterTestDrive {

  public static void main(String[] args) {

    PopcornPopper popcornPopper = new PopcornPopper("Popcorn machine");
    TheaterLights theaterLights = new TheaterLights("Lights");
    Amplifier amplifier = new Amplifier("Samsung amplifier");
    DvdPlayer dvdPlayer = new DvdPlayer("Xiaomi DvdPlayer", amplifier);
    Projector projector = new Projector("Samsung projector", dvdPlayer);
    Screen screen = new Screen("LG Screen");

    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popcornPopper,
        theaterLights, projector, screen, amplifier, dvdPlayer);
    homeTheaterFacade.watchMovie();
    System.out.println();
    homeTheaterFacade.endMovie();
  }
}