package coreservlets;

public interface Funct<T,R> {
  R computeValue(T input);
}