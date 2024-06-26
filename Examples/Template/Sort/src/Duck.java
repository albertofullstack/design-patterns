public class Duck implements Comparable {

  private String name;
  private int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Duck{" +
        "name='" + name + '\'' +
        ", weight=" + weight +
        '}';
  }

  @Override
  public int compareTo(Object object) {

    Duck otherDuck = (Duck) object;

    if (this.weight < otherDuck.weight) {
      return -1;
    } else if (this.weight > otherDuck.weight) {
      return 1;
    }
    return 0;
  }
}
