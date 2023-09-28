package prototype;

public class Clip implements Component {
  @Override
  public Component clone(Component component) {
    return new Clip();
  }
}
