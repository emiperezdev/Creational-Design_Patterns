package prototype;

public class Main {
  public static void main(String[] args) {
    var timeline = new TimeLineComponents();
    var text = new Text("Hello");
    timeline.add(text);

    var menu = new ContextMenu(timeline);
    menu.duplicate(text);
  }
}