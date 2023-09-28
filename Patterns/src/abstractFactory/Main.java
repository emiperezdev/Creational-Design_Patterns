package abstractFactory;

import abstractFactory.ant.AntWidgetFactory;
import abstractFactory.app.ContactForm;
import abstractFactory.material.MaterialWidgetFactory;

public class Main {
  public static void main(String[] args) {
    new ContactForm().render(new AntWidgetFactory());
  }
}
