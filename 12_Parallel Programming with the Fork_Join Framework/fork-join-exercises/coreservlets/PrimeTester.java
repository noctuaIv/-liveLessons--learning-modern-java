package coreservlets;

import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PrimeTester {

  /** Compares timing of parallel and sequential versions. Compares timing only
   *  for marking the boolean array, since the time to create the boolean array
   *  and the time to build a List from the boolean array are shared by
   *  both approaches.
   */
  public static void main(String[] args) {
    for(int i=3; i<8; i++) {
      int size = (int)Math.pow(10, i);
      String message1 = "Serial marking of   %,d numbers";
      String message2 = "Parallel marking of %,d numbers";
      
      boolean[] primeFlags = new boolean[size];
      TimingUtils.timeOp(new Op() {
        @Override
        public String runOp() {
          MathUtils.markPrimesSerial(primeFlags);
          return(String.format(message1, size));
        }
      });
      List<Integer> primes1 = MathUtils.collectPrimes(primeFlags);
      TimingUtils.timeOp(new Op() {
        @Override
        public String runOp() {
          MathUtils.markPrimesParallel(primeFlags);
          return(String.format(message2, size));
        }
      });
      List<Integer> primes2 = MathUtils.collectPrimes(primeFlags);
      System.out.printf("Serial version found %,d primes.%n", primes1.size());
      System.out.printf("Serial version found %,d as largest prime.%n", primes1.get(primes1.size()-1));
      System.out.printf("Parallel version found %,d primes.%n", primes2.size());
      System.out.printf("Parallel version found %,d as largest prime.%n%n", primes2.get(primes2.size()-1));
    }
  } 

  
  @Test
  public void testPrimes() {
    List<Integer> primes1 = MathUtils.findPrimesSerial(1_000_000);
    List<Integer> primes2 = MathUtils.findPrimesParallel(1_000_000);
    int size1 = primes1.size();
    int size2 = primes2.size();
    assertThat(size1, is(equalTo(size2))); // Same number of primes found
    assertThat(primes1.get(size1-1), is(equalTo(primes2.get(size2-1)))); // Same largest prime found
  }
}
