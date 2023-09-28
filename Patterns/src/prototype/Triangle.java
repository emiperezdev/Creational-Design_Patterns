package prototype;

public class Triangle implements Component {
  private int width;
  private int height;
  @Override
  public void render() {
    System.out.println("Render a triangle...");
    System.out.println("Height: " + getHeight());
    System.out.println("Width: " + getWidth());
  }

  @Override
  public Component clone() {
    var newTriangle = new Triangle();
    newTriangle.setWidth(width);
    newTriangle.setHeight(height);
    return newTriangle;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
