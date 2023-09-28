package prototype;

public class ContextMenu {
  private TimeLineComponents timeline;

  public ContextMenu(TimeLineComponents timeline) {
    this.timeline = timeline;
  }

  public void duplicate(Component component) {
    component.clone(component);
    timeline.add(component);
  }
}
