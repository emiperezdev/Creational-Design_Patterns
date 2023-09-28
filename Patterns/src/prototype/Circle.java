package prototype;

public class Circle implements Component {
  private int radius;
  @Override
  public void render() {
    System.out.println("Rendering a circle...");
    System.out.println("Radius: " + getRadius());
  }

  @Override
  public Component clone() {
    var newCircle = new Circle();
    newCircle.setRadius(radius);
    return newCircle;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
}
