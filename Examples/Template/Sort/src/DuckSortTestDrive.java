import java.util.Arrays;

public class DuckSortTestDrive {

  public static void main(String[] args) {

    Duck[] ducks = {
        new Duck("Jones", 5),
        new Duck("Donald", 15),
        new Duck("Lucas", 35),
        new Duck("Donald2", 15)
    };

    System.out.println("Before sorting");
    display(ducks);

    Arrays.sort(ducks);

    System.out.println("\nAfter sorting: ");
    display(ducks);
  }

  private static void display(Duck[] ducks) {
    Arrays.stream(ducks).forEach(System.out::println);
  }
}