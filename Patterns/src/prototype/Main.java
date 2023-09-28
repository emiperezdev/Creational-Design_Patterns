package prototype;

public class Main {
  public static void main(String[] args) {
    var circle = new Circle();
    circle.setRadius(10);
    circle.render();

    var context = new ContextMenu();
    var duplicatedCircle = context.duplicate(circle);
    duplicatedCircle.render();
  }
}