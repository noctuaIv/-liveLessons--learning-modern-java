package coreservlets;

public class Ignorer implements Combiner<Void> {
  @Override
  public Void combine(Void v1, Void v2) {
    return(null);
  }
}
