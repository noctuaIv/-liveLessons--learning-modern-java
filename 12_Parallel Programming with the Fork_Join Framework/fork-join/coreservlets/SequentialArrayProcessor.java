package coreservlets;

public interface SequentialArrayProcessor<T,R> {
  R computeValue(T[] values, 
                 int lowIndex, 
                 int highIndex);
}
