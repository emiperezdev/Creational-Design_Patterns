package prototype;

public class Text implements Component {
  private String content;

  public Text(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  @Override
  public Component clone(Component component) {
    return new Text(this.getContent());
  }
}
