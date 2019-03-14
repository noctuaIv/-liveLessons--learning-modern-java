package coreservlets;

public interface Combiner<R> {
  R combine(R val1, R val2);
}