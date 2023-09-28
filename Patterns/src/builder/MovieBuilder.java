package builder;

public class MovieBuilder implements PresentationBuilder {
  private Movie movie = new Movie();

  @Override
  public void addSlide(Slide slide) {
    movie.adFrame(slide.getText(), 3);
  }

  public Movie getMovie() {
    return movie;
  }
}
