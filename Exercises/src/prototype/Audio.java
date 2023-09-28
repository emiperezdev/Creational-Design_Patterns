package prototype;

public class Audio implements Component {
  @Override
  public Component clone(Component component) {
    return new Audio();
  }
}
